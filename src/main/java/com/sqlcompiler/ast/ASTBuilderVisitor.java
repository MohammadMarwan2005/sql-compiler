package com.sqlcompiler.ast;

import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.parser.SQLParserBaseVisitor;

/**
 * Visitor that builds an Abstract Syntax Tree (AST) from the Parse Tree.
 * 
 * This visitor traverses the ANTLR parse tree and constructs a simplified
 * AST representation that excludes syntactic details (parentheses, commas,
 * brackets) and retains only the logical structure of SQL statements.
 * 
 * Extends SQLParserBaseVisitor<ASTNode> to visit parse tree nodes
 * and return corresponding AST nodes.
 */
public class ASTBuilderVisitor extends SQLParserBaseVisitor<ASTNode> {

    // ==================== Script and Statement ====================

    @Override
    public ASTNode visitScript(SQLParser.ScriptContext ctx) {
        ScriptNode script = new ScriptNode();
        for (SQLParser.StatementContext stmt : ctx.statement()) {
            ASTNode node = visit(stmt);
            script.addStatement(node);
        }
        return script;
    }

    @Override
    public ASTNode visitStatement(SQLParser.StatementContext ctx) {
        // Delegate to the specific statement type
        if (ctx.selectStatement() != null) {
            return visit(ctx.selectStatement());
        } else if (ctx.insertStatement() != null) {
            return visit(ctx.insertStatement());
        } else if (ctx.updateStatement() != null) {
            return visit(ctx.updateStatement());
        } else if (ctx.deleteStatement() != null) {
            return visit(ctx.deleteStatement());
        } else if (ctx.createTableStatement() != null) {
            return visit(ctx.createTableStatement());
        } else if (ctx.dropTableStatement() != null) {
            return visit(ctx.dropTableStatement());
        } else if (ctx.cteStatement() != null) {
            return visit(ctx.cteStatement());
        } else if (ctx.declareCursorStatement() != null) {
            return visit(ctx.declareCursorStatement());
        }
        // Handle other statement types as needed
        return null;
    }

    // ==================== SELECT Statement ====================

    @Override
    public ASTNode visitSelectStatement(SQLParser.SelectStatementContext ctx) {
        SelectNode select = new SelectNode();
        
        // DISTINCT
        select.setDistinct(ctx.DISTINCT() != null);
        
        // SELECT list (columns)
        if (ctx.selectList() != null) {
            select.setColumns((ColumnListNode) visit(ctx.selectList()));
        }
        
        // FROM clause
        if (ctx.tableName() != null) {
            IdentifierNode table = buildTableIdentifier(ctx.tableName());
            select.setFrom(new FromNode(table));
        }
        
        // WHERE clause
        if (ctx.WHERE() != null && !ctx.expression().isEmpty()) {
            ASTNode condition = visit(ctx.expression(0));
            select.setWhere(new WhereNode(condition));
        }
        
        // GROUP BY clause
        if (ctx.GROUP() != null && ctx.columnList() != null) {
            GroupByNode groupBy = new GroupByNode();
            for (SQLParser.ColumnContext col : ctx.columnList().column()) {
                groupBy.addColumn(visit(col));
            }
            select.setGroupBy(groupBy);
        }
        
        // HAVING clause
        if (ctx.HAVING() != null && ctx.expression().size() > 1) {
            ASTNode condition = visit(ctx.expression(1));
            select.setHaving(new HavingNode(condition));
        }
        
        // ORDER BY clause
        if (ctx.ORDER() != null && ctx.orderByList() != null) {
            select.setOrderBy((OrderByNode) visit(ctx.orderByList()));
        }
        
        // LIMIT clause
        if (ctx.LIMIT() != null && ctx.INT() != null) {
            int limit = Integer.parseInt(ctx.INT().getText());
            select.setLimit(new LimitNode(limit));
        }
        
        return select;
    }

    @Override
    public ASTNode visitSelectAll(SQLParser.SelectAllContext ctx) {
        ColumnListNode columns = new ColumnListNode();
        columns.setSelectAll(true);
        return columns;
    }

