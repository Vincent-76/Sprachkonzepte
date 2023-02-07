package task3;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Stack;

/**
 * @author Vincent76
 */
public class FightBuilder extends FightParserBaseListener {
	private final Stack<Fight> fightStack = new Stack<>();
	private final Stack<Score> scoreStack = new Stack<>();
	private Board board;

	public Board build( ParseTree tree ) {
		new ParseTreeWalker().walk( this, tree );
		return this.board;
	}

	@Override
	public void exitBoard( FightParser.BoardContext ctx ) {
		this.board = new Board();
		while( !this.fightStack.isEmpty() )
			this.board.addFight( this.fightStack.pop() );
	}

	@Override
	public void exitFight( FightParser.FightContext ctx ) {
		Score right = this.scoreStack.pop();
		Score left = this.scoreStack.pop();
		fightStack.push( new Fight( left, right ) );
	}

	@Override
	public void exitScore( FightParser.ScoreContext ctx ) {
		Fighter fighter = new Fighter( ctx.getChild( 0 ).getText() );
		Points points = new Points( Integer.parseInt( ctx.getChild( 2 ).getText() ) );
		this.scoreStack.push( new Score( fighter, points ) );
	}
}
