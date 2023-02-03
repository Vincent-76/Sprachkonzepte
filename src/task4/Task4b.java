package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vincent76
 */

public class Task4b {
	private Task4b() {}

	private static final int MIN_LENGTH = 20;

	public static void main( String[] args ) throws IOException, URISyntaxException {
		var lines = Files.readAllLines( Paths.get( Task4a.class.getResource( "input.txt" ).toURI() ) );

		long start = System.nanoTime();

		List<String> filtered = lines.stream()
				.filter( l -> l.length() >= MIN_LENGTH )
				.collect( Collectors.toList() );
		int n = filtered.stream()
				.map( String::length )
				.reduce( 0, Integer::sum );

		long stop = System.nanoTime();

		System.out.printf( "result = %d (%d microsec)%n", n, ( stop - start ) / 1000 );
	} // result = 10321 (3300 microsec)
}
