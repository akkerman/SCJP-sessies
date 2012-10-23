package incorrect;

interface Drivable {}

class Bmw implements Drivable {}

class Serie3 extends Bmw{}

public class Opdr5 {
	private enum Colour {GREEN,YELLOW,BLACK,ICE}
	Serie3 w;
	Colour c1;
	Colour c2;
	Bmw a;
	
	public static void main(String[] args) {
		Car c = new Car();
		c.go();
	}
	
	static class Car{
			a = new Bmw();
			c1 = Colour.YELLOW;
			c2 = Colour.YELLOW;
		
		void printSomething() {
			c1.toString();
			c2.toString().toLowerCase();
			System.out.println("c1: " + c1 + " c2:" + c2);
		}
		
		void go() {// c1 does = 2 but w is null, so instanceOf is false
			if (w instanceof Drivable && c1 == c2 ){ System.out.println("Drivable");}
		}
	}
}