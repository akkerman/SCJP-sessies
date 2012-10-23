package incorrect;

interface Animal{ void animal();}

class Dog{ 
	void doStuff(Animal a) {System.out.println("Dog");} //print animal niet, aangezien deze er niet is
}

class Opdr7 {
	public static void main(String[] args) {
		Opdr7 op7 = new Opdr7();
		op7.go();
	}
	
	void go() {
		Dog d = new Dog();
		d.doStuff(new Animal() {
			public void animal() {
				System.out.println("Dog animal");
			}
		};//); moet achter het haakje staan
	}
}