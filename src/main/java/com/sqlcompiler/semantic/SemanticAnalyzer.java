package com.sqlcompiler.semantic;

import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.parser.SQLParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Semantic analyzer for SQL queries.
 * Extends ANTLR's BaseVisitor to traverse the parse tree and perform:
 * - Identifier resolution (tables, columns)
 * - Type checking for expressions
 * - SQL-specific semantic constraint validation
 * <p>
 * Returns SQLType from visit methods for type inference and checking.
 */
public class SemanticAnalyzer extends SQLParserBaseVisitor<SQLType> {
    private final SymbolTable symbolTable;
    private final SemanticErrorListener errorListener;

    // Context for the current query being analyzed
    private final List<TableInfo> currentTables; // Tables available in FROM clause

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.errorListener = new SemanticErrorListener();
        this.currentTables = new ArrayList<>();
    }

    // ==================== Helper Methods for Identifiers ====================

    /**
     * Extracts the text from an identifier context.
     * Handles regular identifiers, quoted identifiers, and bracket identifiers.
     */
    private String getIdentifierText(SQLParser.IdentifierContext ctx) {
        if (ctx == null) return null;

        if (ctx.IDENT() != null) {
            return ctx.IDENT().getText();
        } else if (ctx.QUOTED_IDENT() != null) {
            String text = ctx.QUOTED_IDENT().getText();
            // Remove quotes (` or ")
            return text.substring(1, text.length() - 1);
        } else if (ctx.BRACKET_IDENT() != null) {
            String text = ctx.BRACKET_IDENT().getText();
            // Remove brackets [ and ]
            return text.substring(1, text.length() - 1);
        }
        return ctx.getText();
    }

    /**
     * Extracts the table name from a tableIdentifier context.
     * Handles schema-qualified names (schema.table) and simple names.
     */
    private String getTableIdentifierText(SQLParser.TableIdentifierContext ctx) {
        if (ctx == null) return null;

        // Get the identifier (ignoring schema for now)
        if (ctx.identifier() != null) {
            return getIdentifierText(ctx.identifier());
        }
        return ctx.getText();
    }

    /**
     * Main entry point for semantic analysis of a single query.
     * Analyzes a query and returns true if no semantic errors were found.
     */
    public boolean analyze(SQLParser.QueryContext tree) {
        symbolTable.clearQueryScope();
        currentTables.clear();
        visit(tree);
        return !errorListener.hasErrors();
    }

    /**
     * Analyzes a script containing multiple SQL statements.
     * The symbol table state persists across statements, allowing
     * CREATE TABLE followed by INSERT/SELECT on that table.
     *
     * @param tree The script parse tree
     * @return true if no semantic errors were found
     */
    public boolean analyzeScript(SQLParser.ScriptContext tree) {
        for (SQLParser.StatementContext stmt : tree.statement()) {
            // Clear per-statement context (aliases, current tables)
            symbolTable.clearQueryScope();
            currentTables.clear();

            // Analyze this statement
            visit(stmt);
        }
        return !errorListener.hasErrors();
    }

    /**
     * Analyzes a single statement.
     */
    public boolean analyzeStatement(SQLParser.StatementContext tree) {
        symbolTable.clearQueryScope();
        currentTables.clear();
        visit(tree);
        return !errorListener.hasErrors();
    }

    /**
     * Clears all errors (useful when processing multiple independent scripts).
     */
    public void clearErrors() {
        errorListener.getErrors().clear();
    }

    /**
     * Returns true if semantic errors were detected.
     */
    public boolean hasErrors() {
        return errorListener.hasErrors();
    }

    /**
     * Returns the list of semantic errors.
     */
    public List<SemanticError> getErrors() {
        return errorListener.getErrors();
    }

    /**
     * Prints all semantic errors to stderr.
     */
    public void printErrors() {
        errorListener.printErrors();
    }

    // ==================== DDL Statement Visitors ====================

    @Override
    public SQLType visitCreateTableStatement(SQLParser.CreateTableStatementContext ctx) {
        String tableName = getTableIdentifierText(ctx.tableIdentifier());
        boolean ifNotExists = ctx.IF() != null && ctx.NOT() != null && ctx.EXISTS() != null;

        // Check if table already exists
        if (symbolTable.hasTable(tableName)) {
            if (!ifNotExists) {
                errorListener.reportError(ctx.tableIdentifier(), SemanticErrorType.TABLE_ALREADY_EXISTS,
                        "Table '" + tableName + "' already exists");
            }
            return null;
        }

        // Create new table and validate columns
        TableInfo table = new TableInfo(tableName);
        List<String> columnNames = new ArrayList<>();
        boolean hasPrimaryKey = false;

        // Process column definitions
        for (SQLParser.ColumnDefinitionContext colDef : ctx.columnDefinitionList().columnDefinition()) {
            String colName = getIdentifierText(colDef.identifier());

            // Check for duplicate column names
            if (columnNames.contains(colName.toLowerCase())) {
                errorListener.reportError(colDef, SemanticErrorType.DUPLICATE_COLUMN_NAME,
                        "Duplicate column name: " + colName);
                continue;
            }
            columnNames.add(colName.toLowerCase());

            // Get column type
            SQLType sqlType = getDataType(colDef.dataType());
            boolean nullable = true;
            boolean isPrimaryKey = false;
            boolean isAutoIncrement = false;

            // Process column constraints
            for (SQLParser.ColumnConstraintContext constraint : colDef.columnConstraint()) {
                if (constraint instanceof SQLParser.NotNullConstraintContext) {
                    nullable = false;
                } else if (constraint instanceof SQLParser.NullConstraintContext) {
                    nullable = true;
                } else if (constraint instanceof SQLParser.PrimaryKeyColumnConstraintContext) {
                    if (hasPrimaryKey) {
                        errorListener.reportError(constraint, SemanticErrorType.MULTIPLE_PRIMARY_KEYS,
                                "Multiple primary key definitions");
                    }
                    hasPrimaryKey = true;
                    isPrimaryKey = true;
                    nullable = false;
                } else if (constraint instanceof SQLParser.AutoIncrementConstraintContext) {
                    isAutoIncrement = true;
                    if (!sqlType.isNumeric() && sqlType != SQLType.UNKNOWN) {
                        errorListener.reportError(constraint, SemanticErrorType.INVALID_AUTO_INCREMENT,
                                "AUTO_INCREMENT can only be used with numeric types");
                    }
                } else if (constraint instanceof SQLParser.DefaultConstraintContext) {
                    SQLParser.DefaultConstraintContext defaultCtx =
                            (SQLParser.DefaultConstraintContext) constraint;
                    SQLType defaultType = visit(defaultCtx.literal());
                    if (defaultType != SQLType.NULL && defaultType != SQLType.UNKNOWN
                            && !sqlType.isComparableTo(defaultType)) {
                        errorListener.reportError(constraint, SemanticErrorType.INVALID_DEFAULT_VALUE,
                                String.format("Default value type %s is incompatible with column type %s",
                                        defaultType, sqlType));
                    }
                } else if (constraint instanceof SQLParser.ReferencesConstraintContext) {
                    SQLParser.ReferencesConstraintContext refCtx =
                            (SQLParser.ReferencesConstraintContext) constraint;
                    String refTable = getTableIdentifierText(refCtx.tableIdentifier());
                    if (!symbolTable.hasTable(refTable)) {
                        errorListener.reportError(refCtx, SemanticErrorType.REFERENCED_TABLE_NOT_EXISTS,
                                "Referenced table does not exist: " + refTable);
                    }
                } else if (constraint instanceof SQLParser.CheckColumnConstraintContext) {
                    SQLParser.CheckColumnConstraintContext checkCtx =
                            (SQLParser.CheckColumnConstraintContext) constraint;
                    SQLType checkType = visit(checkCtx.expression());
                    if (checkType != SQLType.BOOLEAN && checkType != SQLType.UNKNOWN) {
                        errorListener.reportError(checkCtx, SemanticErrorType.INVALID_CHECK_CONSTRAINT,
                                "CHECK constraint must evaluate to boolean");
                    }
                }
            }

            ColumnInfo column = new ColumnInfo(colName, sqlType, nullable);
            table.addColumn(column);

            if (isPrimaryKey) {
                List<String> pkCols = new ArrayList<>();
                pkCols.add(colName);
                table.setPrimaryKey(pkCols);
            }
        }

        // Process table constraints
        for (SQLParser.TableConstraintContext constraint : ctx.tableConstraint()) {
            processTableConstraint(table, constraint, hasPrimaryKey);
            if (constraint instanceof SQLParser.PrimaryKeyTableConstraintContext) {
                hasPrimaryKey = true;
            }
        }

        // Register the table in the symbol table
        symbolTable.registerTable(table);
        return null;
    }

    /**
     * Gets the SQLType from a dataType context.
     */
    private SQLType getDataType(SQLParser.DataTypeContext ctx) {
        if (ctx instanceof SQLParser.IntTypeContext ||
                ctx instanceof SQLParser.IntegerTypeContext ||
                ctx instanceof SQLParser.BigintTypeContext ||
                ctx instanceof SQLParser.SmallintTypeContext ||
                ctx instanceof SQLParser.TinyintTypeContext) {
            return SQLType.INTEGER;
        }
        if (ctx instanceof SQLParser.FloatTypeContext ||
                ctx instanceof SQLParser.DoubleTypeContext ||
                ctx instanceof SQLParser.DecimalTypeContext ||
                ctx instanceof SQLParser.NumericTypeContext) {
            return SQLType.FLOAT;
        }
        if (ctx instanceof SQLParser.VarcharTypeContext ||
                ctx instanceof SQLParser.NvarcharTypeContext ||
                ctx instanceof SQLParser.CharTypeContext ||
                ctx instanceof SQLParser.NcharTypeContext ||
                ctx instanceof SQLParser.TextTypeContext ||
                ctx instanceof SQLParser.NtextTypeContext ||
                ctx instanceof SQLParser.BlobTypeContext) {
            return SQLType.STRING;
        }
        if (ctx instanceof SQLParser.BooleanTypeContext ||
                ctx instanceof SQLParser.BoolTypeContext) {
            return SQLType.BOOLEAN;
        }
        if (ctx instanceof SQLParser.DateTypeContext ||
                ctx instanceof SQLParser.DatetimeTypeContext ||
                ctx instanceof SQLParser.TimestampTypeContext ||
                ctx instanceof SQLParser.TimeTypeContext) {
            return SQLType.STRING; // Treat date/time as strings for now
        }
        return SQLType.UNKNOWN;
    }

    /**
     * Processes table-level constraints.
     */
    private void processTableConstraint(TableInfo table, SQLParser.TableConstraintContext ctx,
                                        boolean hasPrimaryKey) {
        if (ctx instanceof SQLParser.PrimaryKeyTableConstraintContext) {
            SQLParser.PrimaryKeyTableConstraintContext pkCtx =
                    (SQLParser.PrimaryKeyTableConstraintContext) ctx;
            if (hasPrimaryKey) {
                errorListener.reportError(ctx, SemanticErrorType.MULTIPLE_PRIMARY_KEYS,
                        "Multiple primary key definitions");
                return;
            }
            List<String> pkColumns = new ArrayList<>();
            for (var ident : pkCtx.columnNameList().identifier()) {
                String colName = getIdentifierText(ident);
                if (!table.hasColumn(colName)) {
                    errorListener.reportError(ctx, SemanticErrorType.UNDEFINED_COLUMN,
                            "Primary key column does not exist: " + colName);
                }
                pkColumns.add(colName);
            }
            table.setPrimaryKey(pkColumns);
        } else if (ctx instanceof SQLParser.UniqueTableConstraintContext) {
            SQLParser.UniqueTableConstraintContext uniqueCtx =
                    (SQLParser.UniqueTableConstraintContext) ctx;
            List<String> uniqueCols = new ArrayList<>();
            for (var ident : uniqueCtx.columnNameList().identifier()) {
                String colName = getIdentifierText(ident);
                if (!table.hasColumn(colName)) {
                    errorListener.reportError(ctx, SemanticErrorType.UNDEFINED_COLUMN,
                            "Unique constraint column does not exist: " + colName);
                }
                uniqueCols.add(colName);
            }
            String constraintName = uniqueCtx.identifier() != null ?
                    getIdentifierText(uniqueCtx.identifier()) : "unique_" + String.join("_", uniqueCols);
            table.addUniqueConstraint(constraintName, uniqueCols);
        } else if (ctx instanceof SQLParser.ForeignKeyConstraintContext) {
            SQLParser.ForeignKeyConstraintContext fkCtx =
                    (SQLParser.ForeignKeyConstraintContext) ctx;

            List<String> fkColumns = new ArrayList<>();
            for (var ident : fkCtx.columnNameList(0).identifier()) {
                String colName = getIdentifierText(ident);
                if (!table.hasColumn(colName)) {
                    errorListener.reportError(ctx, SemanticErrorType.UNDEFINED_COLUMN,
                            "Foreign key column does not exist: " + colName);
                }
                fkColumns.add(colName);
            }

            String refTableName = getTableIdentifierText(fkCtx.tableIdentifier());
            TableInfo refTable = symbolTable.resolveTable(refTableName);
            if (refTable == null) {
                errorListener.reportError(fkCtx.tableIdentifier(),
                        SemanticErrorType.REFERENCED_TABLE_NOT_EXISTS,
                        "Referenced table does not exist: " + refTableName);
            }

            List<String> refColumns = new ArrayList<>();
            for (var ident : fkCtx.columnNameList(1).identifier()) {
                String colName = getIdentifierText(ident);
                if (refTable != null && !refTable.hasColumn(colName)) {
                    errorListener.reportError(ctx, SemanticErrorType.REFERENCED_COLUMN_NOT_EXISTS,
                            "Referenced column does not exist: " + colName);
                }
                refColumns.add(colName);
            }

            if (fkColumns.size() != refColumns.size()) {
                errorListener.reportError(ctx, SemanticErrorType.FOREIGN_KEY_COLUMN_COUNT_MISMATCH,
                        "Foreign key column count does not match referenced column count");
            }

            String constraintName = fkCtx.identifier() != null ?
                    getIdentifierText(fkCtx.identifier()) : "fk_" + String.join("_", fkColumns);
            table.addForeignKey(constraintName, fkColumns, refTableName, refColumns);
        } else if (ctx instanceof SQLParser.CheckTableConstraintContext) {
            SQLParser.CheckTableConstraintContext checkCtx =
                    (SQLParser.CheckTableConstraintContext) ctx;
            SQLType checkType = visit(checkCtx.expression());
            if (checkType != SQLType.BOOLEAN && checkType != SQLType.UNKNOWN) {
                errorListener.reportError(checkCtx, SemanticErrorType.INVALID_CHECK_CONSTRAINT,
                        "CHECK constraint must evaluate to boolean");
            }
        } else if (ctx instanceof SQLParser.NamedConstraintContext) {
            SQLParser.NamedConstraintContext namedCtx = (SQLParser.NamedConstraintContext) ctx;
            processTableConstraint(table, namedCtx.tableConstraint(), hasPrimaryKey);
        }
    }

    @Override
    public SQLType visitDropTableStatement(SQLParser.DropTableStatementContext ctx) {
        String tableName = getTableIdentifierText(ctx.tableIdentifier());
        boolean ifExists = ctx.IF() != null && ctx.EXISTS() != null;

        TableInfo table = symbolTable.resolveTable(tableName);
        if (table == null) {
            if (!ifExists) {
                errorListener.reportError(ctx.tableIdentifier(), SemanticErrorType.TABLE_NOT_EXISTS,
                        "Table does not exist: " + tableName);
            }
            return null;
        }

        // Check if any other table references this table via foreign key
        // (only if CASCADE is not specified)
        if (ctx.CASCADE() == null) {
            for (String otherTableName : symbolTable.getCatalogTableNames()) {
                if (otherTableName.equalsIgnoreCase(tableName)) continue;
                TableInfo otherTable = symbolTable.resolveTable(otherTableName);
                for (var fk : otherTable.getForeignKeys().values()) {
                    if (fk.getReferencedTable().equalsIgnoreCase(tableName)) {
                        errorListener.reportError(ctx, SemanticErrorType.CANNOT_DROP_REFERENCED_TABLE,
                                "Cannot drop table '" + tableName +
                                        "' referenced by foreign key in table '" + otherTableName + "'");
                        return null;
                    }
                }
            }
        }

        // Remove the table
        symbolTable.removeTable(tableName);
        return null;
    }

    @Override
    public SQLType visitAlterTableStatement(SQLParser.AlterTableStatementContext ctx) {
        String tableName = getTableIdentifierText(ctx.tableIdentifier());
        TableInfo table = symbolTable.resolveTable(tableName);

        if (table == null) {
            errorListener.reportError(ctx.tableIdentifier(), SemanticErrorType.UNDEFINED_TABLE,
                    "Table does not exist: " + tableName);
            return null;
        }

        // Process each alter action
        for (SQLParser.AlterActionContext action : ctx.alterAction()) {
            processAlterAction(table, action);
        }

        return null;
    }

    /**
     * Processes an ALTER TABLE action.
     */
    private void processAlterAction(TableInfo table, SQLParser.AlterActionContext ctx) {
        if (ctx instanceof SQLParser.AddColumnContext) {
            SQLParser.AddColumnContext addCtx = (SQLParser.AddColumnContext) ctx;
            SQLParser.ColumnDefinitionContext colDef = addCtx.columnDefinition();
            String colName = getIdentifierText(colDef.identifier());

            if (table.hasColumn(colName)) {
                errorListener.reportError(colDef, SemanticErrorType.COLUMN_ALREADY_EXISTS,
                        "Column already exists: " + colName);
                return;
            }

            SQLType sqlType = getDataType(colDef.dataType());
            boolean nullable = true;

            for (SQLParser.ColumnConstraintContext constraint : colDef.columnConstraint()) {
                if (constraint instanceof SQLParser.NotNullConstraintContext) {
                    nullable = false;
                }
            }

            ColumnInfo column = new ColumnInfo(colName, sqlType, nullable);
            table.addColumn(column);

        } else if (ctx instanceof SQLParser.DropColumnContext) {
            SQLParser.DropColumnContext dropCtx = (SQLParser.DropColumnContext) ctx;
            String colName = getIdentifierText(dropCtx.identifier());

            if (!table.hasColumn(colName)) {
                errorListener.reportError(dropCtx, SemanticErrorType.COLUMN_NOT_EXISTS,
                        "Column does not exist: " + colName);
                return;
            }

            if (table.isPrimaryKeyColumn(colName)) {
                errorListener.reportError(dropCtx, SemanticErrorType.CANNOT_DROP_PRIMARY_KEY_COLUMN,
                        "Cannot drop column that is part of primary key: " + colName);
                return;
            }

            table.removeColumn(colName);

        } else if (ctx instanceof SQLParser.ModifyColumnContext) {
            SQLParser.ModifyColumnContext modifyCtx = (SQLParser.ModifyColumnContext) ctx;
            String colName = getIdentifierText(modifyCtx.identifier());

            if (!table.hasColumn(colName)) {
                errorListener.reportError(modifyCtx, SemanticErrorType.COLUMN_NOT_EXISTS,
                        "Column does not exist: " + colName);
                return;
            }

            SQLType sqlType = getDataType(modifyCtx.dataType());
            boolean nullable = true;

            for (SQLParser.ColumnConstraintContext constraint : modifyCtx.columnConstraint()) {
                if (constraint instanceof SQLParser.NotNullConstraintContext) {
                    nullable = false;
                }
            }

            // Remove old column and add new one with same name
            table.removeColumn(colName);
            table.addColumn(new ColumnInfo(colName, sqlType, nullable));

        } else if (ctx instanceof SQLParser.ChangeColumnContext) {
            SQLParser.ChangeColumnContext changeCtx = (SQLParser.ChangeColumnContext) ctx;
            String oldName = getIdentifierText(changeCtx.identifier(0));
            String newName = getIdentifierText(changeCtx.identifier(1));

            if (!table.hasColumn(oldName)) {
                errorListener.reportError(changeCtx, SemanticErrorType.COLUMN_NOT_EXISTS,
                        "Column does not exist: " + oldName);
                return;
            }

            if (!oldName.equalsIgnoreCase(newName) && table.hasColumn(newName)) {
                errorListener.reportError(changeCtx, SemanticErrorType.COLUMN_ALREADY_EXISTS,
                        "Column already exists: " + newName);
                return;
            }

            SQLType sqlType = getDataType(changeCtx.dataType());
            boolean nullable = true;

            for (SQLParser.ColumnConstraintContext constraint : changeCtx.columnConstraint()) {
                if (constraint instanceof SQLParser.NotNullConstraintContext) {
                    nullable = false;
                }
            }

            table.removeColumn(oldName);
            table.addColumn(new ColumnInfo(newName, sqlType, nullable));

        } else if (ctx instanceof SQLParser.RenameTableContext) {
            SQLParser.RenameTableContext renameCtx = (SQLParser.RenameTableContext) ctx;
            String newName = getTableIdentifierText(renameCtx.tableIdentifier());

            if (symbolTable.hasTable(newName)) {
                errorListener.reportError(renameCtx, SemanticErrorType.TABLE_ALREADY_EXISTS,
                        "Table already exists: " + newName);
                return;
            }

            symbolTable.renameTable(table.getName(), newName);

        } else if (ctx instanceof SQLParser.RenameColumnContext) {
            SQLParser.RenameColumnContext renameCtx = (SQLParser.RenameColumnContext) ctx;
            String oldName = getIdentifierText(renameCtx.identifier(0));
            String newName = getIdentifierText(renameCtx.identifier(1));

            if (!table.hasColumn(oldName)) {
                errorListener.reportError(renameCtx, SemanticErrorType.COLUMN_NOT_EXISTS,
                        "Column does not exist: " + oldName);
                return;
            }

            if (table.hasColumn(newName)) {
                errorListener.reportError(renameCtx, SemanticErrorType.COLUMN_ALREADY_EXISTS,
                        "Column already exists: " + newName);
                return;
            }

            // Get old column info and recreate with new name
            ColumnInfo oldCol = table.getColumn(oldName);
            table.removeColumn(oldName);
            table.addColumn(new ColumnInfo(newName, oldCol.getType(), oldCol.isNullable()));

        } else if (ctx instanceof SQLParser.DropConstraintContext) {
            SQLParser.DropConstraintContext dropCtx = (SQLParser.DropConstraintContext) ctx;
            String constraintName = getIdentifierText(dropCtx.identifier());

            if (!table.removeConstraint(constraintName)) {
                errorListener.reportError(dropCtx, SemanticErrorType.CONSTRAINT_NOT_EXISTS,
                        "Constraint does not exist: " + constraintName);
            }

        } else if (ctx instanceof SQLParser.AddConstraintContext) {
            SQLParser.AddConstraintContext addCtx = (SQLParser.AddConstraintContext) ctx;
            processTableConstraint(table, addCtx.tableConstraint(), table.hasPrimaryKey());
        }
    }

    @Override
    public SQLType visitTruncateTableStatement(SQLParser.TruncateTableStatementContext ctx) {
        String tableName = getTableIdentifierText(ctx.tableIdentifier());

        if (!symbolTable.hasTable(tableName)) {
            errorListener.reportError(ctx.tableIdentifier(), SemanticErrorType.TABLE_NOT_EXISTS,
                    "Table does not exist: " + tableName);
        }

        return null;
    }

    @Override
    public SQLType visitCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx) {
        String indexName = getIdentifierText(ctx.identifier());
        String tableName = getTableIdentifierText(ctx.tableIdentifier());
        boolean ifNotExists = ctx.IF() != null && ctx.NOT() != null && ctx.EXISTS() != null;

        TableInfo table = symbolTable.resolveTable(tableName);
        if (table == null) {
            errorListener.reportError(ctx.tableIdentifier(), SemanticErrorType.UNDEFINED_TABLE,
                    "Table does not exist: " + tableName);
            return null;
        }

        if (table.hasIndex(indexName)) {
            if (!ifNotExists) {
                errorListener.reportError(ctx, SemanticErrorType.INDEX_ALREADY_EXISTS,
                        "Index already exists: " + indexName);
            }
            return null;
        }

        // Validate index columns
        for (SQLParser.IndexColumnContext indexCol : ctx.indexColumnList().indexColumn()) {
            String colName = getIdentifierText(indexCol.identifier());
            if (!table.hasColumn(colName)) {
                errorListener.reportError(indexCol, SemanticErrorType.UNDEFINED_COLUMN,
                        "Column does not exist: " + colName);
            }
        }

        // Register the index (simplified - just first column)
        if (!ctx.indexColumnList().indexColumn().isEmpty()) {
            String firstCol = getIdentifierText(ctx.indexColumnList().indexColumn(0).identifier());
            table.addIndex(indexName, firstCol);
        }

        return null;
    }

    @Override
    public SQLType visitDropIndexStatement(SQLParser.DropIndexStatementContext ctx) {
        String indexName = getIdentifierText(ctx.identifier());
        boolean ifExists = ctx.IF() != null && ctx.EXISTS() != null;

        if (ctx.tableIdentifier() != null) {
            String tableName = getTableIdentifierText(ctx.tableIdentifier());
            TableInfo table = symbolTable.resolveTable(tableName);

            if (table == null) {
                errorListener.reportError(ctx.tableIdentifier(), SemanticErrorType.UNDEFINED_TABLE,
                        "Table does not exist: " + tableName);
                return null;
            }

            if (!table.hasIndex(indexName)) {
                if (!ifExists) {
                    errorListener.reportError(ctx, SemanticErrorType.INDEX_NOT_EXISTS,
                            "Index does not exist: " + indexName);
                }
                return null;
            }

            table.removeIndex(indexName);
        } else {
            // Search all tables for the index
            boolean found = false;
            for (String tableName : symbolTable.getCatalogTableNames()) {
                TableInfo table = symbolTable.resolveTable(tableName);
                if (table.hasIndex(indexName)) {
                    table.removeIndex(indexName);
                    found = true;
                    break;
                }
            }
            if (!found && !ifExists) {
                errorListener.reportError(ctx, SemanticErrorType.INDEX_NOT_EXISTS,
                        "Index does not exist: " + indexName);
            }
        }

        return null;
    }

    @Override
    public SQLType visitCreateDatabaseStatement(SQLParser.CreateDatabaseStatementContext ctx) {
        // Database creation is typically handled at a higher level
        // For now, just validate syntax
        return null;
    }

    @Override
    public SQLType visitDropDatabaseStatement(SQLParser.DropDatabaseStatementContext ctx) {
        // Database dropping is typically handled at a higher level
        // For now, just validate syntax
        return null;
    }

    // ==================== CTE (Common Table Expression) Visitors ====================
    // Note: Syntax-only support - no semantic validation of CTE references

    @Override
    public SQLType visitCteStatement(SQLParser.CteStatementContext ctx) {
        // Visit the CTE definition (SELECT inside the WITH clause)
        if (ctx.selectStatement() != null) {
            visit(ctx.selectStatement());
        }
        
        // Visit the main statement that uses the CTE
        if (ctx.cteSelectStatement() != null) {
            visit(ctx.cteSelectStatement());
        } else if (ctx.cteUpdateStatement() != null) {
            visit(ctx.cteUpdateStatement());
        } else if (ctx.cteDeleteStatement() != null) {
            visit(ctx.cteDeleteStatement());
        }
        
        return null;
    }

    @Override
    public SQLType visitCteSelectStatement(SQLParser.CteSelectStatementContext ctx) {
        // Process FROM clause
        if (ctx.tableName() != null) {
            processTableReference(ctx.tableName());
        }
        
        // Process SELECT list
        if (ctx.selectList() != null) {
            visit(ctx.selectList());
        }
        
        // Process WHERE clause
        List<SQLParser.ExpressionContext> expressions = ctx.expression();
        if (ctx.WHERE() != null && !expressions.isEmpty()) {
            visit(expressions.get(0));
        }
        
        return null;
    }

    @Override
    public SQLType visitCteUpdateStatement(SQLParser.CteUpdateStatementContext ctx) {
        // Process table reference
        if (ctx.tableName() != null) {
            processTableReference(ctx.tableName());
        }
        
        // Process assignments
        if (ctx.assignmentList() != null) {
            visit(ctx.assignmentList());
        }
        
        // Process WHERE clause
        if (ctx.expression() != null) {
            visit(ctx.expression());
        }
        
        return null;
    }

    @Override
    public SQLType visitCteDeleteStatement(SQLParser.CteDeleteStatementContext ctx) {
        // Process table reference
        if (ctx.tableName() != null) {
            processTableReference(ctx.tableName());
        }
        
        // Process WHERE clause
        if (ctx.expression() != null) {
            visit(ctx.expression());
        }
        
        return null;
    }

    // ==================== Cursor Declaration Visitor ====================
    // Note: Syntax-only support - no state tracking or runtime behavior

    @Override
    public SQLType visitDeclareCursorStatement(SQLParser.DeclareCursorStatementContext ctx) {
        // Just visit the SELECT statement inside the cursor declaration
        // No semantic validation - cursor name is not tracked
        if (ctx.selectStatement() != null) {
            visit(ctx.selectStatement());
        }
        return null;
    }

    // ==================== DML Statement Visitors ====================

    @Override
    public SQLType visitSelectStatement(SQLParser.SelectStatementContext ctx) {
        // 1. Process FROM clause first to establish table context
        if (ctx.tableName() != null) {
            processTableReference(ctx.tableName());
        }

        // 2. Process SELECT list
        if (ctx.selectList() != null) {
            visit(ctx.selectList());
        }

        // 3. Process WHERE clause (must be boolean)
        // expression() returns a list - index 0 is WHERE, index 1 is HAVING (if present)
        List<SQLParser.ExpressionContext> expressions = ctx.expression();
        if (ctx.WHERE() != null && !expressions.isEmpty()) {
            SQLParser.ExpressionContext whereExpr = expressions.get(0);
            SQLType whereType = visit(whereExpr);
            if (whereType != SQLType.BOOLEAN && whereType != SQLType.UNKNOWN) {
                errorListener.reportError(whereExpr, SemanticErrorType.NON_BOOLEAN_WHERE,
                        "WHERE clause must evaluate to a boolean, found: " + whereType);
            }
        }

        // 4. Process GROUP BY columns
        if (ctx.GROUP() != null && ctx.columnList() != null) {
            for (SQLParser.ColumnContext col : ctx.columnList().column()) {
                visit(col);
            }
        }

        // 5. Process HAVING clause (must be boolean)
        // HAVING expression is at index 1 if WHERE exists, or index 0 if only HAVING
        if (ctx.HAVING() != null) {
            int havingIndex = (ctx.WHERE() != null) ? 1 : 0;
            if (expressions.size() > havingIndex) {
                SQLParser.ExpressionContext havingExpr = expressions.get(havingIndex);
                SQLType havingType = visit(havingExpr);
                if (havingType != SQLType.BOOLEAN && havingType != SQLType.UNKNOWN) {
                    errorListener.reportError(havingExpr, SemanticErrorType.NON_BOOLEAN_HAVING,
                            "HAVING clause must evaluate to a boolean, found: " + havingType);
                }
            }
        }

        // 6. Process ORDER BY columns
        if (ctx.orderByList() != null) {
            visit(ctx.orderByList());
        }

        return null; // Statements don't have a type
    }

    @Override
    public SQLType visitInsertStatement(SQLParser.InsertStatementContext ctx) {
        // 1. Validate table exists
        TableInfo table = null;
        if (ctx.tableName() != null) {
            String tableName = getTableNameText(ctx.tableName());
            table = symbolTable.resolveTable(tableName);
            if (table == null) {
                errorListener.reportError(ctx.tableName(), SemanticErrorType.UNDEFINED_TABLE,
                        "Unknown table: " + tableName);
            }
        }

        // 2. Validate column count matches value count
        if (ctx.columnList() != null && ctx.valueList() != null) {
            int columnCount = ctx.columnList().column().size();
            int valueCount = ctx.valueList().valueItem().size();
            if (columnCount != valueCount) {
                errorListener.reportError(ctx, SemanticErrorType.COLUMN_COUNT_MISMATCH,
                        String.format("Column count (%d) does not match value count (%d)",
                                columnCount, valueCount));
            }

            // 3. Validate columns exist in table
            if (table != null) {
                for (SQLParser.ColumnContext col : ctx.columnList().column()) {
                    if (col instanceof SQLParser.ColumnNameContext) {
                        SQLParser.ColumnNameContext colName = (SQLParser.ColumnNameContext) col;
                        String name = getIdentifierText(colName.identifier(0));
                        if (!table.hasColumn(name)) {
                            errorListener.reportError(col, SemanticErrorType.UNDEFINED_COLUMN,
                                    "Unknown column '" + name + "' in table '" + table.getName() + "'");
                        }
                    }
                }
            }
        }

        // 4. Type check values
        if (ctx.valueList() != null) {
            for (SQLParser.ValueItemContext item : ctx.valueList().valueItem()) {
                visit(item);
            }
        }

        return null;
    }

    @Override
    public SQLType visitUpdateStatement(SQLParser.UpdateStatementContext ctx) {
        // 1. Validate and register table
        if (ctx.tableName() != null) {
            processTableReference(ctx.tableName());
        }

        // 2. Validate assignments
        if (ctx.assignmentList() != null) {
            visit(ctx.assignmentList());
        }

        // 3. Validate WHERE clause
        if (ctx.expression() != null) {
            SQLType whereType = visit(ctx.expression());
            if (whereType != SQLType.BOOLEAN && whereType != SQLType.UNKNOWN) {
                errorListener.reportError(ctx.expression(), SemanticErrorType.NON_BOOLEAN_WHERE,
                        "WHERE clause must evaluate to a boolean, found: " + whereType);
            }
        }

        return null;
    }

    @Override
    public SQLType visitDeleteStatement(SQLParser.DeleteStatementContext ctx) {
        // 1. Validate table exists
        if (ctx.tableName() != null) {
            processTableReference(ctx.tableName());
        }

        // 2. Validate WHERE clause
        if (ctx.expression() != null) {
            SQLType whereType = visit(ctx.expression());
            if (whereType != SQLType.BOOLEAN && whereType != SQLType.UNKNOWN) {
                errorListener.reportError(ctx.expression(), SemanticErrorType.NON_BOOLEAN_WHERE,
                        "WHERE clause must evaluate to a boolean, found: " + whereType);
            }
        }

        return null;
    }

    // ==================== SELECT List Visitors ====================

    @Override
    public SQLType visitSelectAll(SQLParser.SelectAllContext ctx) {
        // SELECT * requires at least one table in context
        if (currentTables.isEmpty()) {
            errorListener.reportError(ctx, SemanticErrorType.SELECT_ALL_NO_TABLE,
                    "SELECT * requires a valid table in FROM clause");
        }
        return null;
    }

    @Override
    public SQLType visitSelectColumns(SQLParser.SelectColumnsContext ctx) {
        // Visit each column and register aliases
        for (SQLParser.ColumnContext col : ctx.columnList().column()) {
            SQLType type = visit(col);

            // Register column alias if present
            if (col instanceof SQLParser.ColumnNameContext) {
                SQLParser.ColumnNameContext colName = (SQLParser.ColumnNameContext) col;
                // If there's an AS clause, the second identifier is the alias
                if (colName.AS() != null && colName.identifier().size() > 1) {
                    String alias = getIdentifierText(colName.identifier(colName.identifier().size() - 1));
                    symbolTable.registerColumnAlias(alias, type != null ? type : SQLType.UNKNOWN);
                }
            } else if (col instanceof SQLParser.ColumnWithExpressionContext) {
                SQLParser.ColumnWithExpressionContext colExpr = (SQLParser.ColumnWithExpressionContext) col;
                if (colExpr.AS() != null && colExpr.identifier() != null) {
                    String alias = getIdentifierText(colExpr.identifier());
                    symbolTable.registerColumnAlias(alias, type != null ? type : SQLType.UNKNOWN);
                }
            }
        }
        return null;
    }

    // ==================== Column Visitors ====================

    @Override
    public SQLType visitColumnName(SQLParser.ColumnNameContext ctx) {
        String tableName = null;
        String columnName;

        if (ctx.tableName() != null) {
            // Qualified: table.column
            tableName = getTableNameText(ctx.tableName());
            columnName = getIdentifierText(ctx.identifier(0));
        } else {
            // Unqualified: just column
            columnName = getIdentifierText(ctx.identifier(0));
        }

        return resolveColumnReference(tableName, columnName, ctx.getStart());
    }

    @Override
    public SQLType visitColumnReference(SQLParser.ColumnReferenceContext ctx) {
        String tableName = null;
        String columnName;

        if (ctx.tableName() != null) {
            tableName = getTableNameText(ctx.tableName());
        }
        columnName = getIdentifierText(ctx.identifier());

        return resolveColumnReference(tableName, columnName, ctx.getStart());
    }

    /**
     * Gets the table name from a tableName context (handles both qualified and simple).
     */
    private String getTableNameText(SQLParser.TableNameContext ctx) {
        if (ctx instanceof SQLParser.QualifiedTableNameContext) {
            SQLParser.QualifiedTableNameContext qualified = (SQLParser.QualifiedTableNameContext) ctx;
            return getIdentifierText(qualified.identifier(0)); // Return just the table name, not schema
        } else if (ctx instanceof SQLParser.SimpleTableNameContext) {
            SQLParser.SimpleTableNameContext simple = (SQLParser.SimpleTableNameContext) ctx;
            return getIdentifierText(simple.identifier(0));
        }
        return ctx.getText();
    }

    /**
     * Helper method to resolve a column reference against the symbol table.
     */
    private SQLType resolveColumnReference(String tableName, String columnName, Token token) {
        // First check if it's a column alias
        if (tableName == null && symbolTable.isColumnAlias(columnName)) {
            return symbolTable.resolveColumnAlias(columnName);
        }

        // Check for ambiguous reference
        if (tableName == null && symbolTable.isColumnAmbiguous(columnName, currentTables)) {
            errorListener.reportError(token, SemanticErrorType.AMBIGUOUS_COLUMN,
                    "Ambiguous column reference: " + columnName);
            return SQLType.UNKNOWN;
        }

        // Resolve column against available tables
        ColumnInfo column = symbolTable.resolveColumn(tableName, columnName, currentTables);
        if (column != null) {
            return column.getType();
        }

        // Column not found
        if (tableName != null) {
            errorListener.reportError(token, SemanticErrorType.UNDEFINED_COLUMN,
                    String.format("Unknown column '%s' in table '%s'", columnName, tableName));
        } else if (!currentTables.isEmpty()) {
            errorListener.reportError(token, SemanticErrorType.UNDEFINED_COLUMN,
                    "Unknown column: " + columnName);
        }
        // If no tables in context, might be a user variable or forward reference
        return SQLType.UNKNOWN;
    }

    // ==================== Expression Visitors ====================

    @Override
    public SQLType visitExpression(SQLParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public SQLType visitLogicalOrExpression(SQLParser.LogicalOrExpressionContext ctx) {
        List<SQLParser.LogicalAndExpressionContext> operands = ctx.logicalAndExpression();

        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // OR requires boolean operands
        for (SQLParser.LogicalAndExpressionContext operand : operands) {
            SQLType type = visit(operand);
            if (type != SQLType.BOOLEAN && type != SQLType.UNKNOWN && type != SQLType.NULL) {
                errorListener.reportError(operand, SemanticErrorType.INVALID_LOGICAL_OPERAND,
                        "OR operator requires boolean operands, found: " + type);
            }
        }
        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitLogicalAndExpression(SQLParser.LogicalAndExpressionContext ctx) {
        List<SQLParser.ComparisonExpressionContext> operands = ctx.comparisonExpression();

        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // AND requires boolean operands
        for (SQLParser.ComparisonExpressionContext operand : operands) {
            SQLType type = visit(operand);
            if (type != SQLType.BOOLEAN && type != SQLType.UNKNOWN && type != SQLType.NULL) {
                errorListener.reportError(operand, SemanticErrorType.INVALID_LOGICAL_OPERAND,
                        "AND operator requires boolean operands, found: " + type);
            }
        }
        return SQLType.BOOLEAN;
    }

    // ==================== Comparison Expression Visitors ====================

    @Override
    public SQLType visitSimpleComparison(SQLParser.SimpleComparisonContext ctx) {
        List<SQLParser.AdditiveExpressionContext> operands = ctx.additiveExpression();

        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // Comparison: check type compatibility
        SQLType left = visit(operands.get(0));
        SQLType right = visit(operands.get(1));

        if (!left.isComparableTo(right)) {
            errorListener.reportError(ctx, SemanticErrorType.INVALID_COMPARISON_OPERAND,
                    String.format("Cannot compare %s with %s", left, right));
        }

        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitInExpression(SQLParser.InExpressionContext ctx) {
        // Visit the left operand
        SQLType leftType = visit(ctx.additiveExpression());

        // Visit each value in the list
        for (SQLParser.ValueItemContext item : ctx.valueList().valueItem()) {
            visit(item);
        }

        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitNotInExpression(SQLParser.NotInExpressionContext ctx) {
        // Visit the left operand
        SQLType leftType = visit(ctx.additiveExpression());

        // Visit each value in the list
        for (SQLParser.ValueItemContext item : ctx.valueList().valueItem()) {
            visit(item);
        }

        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitBetweenExpression(SQLParser.BetweenExpressionContext ctx) {
        // BETWEEN has 3 additive expressions: value, low, high
        List<SQLParser.AdditiveExpressionContext> operands = ctx.additiveExpression();

        SQLType valueType = visit(operands.get(0));
        SQLType lowType = visit(operands.get(1));
        SQLType highType = visit(operands.get(2));

        // Check that types are comparable
        if (!valueType.isComparableTo(lowType) || !valueType.isComparableTo(highType)) {
            errorListener.reportError(ctx, SemanticErrorType.INVALID_COMPARISON_OPERAND,
                    "BETWEEN operands must be of compatible types");
        }

        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitIsNullExpression(SQLParser.IsNullExpressionContext ctx) {
        // Visit the operand (any type can be checked for NULL)
        visit(ctx.additiveExpression());
        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitIsNotNullExpression(SQLParser.IsNotNullExpressionContext ctx) {
        // Visit the operand (any type can be checked for NULL)
        visit(ctx.additiveExpression());
        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitAdditiveExpression(SQLParser.AdditiveExpressionContext ctx) {
        List<SQLParser.MultiplicativeExpressionContext> operands = ctx.multiplicativeExpression();

        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // Addition/subtraction requires numeric operands
        SQLType result = SQLType.INTEGER;
        for (SQLParser.MultiplicativeExpressionContext operand : operands) {
            SQLType type = visit(operand);
            if (type == SQLType.UNKNOWN || type == SQLType.NULL) {
                result = SQLType.UNKNOWN;
            } else if (!type.isNumeric()) {
                errorListener.reportError(operand, SemanticErrorType.INVALID_ARITHMETIC_OPERAND,
                        "Arithmetic operator requires numeric operands, found: " + type);
                result = SQLType.UNKNOWN;
            } else if (type == SQLType.FLOAT) {
                result = SQLType.FLOAT;
            }
        }
        return result;
    }

    @Override
    public SQLType visitMultiplicativeExpression(SQLParser.MultiplicativeExpressionContext ctx) {
        List<SQLParser.UnaryExpressionContext> operands = ctx.unaryExpression();

        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // Multiplication/division requires numeric operands
        SQLType result = SQLType.INTEGER;
        for (SQLParser.UnaryExpressionContext operand : operands) {
            SQLType type = visit(operand);
            if (type == SQLType.UNKNOWN || type == SQLType.NULL) {
                result = SQLType.UNKNOWN;
            } else if (!type.isNumeric()) {
                errorListener.reportError(operand, SemanticErrorType.INVALID_ARITHMETIC_OPERAND,
                        "Arithmetic operator requires numeric operands, found: " + type);
                result = SQLType.UNKNOWN;
            } else if (type == SQLType.FLOAT) {
                result = SQLType.FLOAT;
            }
        }
        return result;
    }

    @Override
    public SQLType visitNotExpression(SQLParser.NotExpressionContext ctx) {
        SQLType type = visit(ctx.unaryExpression());
        if (type != SQLType.BOOLEAN && type != SQLType.UNKNOWN && type != SQLType.NULL) {
            errorListener.reportError(ctx, SemanticErrorType.INVALID_LOGICAL_OPERAND,
                    "NOT operator requires boolean operand, found: " + type);
        }
        return SQLType.BOOLEAN;
    }

    @Override
    public SQLType visitPrimaryExpr(SQLParser.PrimaryExprContext ctx) {
        return visit(ctx.primaryExpression());
    }

    @Override
    public SQLType visitParenExpression(SQLParser.ParenExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public SQLType visitLiteralExpression(SQLParser.LiteralExpressionContext ctx) {
        return visit(ctx.literal());
    }

    // ==================== Literal Visitor ====================

    @Override
    public SQLType visitLiteral(SQLParser.LiteralContext ctx) {
        if (ctx.INT() != null) {
            return SQLType.INTEGER;
        }
        if (ctx.FLOAT() != null) {
            return SQLType.FLOAT;
        }
        if (ctx.HEX_INT() != null || ctx.BINARY_INT() != null) {
            return SQLType.INTEGER;
        }
        if (ctx.STRING() != null || ctx.HEX_STRING() != null || ctx.BIT_STRING() != null) {
            return SQLType.STRING;
        }
        if (ctx.TRUE() != null || ctx.FALSE() != null) {
            return SQLType.BOOLEAN;
        }
        if (ctx.NULL() != null) {
            return SQLType.NULL;
        }
        if (ctx.USER_VAR() != null) {
            // User variables have unknown type at compile time
            return SQLType.UNKNOWN;
        }
        return SQLType.UNKNOWN;
    }

    // ==================== Assignment Visitors ====================

    @Override
    public SQLType visitAssignmentList(SQLParser.AssignmentListContext ctx) {
        for (SQLParser.AssignmentContext assignment : ctx.assignment()) {
            visit(assignment);
        }
        return null;
    }

    @Override
    public SQLType visitAssignment(SQLParser.AssignmentContext ctx) {
        String columnName = getIdentifierText(ctx.identifier());

        // Check if column exists in current table
        if (!currentTables.isEmpty()) {
            ColumnInfo column = symbolTable.resolveColumn(null, columnName, currentTables);
            if (column == null) {
                errorListener.reportError(ctx, SemanticErrorType.UNDEFINED_COLUMN,
                        "Unknown column in UPDATE: " + columnName);
            } else {
                // Type check the expression
                SQLType exprType = visit(ctx.expression());
                if (exprType != SQLType.UNKNOWN && exprType != SQLType.NULL) {
                    if (!column.getType().isComparableTo(exprType)) {
                        errorListener.reportError(ctx, SemanticErrorType.TYPE_MISMATCH,
                                String.format("Cannot assign %s to column '%s' of type %s",
                                        exprType, columnName, column.getType()));
                    }
                }
            }
        }

        return null;
    }

    // ==================== ORDER BY Visitors ====================

    @Override
    public SQLType visitOrderByList(SQLParser.OrderByListContext ctx) {
        for (SQLParser.OrderByItemContext item : ctx.orderByItem()) {
            visit(item);
        }
        return null;
    }

    @Override
    public SQLType visitOrderByItem(SQLParser.OrderByItemContext ctx) {
        return visit(ctx.column());
    }

    // ==================== Helper Methods ====================

    /**
     * Processes a table reference from FROM clause, validates it exists,
     * and registers any alias.
     */
    private void processTableReference(SQLParser.TableNameContext ctx) {
        String tableName = getTableNameText(ctx);
        TableInfo table = symbolTable.resolveTable(tableName);

        if (table == null) {
            errorListener.reportError(ctx, SemanticErrorType.UNDEFINED_TABLE,
                    "Unknown table: " + tableName);
            return;
        }

        currentTables.add(table);

        // Register alias if present (tableName AS alias)
        String alias = getTableAliasText(ctx);
        if (alias != null) {
            symbolTable.registerTableAlias(alias, table);
        }
    }

    /**
     * Gets the alias from a tableName context if present.
     */
    private String getTableAliasText(SQLParser.TableNameContext ctx) {
        if (ctx instanceof SQLParser.QualifiedTableNameContext) {
            SQLParser.QualifiedTableNameContext qualified = (SQLParser.QualifiedTableNameContext) ctx;
            if (qualified.AS() != null && qualified.identifier().size() > 1) {
                return getIdentifierText(qualified.identifier(1));
            }
        } else if (ctx instanceof SQLParser.SimpleTableNameContext) {
            SQLParser.SimpleTableNameContext simple = (SQLParser.SimpleTableNameContext) ctx;
            if (simple.AS() != null && simple.identifier().size() > 1) {
                return getIdentifierText(simple.identifier(1));
            }
        }
        return null;
    }
}