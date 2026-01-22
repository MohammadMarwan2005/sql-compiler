// Generated from src/main/java/com/sqlcompiler/parser/SQLParser.g4 by ANTLR 4.13.1

package com.sqlcompiler.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SQLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SQLParser.ScriptContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SQLParser.StatementContext ctx);
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
	 * Enter a parse tree produced by the {@code qualifiedTableName}
	 * labeled alternative in {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedTableName(SQLParser.QualifiedTableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualifiedTableName}
	 * labeled alternative in {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedTableName(SQLParser.QualifiedTableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTableName}
	 * labeled alternative in {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTableName(SQLParser.SimpleTableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTableName}
	 * labeled alternative in {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTableName(SQLParser.SimpleTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQLParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQLParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by the {@code simpleComparison}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleComparison(SQLParser.SimpleComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleComparison}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleComparison(SQLParser.SimpleComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(SQLParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(SQLParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notInExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(SQLParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notInExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(SQLParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterBetweenExpression(SQLParser.BetweenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitBetweenExpression(SQLParser.BetweenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsNullExpression(SQLParser.IsNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsNullExpression(SQLParser.IsNullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNotNullExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotNullExpression(SQLParser.IsNotNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNotNullExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotNullExpression(SQLParser.IsNotNullExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#valueItem}.
	 * @param ctx the parse tree
	 */
	void enterValueItem(SQLParser.ValueItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valueItem}.
	 * @param ctx the parse tree
	 */
	void exitValueItem(SQLParser.ValueItemContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(SQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(SQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SQLParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SQLParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionList(SQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionList(SQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SQLParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SQLParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(SQLParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(SQLParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterBigintType(SQLParser.BigintTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitBigintType(SQLParser.BigintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSmallintType(SQLParser.SmallintTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSmallintType(SQLParser.SmallintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTinyintType(SQLParser.TinyintTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTinyintType(SQLParser.TinyintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(SQLParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(SQLParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(SQLParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(SQLParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(SQLParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(SQLParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(SQLParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(SQLParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varcharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterVarcharType(SQLParser.VarcharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varcharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitVarcharType(SQLParser.VarcharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nvarcharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNvarcharType(SQLParser.NvarcharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nvarcharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNvarcharType(SQLParser.NvarcharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(SQLParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(SQLParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ncharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNcharType(SQLParser.NcharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ncharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNcharType(SQLParser.NcharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTextType(SQLParser.TextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTextType(SQLParser.TextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ntextType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNtextType(SQLParser.NtextTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ntextType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNtextType(SQLParser.NtextTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(SQLParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(SQLParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(SQLParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(SQLParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDateType(SQLParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDateType(SQLParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datetimeType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeType(SQLParser.DatetimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datetimeType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeType(SQLParser.DatetimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTimestampType(SQLParser.TimestampTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTimestampType(SQLParser.TimestampTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(SQLParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(SQLParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blobType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterBlobType(SQLParser.BlobTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blobType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitBlobType(SQLParser.BlobTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notNullConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNotNullConstraint(SQLParser.NotNullConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notNullConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNotNullConstraint(SQLParser.NotNullConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullConstraint(SQLParser.NullConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullConstraint(SQLParser.NullConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(SQLParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(SQLParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueColumnConstraint(SQLParser.UniqueColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueColumnConstraint(SQLParser.UniqueColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultConstraint(SQLParser.DefaultConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultConstraint(SQLParser.DefaultConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoIncrementConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementConstraint(SQLParser.AutoIncrementConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementConstraint(SQLParser.AutoIncrementConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referencesConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferencesConstraint(SQLParser.ReferencesConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referencesConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferencesConstraint(SQLParser.ReferencesConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckColumnConstraint(SQLParser.CheckColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckColumnConstraint(SQLParser.CheckColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(SQLParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(SQLParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueTableConstraint(SQLParser.UniqueTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueTableConstraint(SQLParser.UniqueTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyConstraint(SQLParser.ForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyConstraint(SQLParser.ForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(SQLParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(SQLParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNamedConstraint(SQLParser.NamedConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNamedConstraint(SQLParser.NamedConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameList(SQLParser.ColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameList(SQLParser.ColumnNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(SQLParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(SQLParser.ReferenceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStatement(SQLParser.DropTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStatement(SQLParser.DropTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStatement(SQLParser.AlterTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStatement(SQLParser.AlterTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(SQLParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(SQLParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraint(SQLParser.AddConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraint(SQLParser.AddConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterDropColumn(SQLParser.DropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitDropColumn(SQLParser.DropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraint(SQLParser.DropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraint(SQLParser.DropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropPrimaryKey}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterDropPrimaryKey(SQLParser.DropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropPrimaryKey}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitDropPrimaryKey(SQLParser.DropPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropForeignKey}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignKey(SQLParser.DropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropForeignKey}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignKey(SQLParser.DropForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropIndexAction}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexAction(SQLParser.DropIndexActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropIndexAction}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexAction(SQLParser.DropIndexActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(SQLParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(SQLParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(SQLParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(SQLParser.ChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumn(SQLParser.RenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumn(SQLParser.RenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#truncateTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTableStatement(SQLParser.TruncateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#truncateTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTableStatement(SQLParser.TruncateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexColumnList}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnList(SQLParser.IndexColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexColumnList}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnList(SQLParser.IndexColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexColumn}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumn(SQLParser.IndexColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexColumn}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumn(SQLParser.IndexColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexStatement(SQLParser.DropIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexStatement(SQLParser.DropIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseStatement(SQLParser.CreateDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseStatement(SQLParser.CreateDatabaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabaseStatement(SQLParser.DropDatabaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropDatabaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabaseStatement(SQLParser.DropDatabaseStatementContext ctx);
}