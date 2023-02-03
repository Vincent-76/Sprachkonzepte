// Generated from java-escape by ANTLR 4.11.1
package task2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FightParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FightParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FightParser#arenastart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArenastart(FightParser.ArenastartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FightParser#fight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFight(FightParser.FightContext ctx);
	/**
	 * Visit a parse tree produced by {@link FightParser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(FightParser.ScoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link FightParser#fighter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFighter(FightParser.FighterContext ctx);
}