public class Foo {
	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.doStuff();
	}

	void doStuff(){}
}

class Voo extends Foo implements Roo{
	void doStuff(){};
}

interface Roo{
	void doStuff();
}
