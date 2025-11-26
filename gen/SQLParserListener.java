// Generated from /home/mohammad/Desktop/compiler2/sql-compiler/src/main/java/com/sqlcompiler/parser/SQLParser.g4 by ANTLR 4.13.2

package com.sqlcompiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SQLParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SQLParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(SQLParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(SQLParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumns}
	 * labeled alternative in {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumns(SQLParser.SelectColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumns}
	 * labeled alternative in {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumns(SQLParser.SelectColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(SQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(SQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnWithExpression}
	 * labeled alternative in {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumnWithExpression(SQLParser.ColumnWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnWithExpression}
	 * labeled alternative in {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumnWithExpression(SQLParser.ColumnWithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SQLParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SQLParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SQLParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SQLParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(SQLParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(SQLParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SQLParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SQLParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SQLParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SQLParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link SQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(SQLParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link SQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(SQLParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(SQLParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(SQLParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SQLParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SQLParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userVariable}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(SQLParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userVariable}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(SQLParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SQLParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SQLParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(SQLParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(SQLParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByList}.
	 * @param ctx the parse tree
	 */
	void enterOrderByList(SQLParser.OrderByListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByList}.
	 * @param ctx the parse tree
	 */
	void exitOrderByList(SQLParser.OrderByListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SQLParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SQLParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SQLParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SQLParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(SQLParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(SQLParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(SQLParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(SQLParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(SQLParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(SQLParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SQLParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SQLParser.DeleteStatementContext ctx);
}