    @Override
    public ASTNode visitSelectColumns(SQLParser.SelectColumnsContext ctx) {
        ColumnListNode columns = new ColumnListNode();
        for (SQLParser.ColumnContext col : ctx.columnList().column()) {
            columns.addColumn(visit(col));
        }
        return columns;
    }

    @Override
    public ASTNode visitColumnName(SQLParser.ColumnNameContext ctx) {
        String name = getIdentifierText(ctx.identifier(0));
        IdentifierNode id = new IdentifierNode(name);
        
        // Table prefix (table.column)
        if (ctx.tableName() != null) {
            id.setTableName(getTableName(ctx.tableName()));
        }
        
        // Alias (column AS alias)
        if (ctx.AS() != null && ctx.identifier().size() > 1) {
            id.setAlias(getIdentifierText(ctx.identifier(1)));
        }
        
        return id;
    }

    @Override
    public ASTNode visitColumnWithExpression(SQLParser.ColumnWithExpressionContext ctx) {
        ASTNode expr = visit(ctx.expression());
        
        // If there's an alias, wrap in identifier with alias
        if (ctx.AS() != null && ctx.identifier() != null) {
            if (expr instanceof IdentifierNode) {
                ((IdentifierNode) expr).setAlias(getIdentifierText(ctx.identifier()));
            }
            // For other expressions, we could wrap them, but keep it simple
        }
        
        return expr;
    }

    // ==================== ORDER BY ====================

    @Override
    public ASTNode visitOrderByList(SQLParser.OrderByListContext ctx) {
        OrderByNode orderBy = new OrderByNode();
        for (SQLParser.OrderByItemContext item : ctx.orderByItem()) {
            orderBy.addItem((OrderByItemNode) visit(item));
        }
        return orderBy;
    }

    @Override
    public ASTNode visitOrderByItem(SQLParser.OrderByItemContext ctx) {
        ASTNode column = visit(ctx.column());
        String direction = null;
        if (ctx.ASC() != null) {
            direction = "ASC";
        } else if (ctx.DESC() != null) {
            direction = "DESC";
        }
        return new OrderByItemNode(column, direction);
    }

    // ==================== INSERT Statement ====================

    @Override
    public ASTNode visitInsertStatement(SQLParser.InsertStatementContext ctx) {
        InsertNode insert = new InsertNode();
        
        // Table name
        if (ctx.tableName() != null) {
            insert.setTable(buildTableIdentifier(ctx.tableName()));
        }
        
        // Columns (optional)
        if (ctx.columnList() != null) {
            for (SQLParser.ColumnContext col : ctx.columnList().column()) {
                ASTNode colNode = visit(col);
                if (colNode instanceof IdentifierNode) {
                    insert.addColumn((IdentifierNode) colNode);
                }
            }
        }
        
        // Values
        if (ctx.valueList() != null) {
            for (SQLParser.ValueItemContext item : ctx.valueList().valueItem()) {
                insert.addValue(visit(item));
            }
        }
        
        return insert;
    }

    @Override
    public ASTNode visitValueItem(SQLParser.ValueItemContext ctx) {
        if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        return null;
    }

    // ==================== UPDATE Statement ====================

    @Override
    public ASTNode visitUpdateStatement(SQLParser.UpdateStatementContext ctx) {
        UpdateNode update = new UpdateNode();
        
        // Table name
        if (ctx.tableName() != null) {
            update.setTable(buildTableIdentifier(ctx.tableName()));
        }
        
        // Assignments
        if (ctx.assignmentList() != null) {
            for (SQLParser.AssignmentContext assign : ctx.assignmentList().assignment()) {
                update.addAssignment((AssignmentNode) visit(assign));
            }
        }
        
        // WHERE clause
        if (ctx.expression() != null) {
            update.setWhere(new WhereNode(visit(ctx.expression())));
        }
        
        return update;
    }

    @Override
    public ASTNode visitAssignment(SQLParser.AssignmentContext ctx) {
        String colName = getIdentifierText(ctx.identifier());
        IdentifierNode column = new IdentifierNode(colName);
        ASTNode value = visit(ctx.expression());
        return new AssignmentNode(column, value);
    }

