package task3;

/**
 * @author Vincent76
 */
public class Points {
	private final String points;

	public Points( String points ) {
		this.points = points;
	}

	public String getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return points;
	}
}
