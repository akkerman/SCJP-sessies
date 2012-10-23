package correct;

public class Opdr2 {
	private String x = "Outer2";
	
	public static void main(String[] args) {
		Opdr2 outer = new Opdr2();
		outer.doStuff();
		outer.doMoreStuff();
	}
	
	void doStuff() {
		class MyInner{
			public void seeOuter() {System.out.println("Outer x is: " + x);}
		}
		
		MyInner inner = new MyInner();
		inner.seeOuter();
	}
	
	void doMoreStuff() {
		class MyInner{
			String x = "Inner";
			public void seeOuter() {System.out.println("Method x is: " + x);}
			//public void seeOuter() {System.out.println("Method x is: " + Opdr2.this.x);}
		}
		
		MyInner inner = new MyInner();
		inner.seeOuter();
	}
}