    // ==================== DELETE Statement ====================

    @Override
    public ASTNode visitDeleteStatement(SQLParser.DeleteStatementContext ctx) {
        DeleteNode delete = new DeleteNode();
        
        // Table name
        if (ctx.tableName() != null) {
            delete.setTable(buildTableIdentifier(ctx.tableName()));
        }
        
        // WHERE clause
        if (ctx.expression() != null) {
            delete.setWhere(new WhereNode(visit(ctx.expression())));
        }
        
        return delete;
    }

    // ==================== CREATE TABLE Statement ====================

    @Override
    public ASTNode visitCreateTableStatement(SQLParser.CreateTableStatementContext ctx) {
        CreateTableNode create = new CreateTableNode();
        
        // IF NOT EXISTS
        create.setIfNotExists(ctx.IF() != null);
        
        // Table name
        if (ctx.tableIdentifier() != null) {
            create.setTableName(buildTableIdentifierNode(ctx.tableIdentifier()));
        }
        
        // Column definitions
        if (ctx.columnDefinitionList() != null) {
            for (SQLParser.ColumnDefinitionContext colDef : ctx.columnDefinitionList().columnDefinition()) {
                create.addColumn((ColumnDefNode) visit(colDef));
            }
        }
        
        // Table constraints
        for (SQLParser.TableConstraintContext constraint : ctx.tableConstraint()) {
            create.addConstraint((ConstraintNode) visit(constraint));
        }
        
        return create;
    }

    @Override
    public ASTNode visitColumnDefinition(SQLParser.ColumnDefinitionContext ctx) {
        String name = getIdentifierText(ctx.identifier());
        String dataType = ctx.dataType().getText();
        
        ColumnDefNode colDef = new ColumnDefNode(name, dataType);
        
        // Column constraints
        for (SQLParser.ColumnConstraintContext constraint : ctx.columnConstraint()) {
            colDef.addConstraint(getColumnConstraintType(constraint));
        }
        
        return colDef;
    }

    @Override
    public ASTNode visitPrimaryKeyTableConstraint(SQLParser.PrimaryKeyTableConstraintContext ctx) {
        ConstraintNode constraint = new ConstraintNode("PRIMARY_KEY");
        for (SQLParser.IdentifierContext id : ctx.columnNameList().identifier()) {
            constraint.addColumn(getIdentifierText(id));
        }
        return constraint;
    }

    @Override
    public ASTNode visitForeignKeyConstraint(SQLParser.ForeignKeyConstraintContext ctx) {
        ConstraintNode constraint = new ConstraintNode("FOREIGN_KEY");
        
        // FK columns
        for (SQLParser.IdentifierContext id : ctx.columnNameList(0).identifier()) {
            constraint.addColumn(getIdentifierText(id));
        }
        
        // Referenced table
        if (ctx.tableIdentifier() != null) {
            constraint.setReferencedTable(getTableIdentifierText(ctx.tableIdentifier()));
        }
        
        // Referenced columns
        if (ctx.columnNameList().size() > 1) {
            for (SQLParser.IdentifierContext id : ctx.columnNameList(1).identifier()) {
                constraint.addReferencedColumn(getIdentifierText(id));
            }
        }
        
        return constraint;
    }

    @Override
    public ASTNode visitUniqueTableConstraint(SQLParser.UniqueTableConstraintContext ctx) {
        ConstraintNode constraint = new ConstraintNode("UNIQUE");
        for (SQLParser.IdentifierContext id : ctx.columnNameList().identifier()) {
            constraint.addColumn(getIdentifierText(id));
        }
        return constraint;
    }

    // ==================== DROP TABLE Statement ====================

    @Override
    public ASTNode visitDropTableStatement(SQLParser.DropTableStatementContext ctx) {
        DropTableNode drop = new DropTableNode();
        drop.setIfExists(ctx.IF() != null);
        
        if (ctx.tableIdentifier() != null) {
            drop.setTableName(buildTableIdentifierNode(ctx.tableIdentifier()));
        }
        
        return drop;
    }

