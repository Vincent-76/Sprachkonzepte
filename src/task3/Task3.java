package task3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Vincent76
 */
public class Task3 {
	private static final String inputSuccess = "Bob:4/Frank:2;Frank:3/Max:1;Frank:2/Sam:0;";
	private static final String inputStaticFail = "Bob:4/Frank:2;Frank:3/Max:1;Frank:2/Frank:0;";

	public static void main( String[] args ) {
		FightLexer lexer = new FightLexer( CharStreams.fromString( inputSuccess ) );
		FightParser parser = new FightParser( new CommonTokenStream( lexer ) );
		ParseTree tree = parser.board();
		if( parser.getNumberOfSyntaxErrors() > 0 ) {
			System.err.printf( "%d error(s) detected%n", parser.getNumberOfSyntaxErrors() );
			System.exit( 1 );
		}

		Board ast = new FightBuilder().build( tree );
		if( !checkStaticSemantic( ast ) )
			return;
		if( !checkDynamicSemantic( ast ) )
			return;

		System.out.printf( "Expr.toString() = \"%s\"%n", ast );
	}

	private static boolean checkStaticSemantic( Board board ) {
		Map<String, Integer> matches = new HashMap<>();
		for( Fight fight: board.getFights() ) {
			if( fight.getLeft().getFighter().equals( fight.getRight().getFighter() ) ) {
				System.err.println( "Fighter '" + fight.getLeft().getFighter() + "' can't fight against himself!" );
				return false;
			}
			for( Fight fight2: board.getFights() ) {
				if( fight != fight2 && fight.equalsFighter( fight2 ) ) {
					System.err.println( "2 Fighter can't fight multiple times!" );
					return false;
				}
			}
			if( !addMatch( matches, fight.getLeft().getFighter() )
					|| !addMatch( matches, fight.getRight().getFighter() )
			)
				return false;
		}
		return true;
	}

	private static boolean checkDynamicSemantic( Board board ) {
		Map<String, Integer> wins = new HashMap<>();
		for( Fight fight: board.getFights() ) {
			int res = Integer.compare( fight.getLeft().getPoints().getPoints(), fight.getRight().getPoints().getPoints() );
			addWin( wins, fight.getLeft().getFighter(), res > 0 ? 1 : 0 );
			addWin( wins, fight.getRight().getFighter(), res < 0 ? 1 : 0 );
		}
		List<String> rank = wins.entrySet().stream()
				.sorted( Map.Entry.comparingByValue( Comparator.reverseOrder() ) )
				.map( Map.Entry::getKey )
				.collect( Collectors.toUnmodifiableList() );
		for( Fight fight : board.getFights() ) {
			Fighter left = fight.getLeft().getFighter();
			left.setRank( rank.indexOf( left.getName() ) + 1 );
			Fighter right = fight.getRight().getFighter();
			right.setRank( rank.indexOf( right.getName() ) + 1 );
		}
		return true;
	}

	private static void addWin( Map<String, Integer> wins, Fighter fighter, int amount ) {
		int w = wins.getOrDefault( fighter.getName(), 0 );
		wins.put( fighter.getName(), w + amount );
	}

	private static boolean addMatch( Map<String, Integer> matches, Fighter fighter ) {
		Integer count = matches.get( fighter.getName() );
		if( count == null )
			count = 0;
		else if( count + 1 > 3 ) {
			System.err.println( "A fighter ('" + fighter + "') can't fight more than 3 times!" );
			return false;
		}
		matches.put( fighter.getName(), count + 1 );
		return true;
	}
}
