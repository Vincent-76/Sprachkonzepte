// Generated from java-escape by ANTLR 4.11.1
package ast;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExprParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExprParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ExprParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ExprParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ExprParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ExprParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ExprParser.ValueContext ctx);
}