    // ==================== CTE Statement ====================

    @Override
    public ASTNode visitCteStatement(SQLParser.CteStatementContext ctx) {
        IdentifierNode cteName = new IdentifierNode(getIdentifierText(ctx.identifier()));
        SelectNode definition = (SelectNode) visit(ctx.selectStatement());
        
        ASTNode mainStmt = null;
        if (ctx.cteSelectStatement() != null) {
            mainStmt = visit(ctx.cteSelectStatement());
        } else if (ctx.cteUpdateStatement() != null) {
            mainStmt = visit(ctx.cteUpdateStatement());
        } else if (ctx.cteDeleteStatement() != null) {
            mainStmt = visit(ctx.cteDeleteStatement());
        }
        
        return new CTENode(cteName, definition, mainStmt);
    }

    @Override
    public ASTNode visitCteSelectStatement(SQLParser.CteSelectStatementContext ctx) {
        SelectNode select = new SelectNode();
        
        select.setDistinct(ctx.DISTINCT() != null);
        
        if (ctx.selectList() != null) {
            select.setColumns((ColumnListNode) visit(ctx.selectList()));
        }
        
        if (ctx.tableName() != null) {
            select.setFrom(new FromNode(buildTableIdentifier(ctx.tableName())));
        }
        
        if (ctx.WHERE() != null && !ctx.expression().isEmpty()) {
            select.setWhere(new WhereNode(visit(ctx.expression(0))));
        }
        
        if (ctx.ORDER() != null && ctx.orderByList() != null) {
            select.setOrderBy((OrderByNode) visit(ctx.orderByList()));
        }
        
        return select;
    }

    // ==================== DECLARE CURSOR Statement ====================

    @Override
    public ASTNode visitDeclareCursorStatement(SQLParser.DeclareCursorStatementContext ctx) {
        IdentifierNode cursorName = new IdentifierNode(getIdentifierText(ctx.identifier()));
        SelectNode selectStmt = (SelectNode) visit(ctx.selectStatement());
        return new DeclareCursorNode(cursorName, selectStmt);
    }

    // ==================== Expressions ====================

