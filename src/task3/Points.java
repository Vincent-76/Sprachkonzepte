package task3;

/**
 * @author Vincent76
 */
public class Points {
	private final int points;

	public Points( int points ) {
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return String.valueOf( points );
	}
}
