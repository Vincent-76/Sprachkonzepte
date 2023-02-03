package task3;

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

	public Score getLeft() {
		return left;
	}

	public Score getRight() {
		return right;
	}

	public boolean equalsFighter( Fight fight ) {
		return this.getLeft().getFighter().equals( fight.getLeft().getFighter() )
				&& this.getRight().getFighter().equals( fight.getRight().getFighter() )
				|| this.getRight().getFighter().equals( fight.getLeft().getFighter() )
				&& this.getLeft().getFighter().equals( fight.getRight().getFighter() );
	}

	@Override
	public String toString() {
		return left + " / " + right + ";";
	}
}
