package task2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author Vincent76
 */
public class Task2b {
	private static final String input = "fighter1:4/fighter2:2";

	public static void main( String[] args ) {
		FightLexer lexer = new FightLexer( CharStreams.fromString( input ) );
		FightParser parser = new FightParser( new CommonTokenStream( lexer ) );
		ParseTree tree = parser.arenastart();
		if( parser.getNumberOfSyntaxErrors() > 0 ) {
			System.err.printf( "%d error(s) detected%n", parser.getNumberOfSyntaxErrors() );
			System.exit( 1 );
		}

		Fight ast = new FightBuilder().build( tree );
		System.out.printf( "Expr.toString() = \"%s\"%n", ast );
	}
}
