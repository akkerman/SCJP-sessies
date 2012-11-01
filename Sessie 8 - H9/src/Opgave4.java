
public class Opgave4 {
	private static int pot = 1000;
	
	public static synchronized int getPot () {
		return pot;
	}
	
	public static synchronized void setPot (int value) {
		pot = value;
	}
	
	public static boolean pakGeld (int aantalEuros) {
		if (getPot() > 0) {
			setPot(getPot()-aantalEuros) ; return true;
		}
		return false;
	}
	
	public Opgave4 () {
		Thread chris = new KlantThread("Chris"); // stel pakt 3 van de 10
		Thread rob = new KlantThread("Rob"); // stel pakt 2 van de 10
		Thread tjalke = new KlantThread("Tjalke"); // stel pakt 5 van de 10
		chris.start();rob.start();tjalke.start();
	}

	public static void main(String[] args) {
		new Opgave4();
		new Opgave4();
	}
}

class KlantThread extends Thread {
	public KlantThread(String name) {
		super(name);
	}
	
	public void run () {
		int geld = 0;
		while(Opgave4.pakGeld(100)) {
			geld += 100;
		}
		System.out.println(Thread.currentThread().getName()+" heeft gepakt: "+geld);
	}
}