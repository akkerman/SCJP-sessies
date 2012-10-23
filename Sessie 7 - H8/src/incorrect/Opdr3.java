package incorrect;

public class Opdr3 {
	public static void main(String[] args) {
		MyInner inner = new Opdr3().new MyInner();
		inner.myInner();
		
		myOuter3rd();
	}
	
	public static void myOuter3rd() {
		Opdr3 outer = new Opdr3();
		outer.myOuter2nd();
		System.out.println("My outer 3rd static");
	}
	
	public void myOuter() {
		System.out.println("my outer 1st");
	}
	
	public void myOuter2nd() {
		this.myOuter();
		System.out.println("My outer 2nd");
	}
	
	class MyInner{
		void myInner() {
			System.out.println("myInner method");
			Opdr3.this.myOuter();
		}
		
		void myStaticInner() {
			System.out.println("myInner static method");
		}
	}
}

/*
Output

myInner method
my outer 1st
my outer 1st
My outer 2nd
My outer 3th static*/