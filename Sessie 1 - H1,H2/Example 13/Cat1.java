public class Cat1 implements Sneak{
	static void miauw(){
		System.out.println("Miauw");
	}
	
	public static void main(String[]args){
		Sneak sneaker = new Lion1();
		Lion1 lion = new Lion1();
		Cat1 cat = new Cat1();
		((Cat1)sneaker).miauw();
		Cat1.miauw();
		Lion.miauw();
	}
}

class Lion1 extends Cat1 implements Sneak{
	static void miauw(){
		System.out.println("ROOOOAR");
	}
}

interface Sneak{}

