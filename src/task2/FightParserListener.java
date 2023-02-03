// Generated from java-escape by ANTLR 4.11.1
package task2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FightParser}.
 */
public interface FightParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FightParser#arenastart}.
	 * @param ctx the parse tree
	 */
	void enterArenastart(FightParser.ArenastartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FightParser#arenastart}.
	 * @param ctx the parse tree
	 */
	void exitArenastart(FightParser.ArenastartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FightParser#fight}.
	 * @param ctx the parse tree
	 */
	void enterFight(FightParser.FightContext ctx);
	/**
	 * Exit a parse tree produced by {@link FightParser#fight}.
	 * @param ctx the parse tree
	 */
	void exitFight(FightParser.FightContext ctx);
	/**
	 * Enter a parse tree produced by {@link FightParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(FightParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link FightParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(FightParser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link FightParser#fighter}.
	 * @param ctx the parse tree
	 */
	void enterFighter(FightParser.FighterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FightParser#fighter}.
	 * @param ctx the parse tree
	 */
	void exitFighter(FightParser.FighterContext ctx);
}