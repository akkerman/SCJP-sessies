package scjp.h7;

import java.util.*;

public class Duwer {	
	public static void main(String[] args) {
		List<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto());

		new Duwer().duwAlles(autos);
	}


//	void duwAlles(List<Rijdbaar> rijders) {
	void duwAlles(List<? extends Rijdbaar> rijders) {
	
		for (Rijdbaar rij : rijders)
			rij.rij();
	}
}

interface Rijdbaar {
	void rij();
}

class Auto implements Rijdbaar {
	@Override public void rij() {
		System.out.println("rij auto");
	}
}