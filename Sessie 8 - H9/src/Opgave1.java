
public class Opgave1 {

	public Opgave1 () {
		for (int i = 0; i < 3; i++) {
			Thread t = new MijnThread();
			t.run(i);
		}
	}
	
	public static void main(String[] args) {
		new Opgave1();
	}
}

class MijnThread extends Thread {
	public void run (int s) {
		System.out.println("Thread: "+s+" is aan het runnen!");
	}
}