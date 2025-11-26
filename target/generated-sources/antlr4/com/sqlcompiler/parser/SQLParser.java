// Generated from SQLParser.g4 by ANTLR 4.13.1
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
		ASC=25, DESC=26, IDENT=27, QUOTED_IDENT=28, INT=29, FLOAT=30, STRING=31, 
		EQ=32, NE=33, LT=34, LE=35, GT=36, GE=37, LIKE=38, IN=39, IS=40, NULL=41, 
		PLUS=42, MINUS=43, STAR=44, DIV=45, MOD=46, AND_OP=47, OR_OP=48, NOT_OP=49, 
		COMMA=50, DOT=51, SEMICOLON=52, LPAREN=53, RPAREN=54, LINE_COMMENT=55, 
		BLOCK_COMMENT=56, WS=57, ERROR_CHAR=58;
	public static final int
		RULE_query = 0, RULE_selectStatement = 1, RULE_selectList = 2, RULE_columnList = 3, 
		RULE_column = 4, RULE_tableName = 5, RULE_expression = 6, RULE_logicalOrExpression = 7, 
		RULE_logicalAndExpression = 8, RULE_comparisonExpression = 9, RULE_additiveExpression = 10, 
		RULE_multiplicativeExpression = 11, RULE_unaryExpression = 12, RULE_primaryExpression = 13, 
		RULE_comparisonOp = 14, RULE_literal = 15, RULE_orderByList = 16, RULE_orderByItem = 17, 
		RULE_insertStatement = 18, RULE_valueList = 19, RULE_updateStatement = 20, 
		RULE_assignmentList = 21, RULE_assignment = 22, RULE_deleteStatement = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectStatement", "selectList", "columnList", "column", "tableName", 
			"expression", "logicalOrExpression", "logicalAndExpression", "comparisonExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primaryExpression", "comparisonOp", "literal", "orderByList", "orderByItem", 
			"insertStatement", "valueList", "updateStatement", "assignmentList", 
			"assignment", "deleteStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'='", null, "'<'", "'<='", 
			"'>'", "'>='", null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			null, null, null, "','", "'.'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "INSERT", "INTO", "UPDATE", "DELETE", 
			"SET", "VALUES", "JOIN", "INNER", "LEFT", "RIGHT", "ON", "AND", "OR", 
			"NOT", "AS", "ORDER", "BY", "GROUP", "HAVING", "LIMIT", "DISTINCT", "ASC", 
			"DESC", "IDENT", "QUOTED_IDENT", "INT", "FLOAT", "STRING", "EQ", "NE", 
			"LT", "LE", "GT", "GE", "LIKE", "IN", "IS", "NULL", "PLUS", "MINUS", 
			"STAR", "DIV", "MOD", "AND_OP", "OR_OP", "NOT_OP", "COMMA", "DOT", "SEMICOLON", 
			"LPAREN", "RPAREN", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "ERROR_CHAR"
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
	public static class QueryContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
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
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				selectStatement();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(49);
					match(SEMICOLON);
					}
				}

				setState(52);
				match(EOF);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				insertStatement();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(55);
					match(SEMICOLON);
					}
				}

				setState(58);
				match(EOF);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				updateStatement();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(61);
					match(SEMICOLON);
					}
				}

				setState(64);
				match(EOF);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				deleteStatement();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(67);
					match(SEMICOLON);
					}
				}

				setState(70);
				match(EOF);
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
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(SELECT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(75);
				match(DISTINCT);
				}
			}

			setState(78);
			selectList();
			setState(79);
			match(FROM);
			setState(80);
			tableName();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(81);
				match(WHERE);
				setState(82);
				expression();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(85);
				match(GROUP);
				setState(86);
				match(BY);
				setState(87);
				columnList();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(90);
				match(HAVING);
				setState(91);
				expression();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(94);
				match(ORDER);
				setState(95);
				match(BY);
				setState(96);
				orderByList();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(99);
				match(LIMIT);
				setState(100);
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
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectList);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(STAR);
				}
				break;
			case NOT:
			case IDENT:
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
			case LPAREN:
				_localctx = new SelectColumnsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			column();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				column();
				}
				}
				setState(114);
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
		public TerminalNode IDENT() { return getToken(SQLParser.IDENT, 0); }
		public ColumnWithExpressionContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnWithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnWithExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ColumnContext {
		public List<TerminalNode> IDENT() { return getTokens(SQLParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SQLParser.IDENT, i);
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
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ColumnNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(115);
					tableName();
					setState(116);
					match(DOT);
					}
					break;
				}
				setState(120);
				match(IDENT);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(121);
					match(AS);
					setState(122);
					match(IDENT);
					}
				}

				}
				break;
			case 2:
				_localctx = new ColumnWithExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				expression();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(126);
					match(AS);
					setState(127);
					match(IDENT);
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
		public List<TerminalNode> IDENT() { return getTokens(SQLParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SQLParser.IDENT, i);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENT);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(133);
				match(AS);
				setState(134);
				match(IDENT);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			logicalAndExpression();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(140);
				match(OR_OP);
				setState(141);
				logicalAndExpression();
				}
				}
				setState(146);
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
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			comparisonExpression();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(148);
				match(AND_OP);
				setState(149);
				comparisonExpression();
				}
				}
				setState(154);
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
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			additiveExpression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545460846592L) != 0)) {
				{
				setState(156);
				comparisonOp();
				setState(157);
				additiveExpression();
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			multiplicativeExpression();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				multiplicativeExpression();
				}
				}
				setState(168);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			unaryExpression();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				unaryExpression();
				}
				}
				setState(176);
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unaryExpression);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(NOT);
				setState(178);
				unaryExpression();
				}
				break;
			case IDENT:
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
			case LPAREN:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
		public TerminalNode IDENT() { return getToken(SQLParser.IDENT, 0); }
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
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryExpression);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(LPAREN);
				setState(183);
				expression();
				setState(184);
				match(RPAREN);
				}
				break;
			case IDENT:
				_localctx = new ColumnReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(186);
					tableName();
					setState(187);
					match(DOT);
					}
					break;
				}
				setState(191);
				match(IDENT);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				literal();
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
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 545460846592L) != 0)) ) {
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
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2202781351936L) != 0)) ) {
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
	}

	public final OrderByListContext orderByList() throws RecognitionException {
		OrderByListContext _localctx = new OrderByListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderByList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			orderByItem();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				orderByItem();
				}
				}
				setState(206);
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
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			column();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(208);
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
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(INSERT);
			setState(212);
			match(INTO);
			setState(213);
			tableName();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(214);
				match(LPAREN);
				setState(215);
				columnList();
				setState(216);
				match(RPAREN);
				}
			}

			setState(220);
			match(VALUES);
			setState(221);
			match(LPAREN);
			setState(222);
			valueList();
			setState(223);
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
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
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
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			literal();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				literal();
				}
				}
				setState(232);
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
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(UPDATE);
			setState(234);
			tableName();
			setState(235);
			match(SET);
			setState(236);
			assignmentList();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(237);
				match(WHERE);
				setState(238);
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
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			assignment();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				assignment();
				}
				}
				setState(248);
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
		public TerminalNode IDENT() { return getToken(SQLParser.IDENT, 0); }
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENT);
			setState(250);
			match(EQ);
			setState(251);
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
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(DELETE);
			setState(254);
			match(FROM);
			setState(255);
			tableName();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(256);
				match(WHERE);
				setState(257);
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

	public static final String _serializedATN =
		"\u0004\u0001:\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0003\u00003\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u00009\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000E\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000I\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001]\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001b\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001f\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002j\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"o\b\u0003\n\u0003\f\u0003r\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004w\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"|\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0081\b\u0004"+
		"\u0003\u0004\u0083\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0088\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u008f\b\u0007\n\u0007\f\u0007\u0092\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0097\b\b\n\b\f\b\u009a\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00a0\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00a5\b\n\n"+
		"\n\f\n\u00a8\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ad"+
		"\b\u000b\n\u000b\f\u000b\u00b0\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00b5\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00be\b\r\u0001\r\u0001\r\u0003\r\u00c2\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00cb\b\u0010\n\u0010\f\u0010\u00ce\t\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00d2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00db\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00e5\b\u0013\n\u0013\f\u0013\u00e8\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00f0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f5\b"+
		"\u0015\n\u0015\f\u0015\u00f8\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0103\b\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0005\u0001\u0000*+\u0001\u0000,.\u0001\u0000 &\u0002\u0000"+
		"\u001d\u001f))\u0001\u0000\u0019\u001a\u0110\u0000H\u0001\u0000\u0000"+
		"\u0000\u0002J\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006"+
		"k\u0001\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000\n\u0084\u0001"+
		"\u0000\u0000\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e\u008b\u0001\u0000"+
		"\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u009b\u0001\u0000"+
		"\u0000\u0000\u0014\u00a1\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000"+
		"\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000"+
		"\u0000\u0000\u001c\u00c3\u0001\u0000\u0000\u0000\u001e\u00c5\u0001\u0000"+
		"\u0000\u0000 \u00c7\u0001\u0000\u0000\u0000\"\u00cf\u0001\u0000\u0000"+
		"\u0000$\u00d3\u0001\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000("+
		"\u00e9\u0001\u0000\u0000\u0000*\u00f1\u0001\u0000\u0000\u0000,\u00f9\u0001"+
		"\u0000\u0000\u0000.\u00fd\u0001\u0000\u0000\u000002\u0003\u0002\u0001"+
		"\u000013\u00054\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000045\u0005\u0000\u0000\u00015I\u0001\u0000"+
		"\u0000\u000068\u0003$\u0012\u000079\u00054\u0000\u000087\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\u0000"+
		"\u0000\u0001;I\u0001\u0000\u0000\u0000<>\u0003(\u0014\u0000=?\u00054\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0000\u0000\u0001AI\u0001\u0000\u0000\u0000BD\u0003"+
		".\u0017\u0000CE\u00054\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0000\u0000\u0001GI\u0001"+
		"\u0000\u0000\u0000H0\u0001\u0000\u0000\u0000H6\u0001\u0000\u0000\u0000"+
		"H<\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000I\u0001\u0001\u0000"+
		"\u0000\u0000JL\u0005\u0001\u0000\u0000KM\u0005\u0018\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0003\u0004\u0002\u0000OP\u0005\u0002\u0000\u0000PS\u0003\n\u0005\u0000"+
		"QR\u0005\u0003\u0000\u0000RT\u0003\f\u0006\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TX\u0001\u0000\u0000\u0000UV\u0005\u0015\u0000"+
		"\u0000VW\u0005\u0014\u0000\u0000WY\u0003\u0006\u0003\u0000XU\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u0016\u0000\u0000[]\u0003\f\u0006\u0000\\Z\u0001\u0000\u0000\u0000\\"+
		"]\u0001\u0000\u0000\u0000]a\u0001\u0000\u0000\u0000^_\u0005\u0013\u0000"+
		"\u0000_`\u0005\u0014\u0000\u0000`b\u0003 \u0010\u0000a^\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000cd\u0005\u0017"+
		"\u0000\u0000df\u0005\u001d\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\u0003\u0001\u0000\u0000\u0000gj\u0005,\u0000\u0000"+
		"hj\u0003\u0006\u0003\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000j\u0005\u0001\u0000\u0000\u0000kp\u0003\b\u0004\u0000lm\u00052\u0000"+
		"\u0000mo\u0003\b\u0004\u0000nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0007\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0003\n\u0005\u0000tu\u0005"+
		"3\u0000\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0005\u001b\u0000\u0000"+
		"yz\u0005\u0012\u0000\u0000z|\u0005\u001b\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u0083\u0001\u0000\u0000\u0000}\u0080"+
		"\u0003\f\u0006\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0081\u0005"+
		"\u001b\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082v\u0001\u0000\u0000"+
		"\u0000\u0082}\u0001\u0000\u0000\u0000\u0083\t\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0005\u001b\u0000\u0000\u0085\u0086\u0005\u0012\u0000\u0000"+
		"\u0086\u0088\u0005\u001b\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u000b\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0003\u000e\u0007\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b"+
		"\u0090\u0003\u0010\b\u0000\u008c\u008d\u00050\u0000\u0000\u008d\u008f"+
		"\u0003\u0010\b\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0098\u0003\u0012\t\u0000\u0094\u0095\u0005/"+
		"\u0000\u0000\u0095\u0097\u0003\u0012\t\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0011\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009f\u0003\u0014\n\u0000"+
		"\u009c\u009d\u0003\u001c\u000e\u0000\u009d\u009e\u0003\u0014\n\u0000\u009e"+
		"\u00a0\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u0013\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a6\u0003\u0016\u000b\u0000\u00a2\u00a3\u0007\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0003\u0016\u000b\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ae\u0003\u0018\f\u0000\u00aa\u00ab"+
		"\u0007\u0001\u0000\u0000\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0017\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0011\u0000\u0000\u00b2\u00b5\u0003\u0018\f\u0000\u00b3\u00b5\u0003\u001a"+
		"\r\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6\u00b7\u00055\u0000\u0000"+
		"\u00b7\u00b8\u0003\f\u0006\u0000\u00b8\u00b9\u00056\u0000\u0000\u00b9"+
		"\u00c2\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\n\u0005\u0000\u00bb\u00bc"+
		"\u00053\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0005\u001b\u0000\u0000\u00c0\u00c2\u0003"+
		"\u001e\u000f\u0000\u00c1\u00b6\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u001b\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0007\u0002\u0000\u0000\u00c4\u001d\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0007\u0003\u0000\u0000\u00c6\u001f\u0001"+
		"\u0000\u0000\u0000\u00c7\u00cc\u0003\"\u0011\u0000\u00c8\u00c9\u00052"+
		"\u0000\u0000\u00c9\u00cb\u0003\"\u0011\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd!\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\b\u0004\u0000\u00d0"+
		"\u00d2\u0007\u0004\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u0004\u0000\u0000\u00d4\u00d5\u0005\u0005\u0000\u0000\u00d5\u00da"+
		"\u0003\n\u0005\u0000\u00d6\u00d7\u00055\u0000\u0000\u00d7\u00d8\u0003"+
		"\u0006\u0003\u0000\u00d8\u00d9\u00056\u0000\u0000\u00d9\u00db\u0001\u0000"+
		"\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\t\u0000"+
		"\u0000\u00dd\u00de\u00055\u0000\u0000\u00de\u00df\u0003&\u0013\u0000\u00df"+
		"\u00e0\u00056\u0000\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e6\u0003"+
		"\u001e\u000f\u0000\u00e2\u00e3\u00052\u0000\u0000\u00e3\u00e5\u0003\u001e"+
		"\u000f\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\'\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea\u00eb\u0003\n\u0005\u0000"+
		"\u00eb\u00ec\u0005\b\u0000\u0000\u00ec\u00ef\u0003*\u0015\u0000\u00ed"+
		"\u00ee\u0005\u0003\u0000\u0000\u00ee\u00f0\u0003\f\u0006\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0)\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f6\u0003,\u0016\u0000\u00f2\u00f3\u00052\u0000"+
		"\u0000\u00f3\u00f5\u0003,\u0016\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7+\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u001b\u0000\u0000\u00fa"+
		"\u00fb\u0005 \u0000\u0000\u00fb\u00fc\u0003\f\u0006\u0000\u00fc-\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0002\u0000\u0000\u00ff\u0102\u0003\n\u0005\u0000\u0100\u0101\u0005\u0003"+
		"\u0000\u0000\u0101\u0103\u0003\f\u0006\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103/\u0001\u0000\u0000\u0000"+
		"!28>DHLSX\\aeipv{\u0080\u0082\u0087\u0090\u0098\u009f\u00a6\u00ae\u00b4"+
		"\u00bd\u00c1\u00cc\u00d1\u00da\u00e6\u00ef\u00f6\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}