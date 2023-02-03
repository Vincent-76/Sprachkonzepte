package task6;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vincent76
 */
public class Task6 {
	public static void main( String[] args ) throws IOException, URISyntaxException {
		List<Class<?>> classes = new ArrayList<>();
		classes.add( String.class );
		classes.add( Iterator.class );
		classes.add( Month.class );

		String res = generateHTML( classes );
		File f = new File( Paths.get( "D:\\aufgabe6.html" ).toUri() );
		f.delete();
		f.createNewFile();
		FileWriter fw = new FileWriter( f, false );
		fw.write( res );
		fw.close();
	}

	public static String generateHTML( List<Class<?>> classes ) throws URISyntaxException, MalformedURLException {
		ClassData[] classData = classes.stream().map( Task6::mapClass ).toArray( ClassData[]::new );
		ST templ = new STGroupFile( Task6.class.getResource( "aufgabe6.stg" ).toURI().toURL() ).getInstanceOf( "classes" );
		templ.add( "cl", classData );
		return templ.render();
	}

	private static ClassData mapClass( Class<?> c ) {
		String name = c.getName();
		String[] methods = new String[0];
		if( c.isInterface() )
			methods = Arrays.stream( c.getMethods() ).map( Task6::mapMethod ).toArray( String[]::new );
		Interface[] interfaces = Arrays.stream( c.getInterfaces() ).map( Task6::mapInterface ).toArray( Interface[]::new );
		return new ClassData( name, c.isInterface(), methods, interfaces );
	}

	private static Interface mapInterface( Class<?> i ) {
		String name = i.getName();
		String[] methods = Arrays.stream( i.getMethods() ).map( Task6::mapMethod ).toArray( String[]::new );
		return new Interface( name, methods );
	}

	private static String mapMethod( Method m ) {
		String returnType = m.getReturnType().getName();
		String name = m.getName();
		String parameters = Arrays.stream( m.getParameters() ).map( p -> p.getType().getName() ).collect( Collectors.joining( ", " ) );
		return returnType + " " + name + "(" + parameters + ")";
	}
}

final class ClassData {
	public final String name;
	public final boolean isInterface;
	public final String[] methods;
	public final Interface[] interfaces;

	ClassData( String name, boolean isInterface, String[] methods, Interface[] interfaces ) {
		this.name = name;
		this.isInterface = isInterface;
		this.methods = methods;
		this.interfaces = interfaces;
	}
}

final class Interface {
	public final String name;
	public final String[] methods;

	Interface( String name, String[] methods ) {
		this.name = name;
		this.methods = methods;
	}
}
