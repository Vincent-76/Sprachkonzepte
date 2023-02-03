package task4;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vincent76
 */

public class Task4a {
	private Task4a() {}

	private static final int MIN_LENGTH = 20;

	public static void main( String[] args ) throws IOException, URISyntaxException {
		var input = Files.newBufferedReader( Paths.get( Task4a.class.getResource( "input.txt" ).toURI() ) );
		var lines = new LinkedList<String>();

		long start = System.nanoTime();

		readLines( input, lines );
		removeEmptyLines( lines );
		removeShortLines( lines );
		int n = totalLineLengths( lines );

		long stop = System.nanoTime();

		System.out.printf( "result = %d (%d microsec)%n", n, ( stop - start ) / 1000 );
	} // result = 10321 (2240 microsec)

	private static void readLines( BufferedReader input, List<String> lines ) throws IOException {
		String line;
		while( ( line = input.readLine() ) != null ) {
			lines.add( line );
		}
	}

	private static void removeEmptyLines( List<String> lines ) {
		Iterator<String> it = lines.iterator();
		while( it.hasNext() ) {
			String s = it.next();
			if( s.isEmpty() )
				it.remove();
		}
	}

	private static void removeShortLines( List<String> lines ) {
		Iterator<String> it = lines.iterator();
		while( it.hasNext() ) {
			String s = it.next();
			if( s.length() < MIN_LENGTH )
				it.remove();
		}
	}

	private static int totalLineLengths( List<String> lines ) {
		int l = 0;
		for( int i = 0; i < lines.size(); i++ )
			l += lines.get( i ).length();
		return l;
	}

	// Prozedural weil alles statisch und kaum Rückgabewerte, parameter werden in sich selbst verändert,
	// Schleifen, keine Lambdas, ...
}
