package task2;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Stack;

/**
 * @author Vincent76
 */
public class FightBuilder extends FightParserBaseListener {
	private final Stack<Score> scoreStack = new Stack<>();
	private final Stack<Fighter> fighterStack = new Stack<>();
	private Fight fight;

	public Fight build( ParseTree tree ) {
		new ParseTreeWalker().walk( this, tree );
		return fight;
	}

	@Override
	public void exitFight( FightParser.FightContext ctx ) {
		Score right = scoreStack.pop();
		Score left = scoreStack.pop();
		fight = new Fight( left, right );
	}

	@Override
	public void exitScore( FightParser.ScoreContext ctx ) {
		Fighter fighter = fighterStack.pop();
		Points points = new Points( ctx.getChild( 2 ).getText() );
		scoreStack.push( new Score( fighter, points ) );
	}

	@Override
	public void exitFighter( FightParser.FighterContext ctx ) {
		fighterStack.push( new Fighter( ctx.getText() ) );
	}
}
