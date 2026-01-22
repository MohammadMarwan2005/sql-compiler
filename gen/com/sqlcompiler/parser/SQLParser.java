// Generated from src/main/java/com/sqlcompiler/parser/SQLParser.g4 by ANTLR 4.13.1

package com.sqlcompiler.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, INSERT=4, INTO=5, UPDATE=6, DELETE=7, SET=8, 
		VALUES=9, JOIN=10, INNER=11, LEFT=12, RIGHT=13, ON=14, AND=15, OR=16, 
		NOT=17, AS=18, ORDER=19, BY=20, GROUP=21, HAVING=22, LIMIT=23, DISTINCT=24, 
		ASC=25, DESC=26, CREATE=27, DROP=28, ALTER=29, TRUNCATE=30, TABLE=31, 
		DATABASE=32, INDEX=33, COLUMN=34, ADD=35, MODIFY=36, RENAME=37, CHANGE=38, 
		TO=39, IF=40, EXISTS=41, CASCADE=42, RESTRICT=43, PRIMARY=44, KEY=45, 
		FOREIGN=46, REFERENCES=47, UNIQUE=48, CHECK=49, DEFAULT=50, AUTO_INCREMENT=51, 
		CONSTRAINT=52, CLUSTERED=53, NONCLUSTERED=54, TYPE_INT=55, TYPE_INTEGER=56, 
		TYPE_BIGINT=57, TYPE_SMALLINT=58, TYPE_TINYINT=59, TYPE_FLOAT=60, TYPE_DOUBLE=61, 
		TYPE_DECIMAL=62, TYPE_NUMERIC=63, TYPE_VARCHAR=64, TYPE_NVARCHAR=65, TYPE_CHAR=66, 
		TYPE_NCHAR=67, TYPE_TEXT=68, TYPE_NTEXT=69, TYPE_BOOLEAN=70, TYPE_BOOL=71, 
		TYPE_DATE=72, TYPE_DATETIME=73, TYPE_TIMESTAMP=74, TYPE_TIME=75, TYPE_BLOB=76, 
		TYPE_MAX=77, TRUE=78, FALSE=79, NULL=80, LIKE=81, IN=82, IS=83, BETWEEN=84, 
		IDENT=85, QUOTED_IDENT=86, BRACKET_IDENT=87, USER_VAR=88, HEX_INT=89, 
		BINARY_INT=90, INT=91, FLOAT=92, STRING=93, HEX_STRING=94, BIT_STRING=95, 
		EQ=96, NE=97, LT=98, LE=99, GT=100, GE=101, PLUS=102, MINUS=103, STAR=104, 
		DIV=105, MOD=106, AND_OP=107, OR_OP=108, NOT_OP=109, COMMA=110, DOT=111, 
		SEMICOLON=112, LPAREN=113, RPAREN=114, LINE_COMMENT=115, BLOCK_COMMENT=116, 
		WS=117, LINE_CONTINUATION=118, ERROR_CHAR=119;
	public static final int
		RULE_script = 0, RULE_query = 1, RULE_statement = 2, RULE_selectStatement = 3, 
		RULE_selectList = 4, RULE_columnList = 5, RULE_column = 6, RULE_tableName = 7, 
		RULE_schemaName = 8, RULE_identifier = 9, RULE_expression = 10, RULE_logicalOrExpression = 11, 
		RULE_logicalAndExpression = 12, RULE_comparisonExpression = 13, RULE_additiveExpression = 14, 
		RULE_multiplicativeExpression = 15, RULE_unaryExpression = 16, RULE_primaryExpression = 17, 
		RULE_comparisonOp = 18, RULE_literal = 19, RULE_orderByList = 20, RULE_orderByItem = 21, 
		RULE_insertStatement = 22, RULE_valueList = 23, RULE_valueItem = 24, RULE_updateStatement = 25, 
		RULE_assignmentList = 26, RULE_assignment = 27, RULE_deleteStatement = 28, 
		RULE_createTableStatement = 29, RULE_tableIdentifier = 30, RULE_columnDefinitionList = 31, 
		RULE_columnDefinition = 32, RULE_dataType = 33, RULE_columnConstraint = 34, 
		RULE_tableConstraint = 35, RULE_columnNameList = 36, RULE_referenceAction = 37, 
		RULE_dropTableStatement = 38, RULE_alterTableStatement = 39, RULE_alterAction = 40, 
		RULE_truncateTableStatement = 41, RULE_createIndexStatement = 42, RULE_indexColumnList = 43, 
		RULE_indexColumn = 44, RULE_dropIndexStatement = 45, RULE_createDatabaseStatement = 46, 
		RULE_dropDatabaseStatement = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "query", "statement", "selectStatement", "selectList", "columnList", 
			"column", "tableName", "schemaName", "identifier", "expression", "logicalOrExpression", 
			"logicalAndExpression", "comparisonExpression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "primaryExpression", "comparisonOp", 
			"literal", "orderByList", "orderByItem", "insertStatement", "valueList", 
			"valueItem", "updateStatement", "assignmentList", "assignment", "deleteStatement", 
			"createTableStatement", "tableIdentifier", "columnDefinitionList", "columnDefinition", 
			"dataType", "columnConstraint", "tableConstraint", "columnNameList", 
			"referenceAction", "dropTableStatement", "alterTableStatement", "alterAction", 
			"truncateTableStatement", "createIndexStatement", "indexColumnList", 
			"indexColumn", "dropIndexStatement", "createDatabaseStatement", "dropDatabaseStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", null, null, null, "','", "'.'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "INSERT", "INTO", "UPDATE", "DELETE", 
			"SET", "VALUES", "JOIN", "INNER", "LEFT", "RIGHT", "ON", "AND", "OR", 
			"NOT", "AS", "ORDER", "BY", "GROUP", "HAVING", "LIMIT", "DISTINCT", "ASC", 
			"DESC", "CREATE", "DROP", "ALTER", "TRUNCATE", "TABLE", "DATABASE", "INDEX", 
			"COLUMN", "ADD", "MODIFY", "RENAME", "CHANGE", "TO", "IF", "EXISTS", 
			"CASCADE", "RESTRICT", "PRIMARY", "KEY", "FOREIGN", "REFERENCES", "UNIQUE", 
			"CHECK", "DEFAULT", "AUTO_INCREMENT", "CONSTRAINT", "CLUSTERED", "NONCLUSTERED", 
			"TYPE_INT", "TYPE_INTEGER", "TYPE_BIGINT", "TYPE_SMALLINT", "TYPE_TINYINT", 
			"TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_DECIMAL", "TYPE_NUMERIC", "TYPE_VARCHAR", 
			"TYPE_NVARCHAR", "TYPE_CHAR", "TYPE_NCHAR", "TYPE_TEXT", "TYPE_NTEXT", 
			"TYPE_BOOLEAN", "TYPE_BOOL", "TYPE_DATE", "TYPE_DATETIME", "TYPE_TIMESTAMP", 
			"TYPE_TIME", "TYPE_BLOB", "TYPE_MAX", "TRUE", "FALSE", "NULL", "LIKE", 
			"IN", "IS", "BETWEEN", "IDENT", "QUOTED_IDENT", "BRACKET_IDENT", "USER_VAR", 
			"HEX_INT", "BINARY_INT", "INT", "FLOAT", "STRING", "HEX_STRING", "BIT_STRING", 
			"EQ", "NE", "LT", "LE", "GT", "GE", "PLUS", "MINUS", "STAR", "DIV", "MOD", 
			"AND_OP", "OR_OP", "NOT_OP", "COMMA", "DOT", "SEMICOLON", "LPAREN", "RPAREN", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS", "LINE_CONTINUATION", "ERROR_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2013266130L) != 0) );
			setState(101);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			statement();
			setState(104);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public DropTableStatementContext dropTableStatement() {
			return getRuleContext(DropTableStatementContext.class,0);
		}
		public AlterTableStatementContext alterTableStatement() {
			return getRuleContext(AlterTableStatementContext.class,0);
		}
		public TruncateTableStatementContext truncateTableStatement() {
			return getRuleContext(TruncateTableStatementContext.class,0);
		}
		public CreateIndexStatementContext createIndexStatement() {
			return getRuleContext(CreateIndexStatementContext.class,0);
		}
		public DropIndexStatementContext dropIndexStatement() {
			return getRuleContext(DropIndexStatementContext.class,0);
		}
		public CreateDatabaseStatementContext createDatabaseStatement() {
			return getRuleContext(CreateDatabaseStatementContext.class,0);
		}
		public DropDatabaseStatementContext dropDatabaseStatement() {
			return getRuleContext(DropDatabaseStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				selectStatement();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(107);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				insertStatement();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(111);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				updateStatement();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(115);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				deleteStatement();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(119);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				createTableStatement();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(123);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				dropTableStatement();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(127);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				alterTableStatement();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(131);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				truncateTableStatement();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(135);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				createIndexStatement();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(139);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				dropIndexStatement();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(143);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				createDatabaseStatement();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(147);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(150);
				dropDatabaseStatement();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(151);
					match(SEMICOLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(SQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SQLParser.BY, i);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public OrderByListContext orderByList() {
			return getRuleContext(OrderByListContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SELECT);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(157);
				match(DISTINCT);
				}
			}

			setState(160);
			selectList();
			setState(161);
			match(FROM);
			setState(162);
			tableName();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(163);
				match(WHERE);
				setState(164);
				expression();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(167);
				match(GROUP);
				setState(168);
				match(BY);
				setState(169);
				columnList();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(172);
				match(HAVING);
				setState(173);
				expression();
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(176);
				match(ORDER);
				setState(177);
				match(BY);
				setState(178);
				orderByList();
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(181);
				match(LIMIT);
				setState(182);
				match(INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectListContext extends ParserRuleContext {
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
	 
		public SelectListContext() { }
		public void copyFrom(SelectListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectAllContext extends SelectListContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public SelectAllContext(SelectListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectColumnsContext extends SelectListContext {
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public SelectColumnsContext(SelectListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelectColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelectColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSelectColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectList);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(STAR);
				}
				break;
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case IDENT:
			case QUOTED_IDENT:
			case BRACKET_IDENT:
			case USER_VAR:
			case HEX_INT:
			case BINARY_INT:
			case INT:
			case FLOAT:
			case STRING:
			case HEX_STRING:
			case BIT_STRING:
			case LPAREN:
				_localctx = new SelectColumnsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				columnList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnListContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			column();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				column();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	 
		public ColumnContext() { }
		public void copyFrom(ColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnWithExpressionContext extends ColumnContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnWithExpressionContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnWithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnWithExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnWithExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ColumnContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public ColumnNameContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(197);
					tableName();
					setState(198);
					match(DOT);
					}
					break;
				}
				setState(202);
				identifier();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(203);
					match(AS);
					setState(204);
					identifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new ColumnWithExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expression();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(208);
					match(AS);
					setState(209);
					identifier();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	 
		public TableNameContext() { }
		public void copyFrom(TableNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedTableNameContext extends TableNameContext {
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public QualifiedTableNameContext(TableNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQualifiedTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQualifiedTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitQualifiedTableName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTableNameContext extends TableNameContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public SimpleTableNameContext(TableNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimpleTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimpleTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSimpleTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableName);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new QualifiedTableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				schemaName();
				setState(215);
				match(DOT);
				setState(216);
				identifier();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(217);
					match(AS);
					setState(218);
					identifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new SimpleTableNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				identifier();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(222);
					match(AS);
					setState(223);
					identifier();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SQLParser.IDENT, 0); }
		public TerminalNode QUOTED_IDENT() { return getToken(SQLParser.QUOTED_IDENT, 0); }
		public TerminalNode BRACKET_IDENT() { return getToken(SQLParser.BRACKET_IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR_OP() { return getTokens(SQLParser.OR_OP); }
		public TerminalNode OR_OP(int i) {
			return getToken(SQLParser.OR_OP, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			logicalAndExpression();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(235);
				match(OR_OP);
				setState(236);
				logicalAndExpression();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> AND_OP() { return getTokens(SQLParser.AND_OP); }
		public TerminalNode AND_OP(int i) {
			return getToken(SQLParser.AND_OP, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			comparisonExpression();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(243);
				match(AND_OP);
				setState(244);
				comparisonExpression();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	 
		public ComparisonExpressionContext() { }
		public void copyFrom(ComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InExpressionContext extends ComparisonExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public InExpressionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BetweenExpressionContext extends ComparisonExpressionContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public BetweenExpressionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBetweenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBetweenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBetweenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleComparisonContext extends ComparisonExpressionContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public SimpleComparisonContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimpleComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimpleComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSimpleComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInExpressionContext extends ComparisonExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public NotInExpressionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNotInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNotInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNullExpressionContext extends ComparisonExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public IsNullExpressionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIsNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIsNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIsNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotNullExpressionContext extends ComparisonExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public IsNotNullExpressionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIsNotNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIsNotNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIsNotNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparisonExpression);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new SimpleComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				additiveExpression();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 2064385L) != 0)) {
					{
					setState(251);
					comparisonOp();
					setState(252);
					additiveExpression();
					}
				}

				}
				break;
			case 2:
				_localctx = new InExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				additiveExpression();
				setState(257);
				match(IN);
				setState(258);
				match(LPAREN);
				setState(259);
				valueList();
				setState(260);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new NotInExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				additiveExpression();
				setState(263);
				match(NOT);
				setState(264);
				match(IN);
				setState(265);
				match(LPAREN);
				setState(266);
				valueList();
				setState(267);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new BetweenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				additiveExpression();
				setState(270);
				match(BETWEEN);
				setState(271);
				additiveExpression();
				setState(272);
				match(AND);
				setState(273);
				additiveExpression();
				}
				break;
			case 5:
				_localctx = new IsNullExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				additiveExpression();
				setState(276);
				match(IS);
				setState(277);
				match(NULL);
				}
				break;
			case 6:
				_localctx = new IsNotNullExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				additiveExpression();
				setState(280);
				match(IS);
				setState(281);
				match(NOT);
				setState(282);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			multiplicativeExpression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				multiplicativeExpression();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(SQLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(SQLParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SQLParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SQLParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SQLParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			unaryExpression();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 7L) != 0)) {
				{
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				unaryExpression();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends UnaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends UnaryExpressionContext {
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public NotExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unaryExpression);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(NOT);
				setState(303);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case IDENT:
			case QUOTED_IDENT:
			case BRACKET_IDENT:
			case USER_VAR:
			case HEX_INT:
			case BINARY_INT:
			case INT:
			case FLOAT:
			case STRING:
			case HEX_STRING:
			case BIT_STRING:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UserVariableContext extends PrimaryExpressionContext {
		public TerminalNode USER_VAR() { return getToken(SQLParser.USER_VAR, 0); }
		public UserVariableContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUserVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUserVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public ParenExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primaryExpression);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(LPAREN);
				setState(308);
				expression();
				setState(309);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ColumnReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(311);
					tableName();
					setState(312);
					match(DOT);
					}
					break;
				}
				setState(316);
				identifier();
				}
				break;
			case 3:
				_localctx = new UserVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(USER_VAR);
				}
				break;
			case 4:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SQLParser.NE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LE() { return getToken(SQLParser.LE, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GE() { return getToken(SQLParser.GE, 0); }
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitComparisonOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitComparisonOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 2064385L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public TerminalNode HEX_INT() { return getToken(SQLParser.HEX_INT, 0); }
		public TerminalNode BINARY_INT() { return getToken(SQLParser.BINARY_INT, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public TerminalNode HEX_STRING() { return getToken(SQLParser.HEX_STRING, 0); }
		public TerminalNode BIT_STRING() { return getToken(SQLParser.BIT_STRING, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public TerminalNode USER_VAR() { return getToken(SQLParser.USER_VAR, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 261127L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByListContext extends ParserRuleContext {
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public OrderByListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrderByList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrderByList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOrderByList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByListContext orderByList() throws RecognitionException {
		OrderByListContext _localctx = new OrderByListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orderByList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			orderByItem();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(326);
				match(COMMA);
				setState(327);
				orderByItem();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			column();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLParser.LPAREN, i);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLParser.RPAREN, i);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(INSERT);
			setState(338);
			match(INTO);
			setState(339);
			tableName();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(340);
				match(LPAREN);
				setState(341);
				columnList();
				setState(342);
				match(RPAREN);
				}
			}

			setState(346);
			match(VALUES);
			setState(347);
			match(LPAREN);
			setState(348);
			valueList();
			setState(349);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueItemContext> valueItem() {
			return getRuleContexts(ValueItemContext.class);
		}
		public ValueItemContext valueItem(int i) {
			return getRuleContext(ValueItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			valueItem();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352);
				match(COMMA);
				setState(353);
				valueItem();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueItemContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterValueItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitValueItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitValueItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueItemContext valueItem() throws RecognitionException {
		ValueItemContext _localctx = new ValueItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valueItem);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(UPDATE);
			setState(364);
			tableName();
			setState(365);
			match(SET);
			setState(366);
			assignmentList();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(367);
				match(WHERE);
				setState(368);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			assignment();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				assignment();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			identifier();
			setState(380);
			match(EQ);
			setState(381);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(DELETE);
			setState(384);
			match(FROM);
			setState(385);
			tableName();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(386);
				match(WHERE);
				setState(387);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ColumnDefinitionListContext columnDefinitionList() {
			return getRuleContext(ColumnDefinitionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TableConstraintContext> tableConstraint() {
			return getRuleContexts(TableConstraintContext.class);
		}
		public TableConstraintContext tableConstraint(int i) {
			return getRuleContext(TableConstraintContext.class,i);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreateTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCreateTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_createTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(CREATE);
			setState(391);
			match(TABLE);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(392);
				match(IF);
				setState(393);
				match(NOT);
				setState(394);
				match(EXISTS);
				}
			}

			setState(397);
			tableIdentifier();
			setState(398);
			match(LPAREN);
			setState(399);
			columnDefinitionList();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				tableConstraint();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(409);
				schemaName();
				setState(410);
				match(DOT);
				}
				break;
			}
			setState(414);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionListContext extends ParserRuleContext {
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ColumnDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionListContext columnDefinitionList() throws RecognitionException {
		ColumnDefinitionListContext _localctx = new ColumnDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_columnDefinitionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			columnDefinition();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					columnDefinition();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			identifier();
			setState(425);
			dataType();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & -9223372003434561535L) != 0)) {
				{
				{
				setState(426);
				columnConstraint();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleTypeContext extends DataTypeContext {
		public TerminalNode TYPE_DOUBLE() { return getToken(SQLParser.TYPE_DOUBLE, 0); }
		public DoubleTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends DataTypeContext {
		public TerminalNode TYPE_CHAR() { return getToken(SQLParser.TYPE_CHAR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public CharTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NtextTypeContext extends DataTypeContext {
		public TerminalNode TYPE_NTEXT() { return getToken(SQLParser.TYPE_NTEXT, 0); }
		public NtextTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNtextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNtextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNtextType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalTypeContext extends DataTypeContext {
		public TerminalNode TYPE_DECIMAL() { return getToken(SQLParser.TYPE_DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public DecimalTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDecimalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDecimalType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends DataTypeContext {
		public TerminalNode TYPE_BOOLEAN() { return getToken(SQLParser.TYPE_BOOLEAN, 0); }
		public BooleanTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerTypeContext extends DataTypeContext {
		public TerminalNode TYPE_INTEGER() { return getToken(SQLParser.TYPE_INTEGER, 0); }
		public IntegerTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NcharTypeContext extends DataTypeContext {
		public TerminalNode TYPE_NCHAR() { return getToken(SQLParser.TYPE_NCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public NcharTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNcharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNcharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNcharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends DataTypeContext {
		public TerminalNode TYPE_INT() { return getToken(SQLParser.TYPE_INT, 0); }
		public IntTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeTypeContext extends DataTypeContext {
		public TerminalNode TYPE_TIME() { return getToken(SQLParser.TYPE_TIME, 0); }
		public TimeTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextTypeContext extends DataTypeContext {
		public TerminalNode TYPE_TEXT() { return getToken(SQLParser.TYPE_TEXT, 0); }
		public TextTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTextType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTextType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyintTypeContext extends DataTypeContext {
		public TerminalNode TYPE_TINYINT() { return getToken(SQLParser.TYPE_TINYINT, 0); }
		public TinyintTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTinyintType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTinyintType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTinyintType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTypeContext extends DataTypeContext {
		public TerminalNode TYPE_BOOL() { return getToken(SQLParser.TYPE_BOOL, 0); }
		public BoolTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallintTypeContext extends DataTypeContext {
		public TerminalNode TYPE_SMALLINT() { return getToken(SQLParser.TYPE_SMALLINT, 0); }
		public SmallintTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSmallintType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSmallintType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitSmallintType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends DataTypeContext {
		public TerminalNode TYPE_FLOAT() { return getToken(SQLParser.TYPE_FLOAT, 0); }
		public FloatTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DateTypeContext extends DataTypeContext {
		public TerminalNode TYPE_DATE() { return getToken(SQLParser.TYPE_DATE, 0); }
		public DateTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDateType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDateType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NvarcharTypeContext extends DataTypeContext {
		public TerminalNode TYPE_NVARCHAR() { return getToken(SQLParser.TYPE_NVARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode TYPE_MAX() { return getToken(SQLParser.TYPE_MAX, 0); }
		public NvarcharTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNvarcharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNvarcharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNvarcharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DatetimeTypeContext extends DataTypeContext {
		public TerminalNode TYPE_DATETIME() { return getToken(SQLParser.TYPE_DATETIME, 0); }
		public DatetimeTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDatetimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDatetimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDatetimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericTypeContext extends DataTypeContext {
		public TerminalNode TYPE_NUMERIC() { return getToken(SQLParser.TYPE_NUMERIC, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public NumericTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampTypeContext extends DataTypeContext {
		public TerminalNode TYPE_TIMESTAMP() { return getToken(SQLParser.TYPE_TIMESTAMP, 0); }
		public TimestampTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTimestampType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTimestampType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTimestampType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigintTypeContext extends DataTypeContext {
		public TerminalNode TYPE_BIGINT() { return getToken(SQLParser.TYPE_BIGINT, 0); }
		public BigintTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBigintType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBigintType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBigintType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlobTypeContext extends DataTypeContext {
		public TerminalNode TYPE_BLOB() { return getToken(SQLParser.TYPE_BLOB, 0); }
		public BlobTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBlobType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitBlobType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarcharTypeContext extends DataTypeContext {
		public TerminalNode TYPE_VARCHAR() { return getToken(SQLParser.TYPE_VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode TYPE_MAX() { return getToken(SQLParser.TYPE_MAX, 0); }
		public VarcharTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterVarcharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitVarcharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitVarcharType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dataType);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(TYPE_INT);
				}
				break;
			case TYPE_INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(TYPE_INTEGER);
				}
				break;
			case TYPE_BIGINT:
				_localctx = new BigintTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(TYPE_BIGINT);
				}
				break;
			case TYPE_SMALLINT:
				_localctx = new SmallintTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(TYPE_SMALLINT);
				}
				break;
			case TYPE_TINYINT:
				_localctx = new TinyintTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				match(TYPE_TINYINT);
				}
				break;
			case TYPE_FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				match(TYPE_FLOAT);
				}
				break;
			case TYPE_DOUBLE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(438);
				match(TYPE_DOUBLE);
				}
				break;
			case TYPE_DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(439);
				match(TYPE_DECIMAL);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(440);
					match(LPAREN);
					setState(441);
					match(INT);
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(442);
						match(COMMA);
						setState(443);
						match(INT);
						}
					}

					setState(446);
					match(RPAREN);
					}
				}

				}
				break;
			case TYPE_NUMERIC:
				_localctx = new NumericTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(449);
				match(TYPE_NUMERIC);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(450);
					match(LPAREN);
					setState(451);
					match(INT);
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(452);
						match(COMMA);
						setState(453);
						match(INT);
						}
					}

					setState(456);
					match(RPAREN);
					}
				}

				}
				break;
			case TYPE_VARCHAR:
				_localctx = new VarcharTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(459);
				match(TYPE_VARCHAR);
				setState(460);
				match(LPAREN);
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==TYPE_MAX || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(462);
				match(RPAREN);
				}
				break;
			case TYPE_NVARCHAR:
				_localctx = new NvarcharTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(463);
				match(TYPE_NVARCHAR);
				setState(464);
				match(LPAREN);
				setState(465);
				_la = _input.LA(1);
				if ( !(_la==TYPE_MAX || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(466);
				match(RPAREN);
				}
				break;
			case TYPE_CHAR:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(467);
				match(TYPE_CHAR);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(468);
					match(LPAREN);
					setState(469);
					match(INT);
					setState(470);
					match(RPAREN);
					}
				}

				}
				break;
			case TYPE_NCHAR:
				_localctx = new NcharTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(473);
				match(TYPE_NCHAR);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(474);
					match(LPAREN);
					setState(475);
					match(INT);
					setState(476);
					match(RPAREN);
					}
				}

				}
				break;
			case TYPE_TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(479);
				match(TYPE_TEXT);
				}
				break;
			case TYPE_NTEXT:
				_localctx = new NtextTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(480);
				match(TYPE_NTEXT);
				}
				break;
			case TYPE_BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(481);
				match(TYPE_BOOLEAN);
				}
				break;
			case TYPE_BOOL:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(482);
				match(TYPE_BOOL);
				}
				break;
			case TYPE_DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(483);
				match(TYPE_DATE);
				}
				break;
			case TYPE_DATETIME:
				_localctx = new DatetimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(484);
				match(TYPE_DATETIME);
				}
				break;
			case TYPE_TIMESTAMP:
				_localctx = new TimestampTypeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(485);
				match(TYPE_TIMESTAMP);
				}
				break;
			case TYPE_TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(486);
				match(TYPE_TIME);
				}
				break;
			case TYPE_BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(487);
				match(TYPE_BLOB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	 
		public ColumnConstraintContext() { }
		public void copyFrom(ColumnConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullConstraintContext extends ColumnConstraintContext {
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public NullConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNullConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNullConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNullConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AutoIncrementConstraintContext extends ColumnConstraintContext {
		public TerminalNode AUTO_INCREMENT() { return getToken(SQLParser.AUTO_INCREMENT, 0); }
		public AutoIncrementConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAutoIncrementConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAutoIncrementConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAutoIncrementConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotNullConstraintContext extends ColumnConstraintContext {
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public NotNullConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNotNullConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNotNullConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNotNullConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultConstraintContext extends ColumnConstraintContext {
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DefaultConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDefaultConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDefaultConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDefaultConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyColumnConstraintContext extends ColumnConstraintContext {
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLParser.NONCLUSTERED, 0); }
		public PrimaryKeyColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrimaryKeyColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrimaryKeyColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPrimaryKeyColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckColumnConstraintContext extends ColumnConstraintContext {
		public TerminalNode CHECK() { return getToken(SQLParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public CheckColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCheckColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCheckColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCheckColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniqueColumnConstraintContext extends ColumnConstraintContext {
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public UniqueColumnConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUniqueColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUniqueColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUniqueColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferencesConstraintContext extends ColumnConstraintContext {
		public TerminalNode REFERENCES() { return getToken(SQLParser.REFERENCES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public ReferencesConstraintContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferencesConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferencesConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitReferencesConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_columnConstraint);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNullConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(NOT);
				setState(491);
				match(NULL);
				}
				break;
			case NULL:
				_localctx = new NullConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(NULL);
				}
				break;
			case PRIMARY:
				_localctx = new PrimaryKeyColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(PRIMARY);
				setState(494);
				match(KEY);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(495);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case UNIQUE:
				_localctx = new UniqueColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				match(UNIQUE);
				}
				break;
			case DEFAULT:
				_localctx = new DefaultConstraintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				match(DEFAULT);
				setState(500);
				literal();
				}
				break;
			case AUTO_INCREMENT:
				_localctx = new AutoIncrementConstraintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				match(AUTO_INCREMENT);
				}
				break;
			case REFERENCES:
				_localctx = new ReferencesConstraintContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(502);
				match(REFERENCES);
				setState(503);
				tableIdentifier();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(504);
					match(LPAREN);
					setState(505);
					identifier();
					setState(506);
					match(RPAREN);
					}
				}

				}
				break;
			case CHECK:
				_localctx = new CheckColumnConstraintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(510);
				match(CHECK);
				setState(511);
				match(LPAREN);
				setState(512);
				expression();
				setState(513);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	 
		public TableConstraintContext() { }
		public void copyFrom(TableConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForeignKeyConstraintContext extends TableConstraintContext {
		public TerminalNode FOREIGN() { return getToken(SQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLParser.LPAREN, i);
		}
		public List<ColumnNameListContext> columnNameList() {
			return getRuleContexts(ColumnNameListContext.class);
		}
		public ColumnNameListContext columnNameList(int i) {
			return getRuleContext(ColumnNameListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLParser.RPAREN, i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLParser.REFERENCES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> ON() { return getTokens(SQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public List<ReferenceActionContext> referenceAction() {
			return getRuleContexts(ReferenceActionContext.class);
		}
		public ReferenceActionContext referenceAction(int i) {
			return getRuleContext(ReferenceActionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public ForeignKeyConstraintContext(TableConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterForeignKeyConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitForeignKeyConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitForeignKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniqueTableConstraintContext extends TableConstraintContext {
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLParser.NONCLUSTERED, 0); }
		public UniqueTableConstraintContext(TableConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUniqueTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUniqueTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitUniqueTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckTableConstraintContext extends TableConstraintContext {
		public TerminalNode CHECK() { return getToken(SQLParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public CheckTableConstraintContext(TableConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCheckTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCheckTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCheckTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedConstraintContext extends TableConstraintContext {
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public NamedConstraintContext(TableConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNamedConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNamedConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitNamedConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyTableConstraintContext extends TableConstraintContext {
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLParser.NONCLUSTERED, 0); }
		public PrimaryKeyTableConstraintContext(TableConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrimaryKeyTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrimaryKeyTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitPrimaryKeyTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableConstraint);
		int _la;
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				_localctx = new PrimaryKeyTableConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(PRIMARY);
				setState(518);
				match(KEY);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(519);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(522);
				match(LPAREN);
				setState(523);
				columnNameList();
				setState(524);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				_localctx = new UniqueTableConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(UNIQUE);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(527);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(530);
					match(KEY);
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 7L) != 0)) {
					{
					setState(533);
					identifier();
					}
				}

				setState(536);
				match(LPAREN);
				setState(537);
				columnNameList();
				setState(538);
				match(RPAREN);
				}
				break;
			case FOREIGN:
				_localctx = new ForeignKeyConstraintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				match(FOREIGN);
				setState(541);
				match(KEY);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 7L) != 0)) {
					{
					setState(542);
					identifier();
					}
				}

				setState(545);
				match(LPAREN);
				setState(546);
				columnNameList();
				setState(547);
				match(RPAREN);
				setState(548);
				match(REFERENCES);
				setState(549);
				tableIdentifier();
				setState(550);
				match(LPAREN);
				setState(551);
				columnNameList();
				setState(552);
				match(RPAREN);
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(553);
					match(ON);
					setState(554);
					match(DELETE);
					setState(555);
					referenceAction();
					}
					break;
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(558);
					match(ON);
					setState(559);
					match(UPDATE);
					setState(560);
					referenceAction();
					}
				}

				}
				break;
			case CHECK:
				_localctx = new CheckTableConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				match(CHECK);
				setState(564);
				match(LPAREN);
				setState(565);
				expression();
				setState(566);
				match(RPAREN);
				}
				break;
			case CONSTRAINT:
				_localctx = new NamedConstraintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				match(CONSTRAINT);
				setState(569);
				identifier();
				setState(570);
				tableConstraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitColumnNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			identifier();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(575);
				match(COMMA);
				setState(576);
				identifier();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceActionContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(SQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLParser.RESTRICT, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLParser.DEFAULT, 0); }
		public ReferenceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferenceAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferenceAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitReferenceAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceActionContext referenceAction() throws RecognitionException {
		ReferenceActionContext _localctx = new ReferenceActionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_referenceAction);
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(CASCADE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(RESTRICT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(SET);
				setState(585);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(SET);
				setState(587);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLParser.RESTRICT, 0); }
		public DropTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableStatementContext dropTableStatement() throws RecognitionException {
		DropTableStatementContext _localctx = new DropTableStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dropTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(DROP);
			setState(591);
			match(TABLE);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(592);
				match(IF);
				setState(593);
				match(EXISTS);
				}
			}

			setState(596);
			tableIdentifier();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(597);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<AlterActionContext> alterAction() {
			return getRuleContexts(AlterActionContext.class);
		}
		public AlterActionContext alterAction(int i) {
			return getRuleContext(AlterActionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public AlterTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAlterTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAlterTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAlterTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableStatementContext alterTableStatement() throws RecognitionException {
		AlterTableStatementContext _localctx = new AlterTableStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alterTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(ALTER);
			setState(601);
			match(TABLE);
			setState(602);
			tableIdentifier();
			setState(603);
			alterAction();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(604);
				match(COMMA);
				setState(605);
				alterAction();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterActionContext extends ParserRuleContext {
		public AlterActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterAction; }
	 
		public AlterActionContext() { }
		public void copyFrom(AlterActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropIndexActionContext extends AlterActionContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropIndexActionContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropIndexAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropIndexAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropIndexAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddColumnContext extends AlterActionContext {
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public AddColumnContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropForeignKeyContext extends AlterActionContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropForeignKeyContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropForeignKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropConstraintContext extends AlterActionContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropConstraintContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddConstraintContext extends AlterActionContext {
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public AddConstraintContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAddConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAddConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitAddConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropPrimaryKeyContext extends AlterActionContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public DropPrimaryKeyContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableContext extends AlterActionContext {
		public TerminalNode RENAME() { return getToken(SQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RenameTableContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameColumnContext extends AlterActionContext {
		public TerminalNode RENAME() { return getToken(SQLParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public RenameColumnContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropColumnContext extends AlterActionContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode CASCADE() { return getToken(SQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SQLParser.RESTRICT, 0); }
		public DropColumnContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModifyColumnContext extends AlterActionContext {
		public TerminalNode MODIFY() { return getToken(SQLParser.MODIFY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ModifyColumnContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterModifyColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitModifyColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitModifyColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChangeColumnContext extends AlterActionContext {
		public TerminalNode CHANGE() { return getToken(SQLParser.CHANGE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ChangeColumnContext(AlterActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterActionContext alterAction() throws RecognitionException {
		AlterActionContext _localctx = new AlterActionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alterAction);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(ADD);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(612);
					match(COLUMN);
					}
				}

				setState(615);
				columnDefinition();
				}
				break;
			case 2:
				_localctx = new AddConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(ADD);
				setState(617);
				tableConstraint();
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				match(DROP);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(619);
					match(COLUMN);
					}
				}

				setState(622);
				identifier();
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(623);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new DropConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				match(DROP);
				setState(627);
				match(CONSTRAINT);
				setState(628);
				identifier();
				}
				break;
			case 5:
				_localctx = new DropPrimaryKeyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				match(DROP);
				setState(630);
				match(PRIMARY);
				setState(631);
				match(KEY);
				}
				break;
			case 6:
				_localctx = new DropForeignKeyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(632);
				match(DROP);
				setState(633);
				match(FOREIGN);
				setState(634);
				match(KEY);
				setState(635);
				identifier();
				}
				break;
			case 7:
				_localctx = new DropIndexActionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(636);
				match(DROP);
				setState(637);
				match(INDEX);
				setState(638);
				identifier();
				}
				break;
			case 8:
				_localctx = new ModifyColumnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(639);
				match(MODIFY);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(640);
					match(COLUMN);
					}
				}

				setState(643);
				identifier();
				setState(644);
				dataType();
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & -9223372003434561535L) != 0)) {
					{
					{
					setState(645);
					columnConstraint();
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 9:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(651);
				match(CHANGE);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(652);
					match(COLUMN);
					}
				}

				setState(655);
				identifier();
				setState(656);
				identifier();
				setState(657);
				dataType();
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & -9223372003434561535L) != 0)) {
					{
					{
					setState(658);
					columnConstraint();
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 10:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(664);
				match(RENAME);
				setState(665);
				match(TO);
				setState(666);
				tableIdentifier();
				}
				break;
			case 11:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(667);
				match(RENAME);
				setState(668);
				match(COLUMN);
				setState(669);
				identifier();
				setState(670);
				match(TO);
				setState(671);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TruncateTableStatementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLParser.TRUNCATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TruncateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTruncateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTruncateTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitTruncateTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableStatementContext truncateTableStatement() throws RecognitionException {
		TruncateTableStatementContext _localctx = new TruncateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_truncateTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(TRUNCATE);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(676);
				match(TABLE);
				}
			}

			setState(679);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public IndexColumnListContext indexColumnList() {
			return getRuleContext(IndexColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLParser.NONCLUSTERED, 0); }
		public CreateIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreateIndexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreateIndexStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCreateIndexStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexStatementContext createIndexStatement() throws RecognitionException {
		CreateIndexStatementContext _localctx = new CreateIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_createIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(CREATE);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(682);
				match(UNIQUE);
				}
			}

			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(685);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(688);
			match(INDEX);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(689);
				match(IF);
				setState(690);
				match(NOT);
				setState(691);
				match(EXISTS);
				}
			}

			setState(694);
			identifier();
			setState(695);
			match(ON);
			setState(696);
			tableIdentifier();
			setState(697);
			match(LPAREN);
			setState(698);
			indexColumnList();
			setState(699);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexColumnListContext extends ParserRuleContext {
		public List<IndexColumnContext> indexColumn() {
			return getRuleContexts(IndexColumnContext.class);
		}
		public IndexColumnContext indexColumn(int i) {
			return getRuleContext(IndexColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public IndexColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndexColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndexColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIndexColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexColumnListContext indexColumnList() throws RecognitionException {
		IndexColumnListContext _localctx = new IndexColumnListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_indexColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			indexColumn();
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(702);
				match(COMMA);
				setState(703);
				indexColumn();
				}
				}
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public IndexColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndexColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndexColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitIndexColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexColumnContext indexColumn() throws RecognitionException {
		IndexColumnContext _localctx = new IndexColumnContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indexColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			identifier();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropIndexStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DropIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropIndexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropIndexStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropIndexStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexStatementContext dropIndexStatement() throws RecognitionException {
		DropIndexStatementContext _localctx = new DropIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dropIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(DROP);
			setState(714);
			match(INDEX);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(715);
				match(IF);
				setState(716);
				match(EXISTS);
				}
			}

			setState(719);
			identifier();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(720);
				match(ON);
				setState(721);
				tableIdentifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SQLParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public CreateDatabaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreateDatabaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreateDatabaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitCreateDatabaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseStatementContext createDatabaseStatement() throws RecognitionException {
		CreateDatabaseStatementContext _localctx = new CreateDatabaseStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_createDatabaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(CREATE);
			setState(725);
			match(DATABASE);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(726);
				match(IF);
				setState(727);
				match(NOT);
				setState(728);
				match(EXISTS);
				}
			}

			setState(731);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropDatabaseStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SQLParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public DropDatabaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropDatabaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropDatabaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLParserVisitor ) return ((SQLParserVisitor<? extends T>)visitor).visitDropDatabaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseStatementContext dropDatabaseStatement() throws RecognitionException {
		DropDatabaseStatementContext _localctx = new DropDatabaseStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dropDatabaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(DROP);
			setState(734);
			match(DATABASE);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(735);
				match(IF);
				setState(736);
				match(EXISTS);
				}
			}

			setState(739);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001w\u02e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0004\u0000b\b\u0000"+
		"\u000b\u0000\f\u0000c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"u\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002}\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0081"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0089\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u008d\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0091\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0095\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0099\b\u0002\u0003\u0002\u009b\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u009f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00a6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00ab\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00af\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b4\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00b8\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00bc\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c1"+
		"\b\u0005\n\u0005\f\u0005\u00c4\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00c9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ce\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d3\b"+
		"\u0006\u0003\u0006\u00d5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00dc\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00e1\b\u0007\u0003\u0007\u00e3\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00ee\b\u000b\n\u000b\f\u000b\u00f1\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00f6\b\f\n\f\f\f\u00f9\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00ff\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u011d\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0122\b\u000e\n\u000e\f\u000e\u0125\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u012a\b\u000f\n\u000f"+
		"\f\u000f\u012d\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0132\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u013b\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0140\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0149\b\u0014"+
		"\n\u0014\f\u0014\u014c\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0150"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0159\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0163\b\u0017\n\u0017\f\u0017\u0166\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u016a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0172\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0177\b\u001a\n\u001a\f\u001a\u017a\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0185\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u018c\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0193"+
		"\b\u001d\n\u001d\f\u001d\u0196\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u019d\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01a4\b\u001f\n\u001f"+
		"\f\u001f\u01a7\t\u001f\u0001 \u0001 \u0001 \u0005 \u01ac\b \n \f \u01af"+
		"\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01bd\b!\u0001!\u0003!\u01c0\b!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01c7\b!\u0001!\u0003!\u01ca\b!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01d8\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u01de\b!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01e9\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f1\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01fd"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0204\b\"\u0001#"+
		"\u0001#\u0001#\u0003#\u0209\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u0211\b#\u0001#\u0003#\u0214\b#\u0001#\u0003#\u0217\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0220\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u022d\b#\u0001#\u0001#\u0001#\u0003#\u0232\b#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u023d\b#\u0001$\u0001$\u0001"+
		"$\u0005$\u0242\b$\n$\f$\u0245\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u024d\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u0253\b&\u0001&\u0001"+
		"&\u0003&\u0257\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u025f\b\'\n\'\f\'\u0262\t\'\u0001(\u0001(\u0003(\u0266\b(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u026d\b(\u0001(\u0001(\u0003(\u0271\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0282\b(\u0001(\u0001(\u0001(\u0005"+
		"(\u0287\b(\n(\f(\u028a\t(\u0001(\u0001(\u0003(\u028e\b(\u0001(\u0001("+
		"\u0001(\u0001(\u0005(\u0294\b(\n(\f(\u0297\t(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u02a2\b(\u0001)\u0001)\u0003"+
		")\u02a6\b)\u0001)\u0001)\u0001*\u0001*\u0003*\u02ac\b*\u0001*\u0003*\u02af"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u02b5\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u02c1\b+\n+\f+\u02c4"+
		"\t+\u0001,\u0001,\u0003,\u02c8\b,\u0001-\u0001-\u0001-\u0001-\u0003-\u02ce"+
		"\b-\u0001-\u0001-\u0001-\u0003-\u02d3\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u02da\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0003/\u02e2"+
		"\b/\u0001/\u0001/\u0001/\u0000\u00000\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^\u0000\t\u0001\u0000UW\u0001\u0000fg\u0001\u0000hj\u0002"+
		"\u0000QQ`e\u0002\u0000NPX_\u0001\u0000\u0019\u001a\u0002\u0000MM[[\u0001"+
		"\u000056\u0001\u0000*+\u0349\u0000a\u0001\u0000\u0000\u0000\u0002g\u0001"+
		"\u0000\u0000\u0000\u0004\u009a\u0001\u0000\u0000\u0000\u0006\u009c\u0001"+
		"\u0000\u0000\u0000\b\u00bb\u0001\u0000\u0000\u0000\n\u00bd\u0001\u0000"+
		"\u0000\u0000\f\u00d4\u0001\u0000\u0000\u0000\u000e\u00e2\u0001\u0000\u0000"+
		"\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u00e6\u0001\u0000\u0000"+
		"\u0000\u0014\u00e8\u0001\u0000\u0000\u0000\u0016\u00ea\u0001\u0000\u0000"+
		"\u0000\u0018\u00f2\u0001\u0000\u0000\u0000\u001a\u011c\u0001\u0000\u0000"+
		"\u0000\u001c\u011e\u0001\u0000\u0000\u0000\u001e\u0126\u0001\u0000\u0000"+
		"\u0000 \u0131\u0001\u0000\u0000\u0000\"\u013f\u0001\u0000\u0000\u0000"+
		"$\u0141\u0001\u0000\u0000\u0000&\u0143\u0001\u0000\u0000\u0000(\u0145"+
		"\u0001\u0000\u0000\u0000*\u014d\u0001\u0000\u0000\u0000,\u0151\u0001\u0000"+
		"\u0000\u0000.\u015f\u0001\u0000\u0000\u00000\u0169\u0001\u0000\u0000\u0000"+
		"2\u016b\u0001\u0000\u0000\u00004\u0173\u0001\u0000\u0000\u00006\u017b"+
		"\u0001\u0000\u0000\u00008\u017f\u0001\u0000\u0000\u0000:\u0186\u0001\u0000"+
		"\u0000\u0000<\u019c\u0001\u0000\u0000\u0000>\u01a0\u0001\u0000\u0000\u0000"+
		"@\u01a8\u0001\u0000\u0000\u0000B\u01e8\u0001\u0000\u0000\u0000D\u0203"+
		"\u0001\u0000\u0000\u0000F\u023c\u0001\u0000\u0000\u0000H\u023e\u0001\u0000"+
		"\u0000\u0000J\u024c\u0001\u0000\u0000\u0000L\u024e\u0001\u0000\u0000\u0000"+
		"N\u0258\u0001\u0000\u0000\u0000P\u02a1\u0001\u0000\u0000\u0000R\u02a3"+
		"\u0001\u0000\u0000\u0000T\u02a9\u0001\u0000\u0000\u0000V\u02bd\u0001\u0000"+
		"\u0000\u0000X\u02c5\u0001\u0000\u0000\u0000Z\u02c9\u0001\u0000\u0000\u0000"+
		"\\\u02d4\u0001\u0000\u0000\u0000^\u02dd\u0001\u0000\u0000\u0000`b\u0003"+
		"\u0004\u0002\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0000\u0000\u0001f\u0001\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0004\u0002\u0000hi\u0005\u0000\u0000\u0001i\u0003\u0001\u0000\u0000"+
		"\u0000jl\u0003\u0006\u0003\u0000km\u0005p\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u009b\u0001\u0000\u0000\u0000np\u0003"+
		",\u0016\u0000oq\u0005p\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u009b\u0001\u0000\u0000\u0000rt\u00032\u0019\u0000su\u0005"+
		"p\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u009b"+
		"\u0001\u0000\u0000\u0000vx\u00038\u001c\u0000wy\u0005p\u0000\u0000xw\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u009b\u0001\u0000\u0000"+
		"\u0000z|\u0003:\u001d\u0000{}\u0005p\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u009b\u0001\u0000\u0000\u0000~\u0080\u0003"+
		"L&\u0000\u007f\u0081\u0005p\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u009b\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0003N\'\u0000\u0083\u0085\u0005p\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u009b\u0001\u0000\u0000\u0000\u0086\u0088\u0003R)\u0000\u0087\u0089\u0005"+
		"p\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u009b\u0001\u0000\u0000\u0000\u008a\u008c\u0003T*\u0000"+
		"\u008b\u008d\u0005p\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u009b\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0003Z-\u0000\u008f\u0091\u0005p\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u009b\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0003\\.\u0000\u0093\u0095\u0005p\u0000"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0098\u0003^/\u0000\u0097"+
		"\u0099\u0005p\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009aj\u0001"+
		"\u0000\u0000\u0000\u009an\u0001\u0000\u0000\u0000\u009ar\u0001\u0000\u0000"+
		"\u0000\u009av\u0001\u0000\u0000\u0000\u009az\u0001\u0000\u0000\u0000\u009a"+
		"~\u0001\u0000\u0000\u0000\u009a\u0082\u0001\u0000\u0000\u0000\u009a\u0086"+
		"\u0001\u0000\u0000\u0000\u009a\u008a\u0001\u0000\u0000\u0000\u009a\u008e"+
		"\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009a\u0096"+
		"\u0001\u0000\u0000\u0000\u009b\u0005\u0001\u0000\u0000\u0000\u009c\u009e"+
		"\u0005\u0001\u0000\u0000\u009d\u009f\u0005\u0018\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\b\u0004\u0000\u00a1\u00a2\u0005"+
		"\u0002\u0000\u0000\u00a2\u00a5\u0003\u000e\u0007\u0000\u00a3\u00a4\u0005"+
		"\u0003\u0000\u0000\u00a4\u00a6\u0003\u0014\n\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u00a9\u0005\u0014"+
		"\u0000\u0000\u00a9\u00ab\u0003\n\u0005\u0000\u00aa\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00af\u0003\u0014\n\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0013\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b4\u0003(\u0014\u0000\u00b3"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6"+
		"\u00b8\u0005[\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u0007\u0001\u0000\u0000\u0000\u00b9\u00bc"+
		"\u0005h\u0000\u0000\u00ba\u00bc\u0003\n\u0005\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\t\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c2\u0003\f\u0006\u0000\u00be\u00bf\u0005n\u0000"+
		"\u0000\u00bf\u00c1\u0003\f\u0006\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u000b\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\u000e\u0007\u0000"+
		"\u00c6\u00c7\u0005o\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003\u0012\t\u0000\u00cb\u00cc"+
		"\u0005\u0012\u0000\u0000\u00cc\u00ce\u0003\u0012\t\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d5\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0003\u0014\n\u0000\u00d0\u00d1\u0005\u0012"+
		"\u0000\u0000\u00d1\u00d3\u0003\u0012\t\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00c8\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d5\r\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003\u0010\b\u0000"+
		"\u00d7\u00d8\u0005o\u0000\u0000\u00d8\u00db\u0003\u0012\t\u0000\u00d9"+
		"\u00da\u0005\u0012\u0000\u0000\u00da\u00dc\u0003\u0012\t\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00e3"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003\u0012\t\u0000\u00de\u00df\u0005"+
		"\u0012\u0000\u0000\u00df\u00e1\u0003\u0012\t\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00d6\u0001\u0000\u0000\u0000\u00e2\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e3\u000f\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0012"+
		"\t\u0000\u00e5\u0011\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0000\u0000"+
		"\u0000\u00e7\u0013\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\u0016\u000b"+
		"\u0000\u00e9\u0015\u0001\u0000\u0000\u0000\u00ea\u00ef\u0003\u0018\f\u0000"+
		"\u00eb\u00ec\u0005l\u0000\u0000\u00ec\u00ee\u0003\u0018\f\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u0017\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f7\u0003\u001a\r\u0000\u00f3\u00f4\u0005k\u0000\u0000\u00f4\u00f6"+
		"\u0003\u001a\r\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u0019\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fe\u0003\u001c\u000e\u0000\u00fb\u00fc\u0003"+
		"$\u0012\u0000\u00fc\u00fd\u0003\u001c\u000e\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u011d\u0001\u0000\u0000\u0000\u0100\u0101\u0003\u001c"+
		"\u000e\u0000\u0101\u0102\u0005R\u0000\u0000\u0102\u0103\u0005q\u0000\u0000"+
		"\u0103\u0104\u0003.\u0017\u0000\u0104\u0105\u0005r\u0000\u0000\u0105\u011d"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0003\u001c\u000e\u0000\u0107\u0108"+
		"\u0005\u0011\u0000\u0000\u0108\u0109\u0005R\u0000\u0000\u0109\u010a\u0005"+
		"q\u0000\u0000\u010a\u010b\u0003.\u0017\u0000\u010b\u010c\u0005r\u0000"+
		"\u0000\u010c\u011d\u0001\u0000\u0000\u0000\u010d\u010e\u0003\u001c\u000e"+
		"\u0000\u010e\u010f\u0005T\u0000\u0000\u010f\u0110\u0003\u001c\u000e\u0000"+
		"\u0110\u0111\u0005\u000f\u0000\u0000\u0111\u0112\u0003\u001c\u000e\u0000"+
		"\u0112\u011d\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u001c\u000e\u0000"+
		"\u0114\u0115\u0005S\u0000\u0000\u0115\u0116\u0005P\u0000\u0000\u0116\u011d"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0003\u001c\u000e\u0000\u0118\u0119"+
		"\u0005S\u0000\u0000\u0119\u011a\u0005\u0011\u0000\u0000\u011a\u011b\u0005"+
		"P\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u00fa\u0001\u0000"+
		"\u0000\u0000\u011c\u0100\u0001\u0000\u0000\u0000\u011c\u0106\u0001\u0000"+
		"\u0000\u0000\u011c\u010d\u0001\u0000\u0000\u0000\u011c\u0113\u0001\u0000"+
		"\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011d\u001b\u0001\u0000"+
		"\u0000\u0000\u011e\u0123\u0003\u001e\u000f\u0000\u011f\u0120\u0007\u0001"+
		"\u0000\u0000\u0120\u0122\u0003\u001e\u000f\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u001d\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u012b\u0003 \u0010"+
		"\u0000\u0127\u0128\u0007\u0002\u0000\u0000\u0128\u012a\u0003 \u0010\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u001f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\u0011\u0000\u0000\u012f\u0132\u0003 \u0010\u0000\u0130"+
		"\u0132\u0003\"\u0011\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u0130"+
		"\u0001\u0000\u0000\u0000\u0132!\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"q\u0000\u0000\u0134\u0135\u0003\u0014\n\u0000\u0135\u0136\u0005r\u0000"+
		"\u0000\u0136\u0140\u0001\u0000\u0000\u0000\u0137\u0138\u0003\u000e\u0007"+
		"\u0000\u0138\u0139\u0005o\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000"+
		"\u013a\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0140\u0003\u0012\t\u0000\u013d"+
		"\u0140\u0005X\u0000\u0000\u013e\u0140\u0003&\u0013\u0000\u013f\u0133\u0001"+
		"\u0000\u0000\u0000\u013f\u013a\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140#\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0007\u0003\u0000\u0000\u0142%\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0007\u0004\u0000\u0000\u0144\'\u0001\u0000\u0000\u0000"+
		"\u0145\u014a\u0003*\u0015\u0000\u0146\u0147\u0005n\u0000\u0000\u0147\u0149"+
		"\u0003*\u0015\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b)\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u014f\u0003\f\u0006\u0000\u014e\u0150\u0007\u0005\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150+\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0004\u0000\u0000"+
		"\u0152\u0153\u0005\u0005\u0000\u0000\u0153\u0158\u0003\u000e\u0007\u0000"+
		"\u0154\u0155\u0005q\u0000\u0000\u0155\u0156\u0003\n\u0005\u0000\u0156"+
		"\u0157\u0005r\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0154"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0005\t\u0000\u0000\u015b\u015c\u0005"+
		"q\u0000\u0000\u015c\u015d\u0003.\u0017\u0000\u015d\u015e\u0005r\u0000"+
		"\u0000\u015e-\u0001\u0000\u0000\u0000\u015f\u0164\u00030\u0018\u0000\u0160"+
		"\u0161\u0005n\u0000\u0000\u0161\u0163\u00030\u0018\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165/\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0003&\u0013"+
		"\u0000\u0168\u016a\u0003\u0014\n\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u016a1\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0005\u0006\u0000\u0000\u016c\u016d\u0003\u000e\u0007\u0000\u016d"+
		"\u016e\u0005\b\u0000\u0000\u016e\u0171\u00034\u001a\u0000\u016f\u0170"+
		"\u0005\u0003\u0000\u0000\u0170\u0172\u0003\u0014\n\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u01723\u0001\u0000"+
		"\u0000\u0000\u0173\u0178\u00036\u001b\u0000\u0174\u0175\u0005n\u0000\u0000"+
		"\u0175\u0177\u00036\u001b\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u01795\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0003\u0012\t\u0000\u017c\u017d\u0005"+
		"`\u0000\u0000\u017d\u017e\u0003\u0014\n\u0000\u017e7\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\u0007\u0000\u0000\u0180\u0181\u0005\u0002\u0000"+
		"\u0000\u0181\u0184\u0003\u000e\u0007\u0000\u0182\u0183\u0005\u0003\u0000"+
		"\u0000\u0183\u0185\u0003\u0014\n\u0000\u0184\u0182\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u01859\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0005\u001b\u0000\u0000\u0187\u018b\u0005\u001f\u0000\u0000\u0188"+
		"\u0189\u0005(\u0000\u0000\u0189\u018a\u0005\u0011\u0000\u0000\u018a\u018c"+
		"\u0005)\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0003"+
		"<\u001e\u0000\u018e\u018f\u0005q\u0000\u0000\u018f\u0194\u0003>\u001f"+
		"\u0000\u0190\u0191\u0005n\u0000\u0000\u0191\u0193\u0003F#\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005r\u0000\u0000\u0198;\u0001\u0000\u0000\u0000\u0199\u019a\u0003"+
		"\u0010\b\u0000\u019a\u019b\u0005o\u0000\u0000\u019b\u019d\u0001\u0000"+
		"\u0000\u0000\u019c\u0199\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0003\u0012"+
		"\t\u0000\u019f=\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003@ \u0000\u01a1"+
		"\u01a2\u0005n\u0000\u0000\u01a2\u01a4\u0003@ \u0000\u01a3\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6?\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\u0012"+
		"\t\u0000\u01a9\u01ad\u0003B!\u0000\u01aa\u01ac\u0003D\"\u0000\u01ab\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01aeA\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01e9\u0005"+
		"7\u0000\u0000\u01b1\u01e9\u00058\u0000\u0000\u01b2\u01e9\u00059\u0000"+
		"\u0000\u01b3\u01e9\u0005:\u0000\u0000\u01b4\u01e9\u0005;\u0000\u0000\u01b5"+
		"\u01e9\u0005<\u0000\u0000\u01b6\u01e9\u0005=\u0000\u0000\u01b7\u01bf\u0005"+
		">\u0000\u0000\u01b8\u01b9\u0005q\u0000\u0000\u01b9\u01bc\u0005[\u0000"+
		"\u0000\u01ba\u01bb\u0005n\u0000\u0000\u01bb\u01bd\u0005[\u0000\u0000\u01bc"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0005r\u0000\u0000\u01bf\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01e9"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c9\u0005?\u0000\u0000\u01c2\u01c3\u0005"+
		"q\u0000\u0000\u01c3\u01c6\u0005[\u0000\u0000\u01c4\u01c5\u0005n\u0000"+
		"\u0000\u01c5\u01c7\u0005[\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01ca\u0005r\u0000\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01e9\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0005@\u0000\u0000\u01cc\u01cd\u0005q\u0000\u0000\u01cd\u01ce\u0007"+
		"\u0006\u0000\u0000\u01ce\u01e9\u0005r\u0000\u0000\u01cf\u01d0\u0005A\u0000"+
		"\u0000\u01d0\u01d1\u0005q\u0000\u0000\u01d1\u01d2\u0007\u0006\u0000\u0000"+
		"\u01d2\u01e9\u0005r\u0000\u0000\u01d3\u01d7\u0005B\u0000\u0000\u01d4\u01d5"+
		"\u0005q\u0000\u0000\u01d5\u01d6\u0005[\u0000\u0000\u01d6\u01d8\u0005r"+
		"\u0000\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01e9\u0001\u0000\u0000\u0000\u01d9\u01dd\u0005C\u0000"+
		"\u0000\u01da\u01db\u0005q\u0000\u0000\u01db\u01dc\u0005[\u0000\u0000\u01dc"+
		"\u01de\u0005r\u0000\u0000\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0001\u0000\u0000\u0000\u01de\u01e9\u0001\u0000\u0000\u0000\u01df\u01e9"+
		"\u0005D\u0000\u0000\u01e0\u01e9\u0005E\u0000\u0000\u01e1\u01e9\u0005F"+
		"\u0000\u0000\u01e2\u01e9\u0005G\u0000\u0000\u01e3\u01e9\u0005H\u0000\u0000"+
		"\u01e4\u01e9\u0005I\u0000\u0000\u01e5\u01e9\u0005J\u0000\u0000\u01e6\u01e9"+
		"\u0005K\u0000\u0000\u01e7\u01e9\u0005L\u0000\u0000\u01e8\u01b0\u0001\u0000"+
		"\u0000\u0000\u01e8\u01b1\u0001\u0000\u0000\u0000\u01e8\u01b2\u0001\u0000"+
		"\u0000\u0000\u01e8\u01b3\u0001\u0000\u0000\u0000\u01e8\u01b4\u0001\u0000"+
		"\u0000\u0000\u01e8\u01b5\u0001\u0000\u0000\u0000\u01e8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01b7\u0001\u0000\u0000\u0000\u01e8\u01c1\u0001\u0000"+
		"\u0000\u0000\u01e8\u01cb\u0001\u0000\u0000\u0000\u01e8\u01cf\u0001\u0000"+
		"\u0000\u0000\u01e8\u01d3\u0001\u0000\u0000\u0000\u01e8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01e8\u01df\u0001\u0000\u0000\u0000\u01e8\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9C\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0005\u0011\u0000\u0000\u01eb\u0204\u0005P\u0000\u0000"+
		"\u01ec\u0204\u0005P\u0000\u0000\u01ed\u01ee\u0005,\u0000\u0000\u01ee\u01f0"+
		"\u0005-\u0000\u0000\u01ef\u01f1\u0007\u0007\u0000\u0000\u01f0\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u0204\u0001"+
		"\u0000\u0000\u0000\u01f2\u0204\u00050\u0000\u0000\u01f3\u01f4\u00052\u0000"+
		"\u0000\u01f4\u0204\u0003&\u0013\u0000\u01f5\u0204\u00053\u0000\u0000\u01f6"+
		"\u01f7\u0005/\u0000\u0000\u01f7\u01fc\u0003<\u001e\u0000\u01f8\u01f9\u0005"+
		"q\u0000\u0000\u01f9\u01fa\u0003\u0012\t\u0000\u01fa\u01fb\u0005r\u0000"+
		"\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0204\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u00051\u0000\u0000\u01ff\u0200\u0005q\u0000\u0000\u0200"+
		"\u0201\u0003\u0014\n\u0000\u0201\u0202\u0005r\u0000\u0000\u0202\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u01ea\u0001\u0000\u0000\u0000\u0203\u01ec"+
		"\u0001\u0000\u0000\u0000\u0203\u01ed\u0001\u0000\u0000\u0000\u0203\u01f2"+
		"\u0001\u0000\u0000\u0000\u0203\u01f3\u0001\u0000\u0000\u0000\u0203\u01f5"+
		"\u0001\u0000\u0000\u0000\u0203\u01f6\u0001\u0000\u0000\u0000\u0203\u01fe"+
		"\u0001\u0000\u0000\u0000\u0204E\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		",\u0000\u0000\u0206\u0208\u0005-\u0000\u0000\u0207\u0209\u0007\u0007\u0000"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0005q\u0000\u0000"+
		"\u020b\u020c\u0003H$\u0000\u020c\u020d\u0005r\u0000\u0000\u020d\u023d"+
		"\u0001\u0000\u0000\u0000\u020e\u0210\u00050\u0000\u0000\u020f\u0211\u0007"+
		"\u0007\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u0214\u0005"+
		"-\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0217\u0003\u0012"+
		"\t\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0005q\u0000\u0000"+
		"\u0219\u021a\u0003H$\u0000\u021a\u021b\u0005r\u0000\u0000\u021b\u023d"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0005.\u0000\u0000\u021d\u021f\u0005"+
		"-\u0000\u0000\u021e\u0220\u0003\u0012\t\u0000\u021f\u021e\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0005q\u0000\u0000\u0222\u0223\u0003H$\u0000"+
		"\u0223\u0224\u0005r\u0000\u0000\u0224\u0225\u0005/\u0000\u0000\u0225\u0226"+
		"\u0003<\u001e\u0000\u0226\u0227\u0005q\u0000\u0000\u0227\u0228\u0003H"+
		"$\u0000\u0228\u022c\u0005r\u0000\u0000\u0229\u022a\u0005\u000e\u0000\u0000"+
		"\u022a\u022b\u0005\u0007\u0000\u0000\u022b\u022d\u0003J%\u0000\u022c\u0229"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u0231"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0005\u000e\u0000\u0000\u022f\u0230"+
		"\u0005\u0006\u0000\u0000\u0230\u0232\u0003J%\u0000\u0231\u022e\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u023d\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u00051\u0000\u0000\u0234\u0235\u0005q\u0000\u0000"+
		"\u0235\u0236\u0003\u0014\n\u0000\u0236\u0237\u0005r\u0000\u0000\u0237"+
		"\u023d\u0001\u0000\u0000\u0000\u0238\u0239\u00054\u0000\u0000\u0239\u023a"+
		"\u0003\u0012\t\u0000\u023a\u023b\u0003F#\u0000\u023b\u023d\u0001\u0000"+
		"\u0000\u0000\u023c\u0205\u0001\u0000\u0000\u0000\u023c\u020e\u0001\u0000"+
		"\u0000\u0000\u023c\u021c\u0001\u0000\u0000\u0000\u023c\u0233\u0001\u0000"+
		"\u0000\u0000\u023c\u0238\u0001\u0000\u0000\u0000\u023dG\u0001\u0000\u0000"+
		"\u0000\u023e\u0243\u0003\u0012\t\u0000\u023f\u0240\u0005n\u0000\u0000"+
		"\u0240\u0242\u0003\u0012\t\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242"+
		"\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0001\u0000\u0000\u0000\u0244I\u0001\u0000\u0000\u0000\u0245\u0243"+
		"\u0001\u0000\u0000\u0000\u0246\u024d\u0005*\u0000\u0000\u0247\u024d\u0005"+
		"+\u0000\u0000\u0248\u0249\u0005\b\u0000\u0000\u0249\u024d\u0005P\u0000"+
		"\u0000\u024a\u024b\u0005\b\u0000\u0000\u024b\u024d\u00052\u0000\u0000"+
		"\u024c\u0246\u0001\u0000\u0000\u0000\u024c\u0247\u0001\u0000\u0000\u0000"+
		"\u024c\u0248\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024dK\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u001c\u0000\u0000\u024f"+
		"\u0252\u0005\u001f\u0000\u0000\u0250\u0251\u0005(\u0000\u0000\u0251\u0253"+
		"\u0005)\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0003"+
		"<\u001e\u0000\u0255\u0257\u0007\b\u0000\u0000\u0256\u0255\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257M\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0005\u001d\u0000\u0000\u0259\u025a\u0005\u001f\u0000"+
		"\u0000\u025a\u025b\u0003<\u001e\u0000\u025b\u0260\u0003P(\u0000\u025c"+
		"\u025d\u0005n\u0000\u0000\u025d\u025f\u0003P(\u0000\u025e\u025c\u0001"+
		"\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001"+
		"\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261O\u0001\u0000"+
		"\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0265\u0005#\u0000"+
		"\u0000\u0264\u0266\u0005\"\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u02a2\u0003@ \u0000\u0268\u0269\u0005#\u0000\u0000\u0269\u02a2"+
		"\u0003F#\u0000\u026a\u026c\u0005\u001c\u0000\u0000\u026b\u026d\u0005\""+
		"\u0000\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0003\u0012"+
		"\t\u0000\u026f\u0271\u0007\b\u0000\u0000\u0270\u026f\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u02a2\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0005\u001c\u0000\u0000\u0273\u0274\u00054\u0000\u0000"+
		"\u0274\u02a2\u0003\u0012\t\u0000\u0275\u0276\u0005\u001c\u0000\u0000\u0276"+
		"\u0277\u0005,\u0000\u0000\u0277\u02a2\u0005-\u0000\u0000\u0278\u0279\u0005"+
		"\u001c\u0000\u0000\u0279\u027a\u0005.\u0000\u0000\u027a\u027b\u0005-\u0000"+
		"\u0000\u027b\u02a2\u0003\u0012\t\u0000\u027c\u027d\u0005\u001c\u0000\u0000"+
		"\u027d\u027e\u0005!\u0000\u0000\u027e\u02a2\u0003\u0012\t\u0000\u027f"+
		"\u0281\u0005$\u0000\u0000\u0280\u0282\u0005\"\u0000\u0000\u0281\u0280"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0003\u0012\t\u0000\u0284\u0288\u0003"+
		"B!\u0000\u0285\u0287\u0003D\"\u0000\u0286\u0285\u0001\u0000\u0000\u0000"+
		"\u0287\u028a\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000"+
		"\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u02a2\u0001\u0000\u0000\u0000"+
		"\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028d\u0005&\u0000\u0000\u028c"+
		"\u028e\u0005\"\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0003\u0012\t\u0000\u0290\u0291\u0003\u0012\t\u0000\u0291\u0295\u0003"+
		"B!\u0000\u0292\u0294\u0003D\"\u0000\u0293\u0292\u0001\u0000\u0000\u0000"+
		"\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u02a2\u0001\u0000\u0000\u0000"+
		"\u0297\u0295\u0001\u0000\u0000\u0000\u0298\u0299\u0005%\u0000\u0000\u0299"+
		"\u029a\u0005\'\u0000\u0000\u029a\u02a2\u0003<\u001e\u0000\u029b\u029c"+
		"\u0005%\u0000\u0000\u029c\u029d\u0005\"\u0000\u0000\u029d\u029e\u0003"+
		"\u0012\t\u0000\u029e\u029f\u0005\'\u0000\u0000\u029f\u02a0\u0003\u0012"+
		"\t\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u0263\u0001\u0000\u0000"+
		"\u0000\u02a1\u0268\u0001\u0000\u0000\u0000\u02a1\u026a\u0001\u0000\u0000"+
		"\u0000\u02a1\u0272\u0001\u0000\u0000\u0000\u02a1\u0275\u0001\u0000\u0000"+
		"\u0000\u02a1\u0278\u0001\u0000\u0000\u0000\u02a1\u027c\u0001\u0000\u0000"+
		"\u0000\u02a1\u027f\u0001\u0000\u0000\u0000\u02a1\u028b\u0001\u0000\u0000"+
		"\u0000\u02a1\u0298\u0001\u0000\u0000\u0000\u02a1\u029b\u0001\u0000\u0000"+
		"\u0000\u02a2Q\u0001\u0000\u0000\u0000\u02a3\u02a5\u0005\u001e\u0000\u0000"+
		"\u02a4\u02a6\u0005\u001f\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0003<\u001e\u0000\u02a8S\u0001\u0000\u0000\u0000\u02a9\u02ab"+
		"\u0005\u001b\u0000\u0000\u02aa\u02ac\u00050\u0000\u0000\u02ab\u02aa\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae\u0001"+
		"\u0000\u0000\u0000\u02ad\u02af\u0007\u0007\u0000\u0000\u02ae\u02ad\u0001"+
		"\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b4\u0005!\u0000\u0000\u02b1\u02b2\u0005(\u0000"+
		"\u0000\u02b2\u02b3\u0005\u0011\u0000\u0000\u02b3\u02b5\u0005)\u0000\u0000"+
		"\u02b4\u02b1\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b7\u0003\u0012\t\u0000\u02b7"+
		"\u02b8\u0005\u000e\u0000\u0000\u02b8\u02b9\u0003<\u001e\u0000\u02b9\u02ba"+
		"\u0005q\u0000\u0000\u02ba\u02bb\u0003V+\u0000\u02bb\u02bc\u0005r\u0000"+
		"\u0000\u02bcU\u0001\u0000\u0000\u0000\u02bd\u02c2\u0003X,\u0000\u02be"+
		"\u02bf\u0005n\u0000\u0000\u02bf\u02c1\u0003X,\u0000\u02c0\u02be\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3W\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c7\u0003\u0012"+
		"\t\u0000\u02c6\u02c8\u0007\u0005\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8Y\u0001\u0000\u0000\u0000"+
		"\u02c9\u02ca\u0005\u001c\u0000\u0000\u02ca\u02cd\u0005!\u0000\u0000\u02cb"+
		"\u02cc\u0005(\u0000\u0000\u02cc\u02ce\u0005)\u0000\u0000\u02cd\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d2\u0003\u0012\t\u0000\u02d0\u02d1\u0005\u000e"+
		"\u0000\u0000\u02d1\u02d3\u0003<\u001e\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3[\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0005\u001b\u0000\u0000\u02d5\u02d9\u0005 \u0000\u0000\u02d6"+
		"\u02d7\u0005(\u0000\u0000\u02d7\u02d8\u0005\u0011\u0000\u0000\u02d8\u02da"+
		"\u0005)\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0003"+
		"\u0012\t\u0000\u02dc]\u0001\u0000\u0000\u0000\u02dd\u02de\u0005\u001c"+
		"\u0000\u0000\u02de\u02e1\u0005 \u0000\u0000\u02df\u02e0\u0005(\u0000\u0000"+
		"\u02e0\u02e2\u0005)\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0003\u0012\t\u0000\u02e4_\u0001\u0000\u0000\u0000\\clptx|\u0080"+
		"\u0084\u0088\u008c\u0090\u0094\u0098\u009a\u009e\u00a5\u00aa\u00ae\u00b3"+
		"\u00b7\u00bb\u00c2\u00c8\u00cd\u00d2\u00d4\u00db\u00e0\u00e2\u00ef\u00f7"+
		"\u00fe\u011c\u0123\u012b\u0131\u013a\u013f\u014a\u014f\u0158\u0164\u0169"+
		"\u0171\u0178\u0184\u018b\u0194\u019c\u01a5\u01ad\u01bc\u01bf\u01c6\u01c9"+
		"\u01d7\u01dd\u01e8\u01f0\u01fc\u0203\u0208\u0210\u0213\u0216\u021f\u022c"+
		"\u0231\u023c\u0243\u024c\u0252\u0256\u0260\u0265\u026c\u0270\u0281\u0288"+
		"\u028d\u0295\u02a1\u02a5\u02ab\u02ae\u02b4\u02c2\u02c7\u02cd\u02d2\u02d9"+
		"\u02e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}