    @Override
    public ASTNode visitExpression(SQLParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public ASTNode visitLogicalOrExpression(SQLParser.LogicalOrExpressionContext ctx) {
        if (ctx.logicalAndExpression().size() == 1) {
            return visit(ctx.logicalAndExpression(0));
        }
        
        // Build left-associative OR tree
        ASTNode result = visit(ctx.logicalAndExpression(0));
        for (int i = 1; i < ctx.logicalAndExpression().size(); i++) {
            ASTNode right = visit(ctx.logicalAndExpression(i));
            result = new BinaryExprNode("OR", result, right);
        }
        return result;
    }

    @Override
    public ASTNode visitLogicalAndExpression(SQLParser.LogicalAndExpressionContext ctx) {
        if (ctx.comparisonExpression().size() == 1) {
            return visit(ctx.comparisonExpression(0));
        }
        
        // Build left-associative AND tree
        ASTNode result = visit(ctx.comparisonExpression(0));
        for (int i = 1; i < ctx.comparisonExpression().size(); i++) {
            ASTNode right = visit(ctx.comparisonExpression(i));
            result = new BinaryExprNode("AND", result, right);
        }
        return result;
    }

    @Override
    public ASTNode visitSimpleComparison(SQLParser.SimpleComparisonContext ctx) {
        if (ctx.additiveExpression().size() == 1) {
            return visit(ctx.additiveExpression(0));
        }
        
        ASTNode left = visit(ctx.additiveExpression(0));
        ASTNode right = visit(ctx.additiveExpression(1));
        String op = ctx.comparisonOp().getText();
        
        return new BinaryExprNode(op, left, right);
    }

    @Override
    public ASTNode visitInExpression(SQLParser.InExpressionContext ctx) {
        ASTNode left = visit(ctx.additiveExpression());
        // Simplify: represent IN as a node with the operand
        return new UnaryExprNode("IN", left);
    }

    @Override
    public ASTNode visitNotInExpression(SQLParser.NotInExpressionContext ctx) {
        ASTNode left = visit(ctx.additiveExpression());
        return new UnaryExprNode("NOT_IN", left);
    }

    @Override
    public ASTNode visitBetweenExpression(SQLParser.BetweenExpressionContext ctx) {
        ASTNode value = visit(ctx.additiveExpression(0));
        ASTNode low = visit(ctx.additiveExpression(1));
        ASTNode high = visit(ctx.additiveExpression(2));
        
        // Represent as: BETWEEN(value, low, high) - simplified as binary with value
        BinaryExprNode range = new BinaryExprNode("TO", low, high);
        return new BinaryExprNode("BETWEEN", value, range);
    }

    @Override
    public ASTNode visitIsNullExpression(SQLParser.IsNullExpressionContext ctx) {
        ASTNode operand = visit(ctx.additiveExpression());
        return new UnaryExprNode("IS_NULL", operand);
    }

    @Override
    public ASTNode visitIsNotNullExpression(SQLParser.IsNotNullExpressionContext ctx) {
        ASTNode operand = visit(ctx.additiveExpression());
        return new UnaryExprNode("IS_NOT_NULL", operand);
    }

    @Override
    public ASTNode visitAdditiveExpression(SQLParser.AdditiveExpressionContext ctx) {
        if (ctx.multiplicativeExpression().size() == 1) {
            return visit(ctx.multiplicativeExpression(0));
        }
        
        // Build left-associative tree for + and -
        ASTNode result = visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // +, -
            ASTNode right = visit(ctx.multiplicativeExpression(i));
            result = new BinaryExprNode(op, result, right);
        }
        return result;
    }

