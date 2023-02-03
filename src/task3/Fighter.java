package task3;

/**
 * @author Vincent76
 */
public class Fighter {
	private final String name;

	public Fighter( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals( Object obj ) {
		return obj instanceof Fighter && ( ( Fighter ) obj ).name.equals( this.name );
	}

	@Override
	public String toString() {
		return name;
	}
}
