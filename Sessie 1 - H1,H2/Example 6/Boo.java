public class Boo {
	public static void main(String[] args) {
		Zoo zoo = new Moo();
		((Boo)zoo).doStuff();
	}

	void doStuff(){
		System.out.println("Boo is called");
	}
}

class Moo extends Boo implements Zoo{
	public void doStuff(){
		System.out.println("Moo is called");
	}
}

interface Zoo{
	void doStuff();
}
