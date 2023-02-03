// Generated from java-escape by ANTLR 4.11.1
package task2;
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
		VS=1, COLON=2, FIGHTER1=3, FIGHTER2=4, POINTS=5;
	public static final int
		RULE_arenastart = 0, RULE_fight = 1, RULE_score = 2, RULE_fighter = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"arenastart", "fight", "score", "fighter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", null, "'fighter1'", "'fighter2'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VS", "COLON", "FIGHTER1", "FIGHTER2", "POINTS"
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
	public static class ArenastartContext extends ParserRuleContext {
		public FightContext fight() {
			return getRuleContext(FightContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FightParser.EOF, 0); }
		public ArenastartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arenastart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).enterArenastart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).exitArenastart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FightParserVisitor ) return ((FightParserVisitor<? extends T>)visitor).visitArenastart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArenastartContext arenastart() throws RecognitionException {
		ArenastartContext _localctx = new ArenastartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arenastart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			fight();
			setState(9);
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
			setState(11);
			score();
			setState(12);
			match(VS);
			setState(13);
			score();
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
		public FighterContext fighter() {
			return getRuleContext(FighterContext.class,0);
		}
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
			setState(15);
			fighter();
			setState(16);
			match(COLON);
			setState(17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FighterContext extends ParserRuleContext {
		public TerminalNode FIGHTER1() { return getToken(FightParser.FIGHTER1, 0); }
		public TerminalNode FIGHTER2() { return getToken(FightParser.FIGHTER2, 0); }
		public FighterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fighter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).enterFighter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FightParserListener ) ((FightParserListener)listener).exitFighter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FightParserVisitor ) return ((FightParserVisitor<? extends T>)visitor).visitFighter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FighterContext fighter() throws RecognitionException {
		FighterContext _localctx = new FighterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fighter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_la = _input.LA(1);
			if ( !(_la==FIGHTER1 || _la==FIGHTER2) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u0016\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0003"+
		"\u0004\u0011\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000"+
		"\u0000\u0004\u000f\u0001\u0000\u0000\u0000\u0006\u0013\u0001\u0000\u0000"+
		"\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001"+
		"\u0001\u0000\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000\f\r\u0005\u0001"+
		"\u0000\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u0003\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0003\u0006\u0003\u0000\u0010\u0011\u0005\u0002\u0000"+
		"\u0000\u0011\u0012\u0005\u0005\u0000\u0000\u0012\u0005\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0007\u0000\u0000\u0000\u0014\u0007\u0001\u0000\u0000"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}