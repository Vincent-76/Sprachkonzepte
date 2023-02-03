// Generated from java-escape by ANTLR 4.11.1
package task3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FightParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VS=1, COLON=2, SEMICOLON=3, FIGHTER=4, POINTS=5;
	public static final int
		RULE_board = 0, RULE_fight = 1, RULE_score = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"board", "fight", "score"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VS", "COLON", "SEMICOLON", "FIGHTER", "POINTS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FightParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoardContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FightParser.EOF, 0); }
		public List<FightContext> fight() {
			return getRuleContexts(FightContext.class);
		}
		public FightContext fight(int i) {
			return getRuleContext(FightContext.class,i);
		}
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).exitBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FightParserVisitor ) return ((FightParserVisitor<? extends T>)visitor).visitBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_board);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				fight();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FIGHTER );
			setState(11);
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
	public static class FightContext extends ParserRuleContext {
		public List<ScoreContext> score() {
			return getRuleContexts(ScoreContext.class);
		}
		public ScoreContext score(int i) {
			return getRuleContext(ScoreContext.class,i);
		}
		public TerminalNode VS() { return getToken(FightParser.VS, 0); }
		public TerminalNode SEMICOLON() { return getToken(FightParser.SEMICOLON, 0); }
		public FightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).enterFight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).exitFight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FightParserVisitor ) return ((FightParserVisitor<? extends T>)visitor).visitFight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FightContext fight() throws RecognitionException {
		FightContext _localctx = new FightContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			score();
			setState(14);
			match(VS);
			setState(15);
			score();
			setState(16);
			match(SEMICOLON);
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
	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode FIGHTER() { return getToken(FightParser.FIGHTER, 0); }
		public TerminalNode COLON() { return getToken(FightParser.COLON, 0); }
		public TerminalNode POINTS() { return getToken(FightParser.POINTS, 0); }
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).exitScore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FightParserVisitor ) return ((FightParserVisitor<? extends T>)visitor).visitScore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_score);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(FIGHTER);
			setState(19);
			match(COLON);
			setState(20);
			match(POINTS);
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
		"\u0004\u0001\u0005\u0017\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000"+
		"\f\u0000\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000\u0014\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004\u0012"+
		"\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001"+
		"\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000"+
		"\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b"+
		"\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0003"+
		"\u0004\u0002\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u0010\u0003"+
		"\u0004\u0002\u0000\u0010\u0011\u0005\u0003\u0000\u0000\u0011\u0003\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013\u0014\u0005"+
		"\u0002\u0000\u0000\u0014\u0015\u0005\u0005\u0000\u0000\u0015\u0005\u0001"+
		"\u0000\u0000\u0000\u0001\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}