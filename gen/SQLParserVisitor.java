// Generated from /home/mohammad/Desktop/compiler2/sql-compiler/src/main/java/com/sqlcompiler/parser/SQLParser.g4 by ANTLR 4.13.2

package com.sqlcompiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SQLParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(SQLParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumns}
	 * labeled alternative in {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumns(SQLParser.SelectColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(SQLParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnName}
	 * labeled alternative in {@link SQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnWithExpression}
	 * labeled alternative in {@link SQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWithExpression(SQLParser.ColumnWithExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(SQLParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(SQLParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(SQLParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SQLParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SQLParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link SQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(SQLParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(SQLParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SQLParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userVariable}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(SQLParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(SQLParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(SQLParser.ComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderByList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByList(SQLParser.OrderByListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(SQLParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(SQLParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(SQLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(SQLParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(SQLParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SQLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SQLParser.DeleteStatementContext ctx);
}