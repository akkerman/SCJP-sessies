package scjp.chapter4;

public class GuessAnimal {
	
	public static void main(String [] args) {
		Boolean isAlive = false;
		String animal ="unknown";
		int weight = 700;
		char sex = 'm';
		double colorWavelength = 1.630;
		if (isAlive = true){
			if (weight >= 500) {animal = "elephant";}
			if(colorWavelength > 1.621 ){animal = "gray " + animal;}
			if (sex <= 'f'){ animal = "female " + animal;}
			System.out.println("The animal is a " + animal);
		}
	}
}
