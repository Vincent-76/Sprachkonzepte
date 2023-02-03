package task2;

/**
 * @author Vincent76
 */
public class Score {
	private final Fighter fighter;
	private final Points points;

	public Score( Fighter fighter, Points points ) {
		this.fighter = fighter;
		this.points = points;
	}

	@Override
	public String toString() {
		return "(" + fighter + " : " + points + ")";
	}
}
