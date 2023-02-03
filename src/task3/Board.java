package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vincent76
 */
public class Board {
	private final List<Fight> fights = new ArrayList<>();

	public void addFight( Fight fight ) {
		this.fights.add( fight );
	}

	public List<Fight> getFights() {
		return fights;
	}

	@Override
	public String toString() {
		return fights.stream().map( Fight::toString ).collect( Collectors.joining() );
	}
}
