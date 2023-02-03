package task2;

/**
 * @author Vincent76
 */
public class Fight {
	private final Score left;
	private final Score right;

	public Fight( Score left, Score right ) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left + " / " + right;
	}
}
