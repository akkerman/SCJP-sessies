package correct;

public class Opdr4 {
	public static void main(String[] args) {
		Honda h = new Honda();
		String b1 = h.accelerate();
		String b2 = h.c.accelerate();
		String b3 = h.c.wheels();
		
		if(b1.equals(b2) && !b3.equals(""))System.out.println("Special for you my friend!");
	}

}

interface Car{
	String accelerate();
	String seats();
	String wheels();
}

class Honda implements Car{
	Car c = new Car() {
		public String accelerate() {return "Anonymous Accelerate";}
		public String seats() {return "Anonymous Seats";}
		public String wheels() {return "Anonymous Wheels";}
	};

	public String accelerate() {return "Accelerate";}
	public String seats() {return "Accelerate";}
	public String wheels() {return "Accelerate";}
}