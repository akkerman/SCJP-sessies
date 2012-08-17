package scjp.chapter4;

interface Colourable {}

class KidsBook implements Colourable {}

class Wall extends KidsBook{}

public class EnumsAndInterfaces {
	
	enum Colour {GREEN,YELLOW}
	static Wall w;
	
	public static void main(String[] args) {
		
		KidsBook a = new KidsBook();
		Colour c1 = Colour.YELLOW;
		Colour c2 = Colour.YELLOW;
		
		if ( w instanceof Colourable && c1 == c2 ){  // c1 does = 2 but w is null, so instanceOf is false
			 System.out.println("The wall is no longer white");
		}
	}
}

