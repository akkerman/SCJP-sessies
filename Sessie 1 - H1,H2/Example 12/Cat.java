public class Cat{
	static void miauw(){ System.out.println("Miauw"); }
	
	void walk(int speed){
		System.out.println("Cat is walking at " + speed);
	}
	
	public static void main(String[]args){
		miauw();
		new Lion().walk(11.0);
		((Cat)new Lion()).walk(11.0);
	}
}

class Lion extends Cat{
	static void miauw(){ System.out.println("ROOOOAR"); }
	
	void walk(double speed){
		System.out.println("Lion is walking!! " + speed);
	}
}




