// Generated from src/main/java/com/sqlcompiler/parser/SQLParser.g4 by ANTLR 4.13.1

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
	 * Visit a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(SQLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SQLParser.StatementContext ctx);
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
	 * Visit a parse tree produced by the {@code qualifiedTableName}
	 * labeled alternative in {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedTableName(SQLParser.QualifiedTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTableName}
	 * labeled alternative in {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTableName(SQLParser.SimpleTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SQLParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLParser.IdentifierContext ctx);
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
	 * Visit a parse tree produced by the {@code simpleComparison}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleComparison(SQLParser.SimpleComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(SQLParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notInExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInExpression(SQLParser.NotInExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExpression(SQLParser.BetweenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullExpression(SQLParser.IsNullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNotNullExpression}
	 * labeled alternative in {@link SQLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotNullExpression(SQLParser.IsNotNullExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link SQLParser#valueItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueItem(SQLParser.ValueItemContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(SQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SQLParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinitionList(SQLParser.ColumnDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SQLParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(SQLParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(SQLParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigintType(SQLParser.BigintTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallintType(SQLParser.SmallintTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyintType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyintType(SQLParser.TinyintTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(SQLParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(SQLParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalType(SQLParser.DecimalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(SQLParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varcharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarcharType(SQLParser.VarcharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nvarcharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvarcharType(SQLParser.NvarcharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(SQLParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ncharType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcharType(SQLParser.NcharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextType(SQLParser.TextTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ntextType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtextType(SQLParser.NtextTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(SQLParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(SQLParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateType(SQLParser.DateTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datetimeType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeType(SQLParser.DatetimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampType(SQLParser.TimestampTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeType(SQLParser.TimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blobType}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobType(SQLParser.BlobTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notNullConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullConstraint(SQLParser.NotNullConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullConstraint(SQLParser.NullConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyColumnConstraint(SQLParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueColumnConstraint(SQLParser.UniqueColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultConstraint(SQLParser.DefaultConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code autoIncrementConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoIncrementConstraint(SQLParser.AutoIncrementConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referencesConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencesConstraint(SQLParser.ReferencesConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link SQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckColumnConstraint(SQLParser.CheckColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyTableConstraint(SQLParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueTableConstraint(SQLParser.UniqueTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyConstraint(SQLParser.ForeignKeyConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableConstraint(SQLParser.CheckTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedConstraint}
	 * labeled alternative in {@link SQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedConstraint(SQLParser.NamedConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameList(SQLParser.ColumnNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#referenceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceAction(SQLParser.ReferenceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableStatement(SQLParser.DropTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStatement(SQLParser.AlterTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(SQLParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraint(SQLParser.AddConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumn(SQLParser.DropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraint(SQLParser.DropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropPrimaryKey}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPrimaryKey(SQLParser.DropPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropForeignKey}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignKey(SQLParser.DropForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropIndexAction}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexAction(SQLParser.DropIndexActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modifyColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumn(SQLParser.ModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeColumn(SQLParser.ChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link SQLParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumn(SQLParser.RenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#truncateTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTableStatement(SQLParser.TruncateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnList(SQLParser.IndexColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumn(SQLParser.IndexColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexStatement(SQLParser.DropIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseStatement(SQLParser.CreateDatabaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropDatabaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabaseStatement(SQLParser.DropDatabaseStatementContext ctx);
}