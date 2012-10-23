package incorrect;

public class Opdr4 {
	public static void main(String[] args) {
		Honda h = new Honda();
		boolean b1 = h.accelerate(); //Boolean is bs, dit moet gewoon string zijn!
		boolean b2 = h.c.accelerate(); //Boolean is bs, dit moet gewoon string zijn!
		boolean b3 = h.c.wheels(); //Boolean is bs, dit moet gewoon string zijn!
		
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

//Innerclasses kunnen overal voorkomen en de 
//fout hoeft niet altijd bij de innerclasses te liggen