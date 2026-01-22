package com.sqlcompiler.semantic;

import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.parser.SQLParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Semantic analyzer for SQL queries.
 * Extends ANTLR's BaseVisitor to traverse the parse tree and perform:
 * - Identifier resolution (tables, columns)
 * - Type checking for expressions
 * - SQL-specific semantic constraint validation
 *
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

    /**
     * Main entry point for semantic analysis.
     * Analyzes a query and returns true if no semantic errors were found.
     */
    public boolean analyze(SQLParser.QueryContext tree) {
        symbolTable.clearQueryScope();
        currentTables.clear();
        visit(tree);
        return !errorListener.hasErrors();
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

    // ==================== Statement Visitors ====================

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
            String tableName = ctx.tableName().IDENT(0).getText();
            table = symbolTable.resolveTable(tableName);
            if (table == null) {
                errorListener.reportError(ctx.tableName(), SemanticErrorType.UNDEFINED_TABLE,
                        "Unknown table: " + tableName);
            }
        }

        // 2. Validate column count matches value count
        if (ctx.columnList() != null && ctx.valueList() != null) {
            int columnCount = ctx.columnList().column().size();
            int valueCount = ctx.valueList().literal().size();
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
                        String name = colName.IDENT(0).getText();
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
            for (SQLParser.LiteralContext lit : ctx.valueList().literal()) {
                visit(lit);
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
                if (colName.IDENT().size() > 1 && colName.AS() != null) {
                    String alias = colName.IDENT(colName.IDENT().size() - 1).getText();
                    symbolTable.registerColumnAlias(alias, type != null ? type : SQLType.UNKNOWN);
                }
            } else if (col instanceof SQLParser.ColumnWithExpressionContext) {
                SQLParser.ColumnWithExpressionContext colExpr = (SQLParser.ColumnWithExpressionContext) col;
                if (colExpr.AS() != null && colExpr.IDENT() != null) {
                    String alias = colExpr.IDENT().getText();
                    symbolTable.registerColumnAlias(alias, type != null ? type : SQLType.UNKNOWN);
                }
            }
        }
        return null;
    }

    // ==================== Column Visitors ====================

    @Override
    public SQLType visitColumnName(SQLParser.ColumnNameContext ctx) {
        List<TerminalNode> idents = ctx.IDENT();
        String tableName = null;
        String columnName;

        if (ctx.tableName() != null) {
            // Qualified: table.column
            tableName = ctx.tableName().IDENT(0).getText();
            columnName = idents.get(0).getText();
        } else {
            // Unqualified: just column
            columnName = idents.get(0).getText();
        }

        return resolveColumnReference(tableName, columnName, ctx.getStart());
    }

    @Override
    public SQLType visitColumnReference(SQLParser.ColumnReferenceContext ctx) {
        String tableName = null;
        String columnName;

        if (ctx.tableName() != null) {
            tableName = ctx.tableName().IDENT(0).getText();
        }
        columnName = ctx.IDENT().getText();

        return resolveColumnReference(tableName, columnName, ctx.getStart());
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

    @Override
    public SQLType visitComparisonExpression(SQLParser.ComparisonExpressionContext ctx) {
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
        String columnName = ctx.IDENT().getText();

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
        List<TerminalNode> idents = ctx.IDENT();
        String tableName = idents.get(0).getText();
        TableInfo table = symbolTable.resolveTable(tableName);

        if (table == null) {
            errorListener.reportError(ctx, SemanticErrorType.UNDEFINED_TABLE,
                    "Unknown table: " + tableName);
            return;
        }

        currentTables.add(table);

        // Register alias if present (tableName AS alias)
        if (ctx.AS() != null && idents.size() > 1) {
            String alias = idents.get(1).getText();
            symbolTable.registerTableAlias(alias, table);
        }
    }
}