
public class Opgave2 {

	public Opgave2 () {
		Runnable r = new MijnRunnable();
		Thread rick = new Thread(r);
		rick.setName("Rick");
		Thread marcel = new Thread(r, "Marcel");
		Thread adam = new Thread (r);
		r.start();
		rick.start();
		marcel.start();
		adam.start();
		if (!rick.isAlive()) {
			rick.start();
		}
	}
	
	public static void main(String[] args) {
		new Opgave2();
	}
}

class MijnRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Running: "+i+" by "+Thread.currentThread().getName());
		}
	}
}