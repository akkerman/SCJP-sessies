package incorrect;

public class Opdr2 {
	private String x = "Outer2";
	
	public static void main(String[] args) {
		Opdr2 outer = new Opdr2();
		outer.doStuff().MyInner().seeOuter();
		outer.doMoreStuff().MyInner().seeOuter();
	}
	
	void doStuff() {
		class MyInner{
			public void seeOuter() {System.out.println("Outer x is: " + x);}
		}
		
		//instantiate innerclass
		//call MyInner method
	}
	
	void doMoreStuff() {
		String x = "Inner";
		class MyInner{			
			public void seeOuter() {System.out.println("Method x is: " + x);} //1
					
		}
		
		//instantiate innerclass
		//call MyInner method
	}
}

//Zie 1:
//Naast dat Inner wordt getoond, hoe krijg ik de instance variable van Opdr2 x erin?