// Generated from java-escape by ANTLR 4.11.1
package task3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FightParser}.
 */
public interface FightParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FightParser#board}.
	 * @param ctx the parse tree
	 */
	void enterBoard(FightParser.BoardContext ctx);
	/**
	 * Exit a parse tree produced by {@link FightParser#board}.
	 * @param ctx the parse tree
	 */
	void exitBoard(FightParser.BoardContext ctx);
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
}