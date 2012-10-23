package correct;

interface Animal{ void animal();}

class Dog{ void doStuff(Animal a) {System.out.println("Dog"); a.animal()/*manier 1*/;} }

class Opdr7 {
	public static void main(String[] args) {
		Opdr7 op7 = new Opdr7();
		op7.go();
	}
	
	void go() {
		Dog d = new Dog();
		d.doStuff(new Animal() {
			{animal();} //manier 2
			public void animal() {				
				System.out.println("Dog animal");
			}
		});
	}
}

//"Dog animal" kan je in iedergeval op 2 manieren printen
//zie "manier 1" en manier 2.