    @Override
    public ASTNode visitMultiplicativeExpression(SQLParser.MultiplicativeExpressionContext ctx) {
        if (ctx.unaryExpression().size() == 1) {
            return visit(ctx.unaryExpression(0));
        }
        
        // Build left-associative tree for *, /, %
        ASTNode result = visit(ctx.unaryExpression(0));
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText(); // *, /, %
            ASTNode right = visit(ctx.unaryExpression(i));
            result = new BinaryExprNode(op, result, right);
        }
        return result;
    }

    @Override
    public ASTNode visitNotExpression(SQLParser.NotExpressionContext ctx) {
        ASTNode operand = visit(ctx.unaryExpression());
        return new UnaryExprNode("NOT", operand);
    }

    @Override
    public ASTNode visitPrimaryExpr(SQLParser.PrimaryExprContext ctx) {
        return visit(ctx.primaryExpression());
    }

    @Override
    public ASTNode visitParenExpression(SQLParser.ParenExpressionContext ctx) {
        // Parentheses are syntactic sugar - skip them in AST
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitColumnReference(SQLParser.ColumnReferenceContext ctx) {
        String name = getIdentifierText(ctx.identifier());
        IdentifierNode id = new IdentifierNode(name);
        
        if (ctx.tableName() != null) {
            id.setTableName(getTableName(ctx.tableName()));
        }
        
        return id;
    }

    @Override
    public ASTNode visitLiteralExpression(SQLParser.LiteralExpressionContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public ASTNode visitLiteral(SQLParser.LiteralContext ctx) {
        if (ctx.INT() != null) {
            return new LiteralNode(ctx.INT().getText(), LiteralNode.LiteralType.INTEGER);
        } else if (ctx.FLOAT() != null) {
            return new LiteralNode(ctx.FLOAT().getText(), LiteralNode.LiteralType.FLOAT);
        } else if (ctx.STRING() != null) {
            return new LiteralNode(ctx.STRING().getText(), LiteralNode.LiteralType.STRING);
        } else if (ctx.TRUE() != null) {
            return new LiteralNode("TRUE", LiteralNode.LiteralType.BOOLEAN);
        } else if (ctx.FALSE() != null) {
            return new LiteralNode("FALSE", LiteralNode.LiteralType.BOOLEAN);
        } else if (ctx.NULL() != null) {
            return new LiteralNode("NULL", LiteralNode.LiteralType.NULL);
        }
        return new LiteralNode(ctx.getText(), LiteralNode.LiteralType.STRING);
    }

    // ==================== Helper Methods ====================

    /**
     * Extracts text from an identifier context, handling regular, quoted, and bracket identifiers.
     */
    private String getIdentifierText(SQLParser.IdentifierContext ctx) {
        if (ctx == null) return null;
        
        if (ctx.IDENT() != null) {
            return ctx.IDENT().getText();
        } else if (ctx.QUOTED_IDENT() != null) {
            String text = ctx.QUOTED_IDENT().getText();
            return text.substring(1, text.length() - 1);
        } else if (ctx.BRACKET_IDENT() != null) {
            String text = ctx.BRACKET_IDENT().getText();
            return text.substring(1, text.length() - 1);
        }
        return ctx.getText();
    }

    /**
     * Gets the table name from a tableName context.
     */
    private String getTableName(SQLParser.TableNameContext ctx) {
        if (ctx instanceof SQLParser.QualifiedTableNameContext) {
            SQLParser.QualifiedTableNameContext qualified = (SQLParser.QualifiedTableNameContext) ctx;
            return getIdentifierText(qualified.identifier(0));
        } else if (ctx instanceof SQLParser.SimpleTableNameContext) {
            SQLParser.SimpleTableNameContext simple = (SQLParser.SimpleTableNameContext) ctx;
            return getIdentifierText(simple.identifier(0));
        }
        return ctx.getText();
    }

    /**
     * Builds an IdentifierNode from a tableName context.
     */
    private IdentifierNode buildTableIdentifier(SQLParser.TableNameContext ctx) {
        String name = getTableName(ctx);
        IdentifierNode id = new IdentifierNode(name);
        
        // Handle alias
        if (ctx instanceof SQLParser.QualifiedTableNameContext) {
            SQLParser.QualifiedTableNameContext qualified = (SQLParser.QualifiedTableNameContext) ctx;
            if (qualified.AS() != null && qualified.identifier().size() > 1) {
                id.setAlias(getIdentifierText(qualified.identifier(1)));
            }
        } else if (ctx instanceof SQLParser.SimpleTableNameContext) {
            SQLParser.SimpleTableNameContext simple = (SQLParser.SimpleTableNameContext) ctx;
            if (simple.AS() != null && simple.identifier().size() > 1) {
                id.setAlias(getIdentifierText(simple.identifier(1)));
            }
        }
        
        return id;
    }

    /**
     * Gets text from a tableIdentifier context.
     */
    private String getTableIdentifierText(SQLParser.TableIdentifierContext ctx) {
        if (ctx.identifier() != null) {
            return getIdentifierText(ctx.identifier());
        }
        return ctx.getText();
    }

    /**
     * Builds an IdentifierNode from a tableIdentifier context.
     */
    private IdentifierNode buildTableIdentifierNode(SQLParser.TableIdentifierContext ctx) {
        return new IdentifierNode(getTableIdentifierText(ctx));
    }

    /**
     * Gets the constraint type string from a column constraint context.
     */
    private String getColumnConstraintType(SQLParser.ColumnConstraintContext ctx) {
        if (ctx instanceof SQLParser.NotNullConstraintContext) {
            return "NOT_NULL";
        } else if (ctx instanceof SQLParser.NullConstraintContext) {
            return "NULL";
        } else if (ctx instanceof SQLParser.PrimaryKeyColumnConstraintContext) {
            return "PRIMARY_KEY";
        } else if (ctx instanceof SQLParser.UniqueColumnConstraintContext) {
            return "UNIQUE";
        } else if (ctx instanceof SQLParser.DefaultConstraintContext) {
            return "DEFAULT";
        } else if (ctx instanceof SQLParser.AutoIncrementConstraintContext) {
            return "AUTO_INCREMENT";
        }
        return ctx.getText();
    }
}
