
public class Opgave6 {
	public Opgave6 () {
		MijnThread6 henk = new MijnThread6("henk");
		MijnThread6 piet = new MijnThread6("piet wacht op henk");
		piet.wachtOpThread = henk;
		MijnThread6 klaas = new MijnThread6("klaas wacht op henk");
		klaas.wachtOpThread = henk;
		MijnThread6 mike = new MijnThread6("mike wacht op piet");
		mike.wachtOpThread = piet;
		henk.start();piet.start();klaas.start();mike.start();
	}

	public static void main(String[] args) {
		new Opgave6();
	}
}

class MijnThread6 extends Thread {
	public Thread wachtOpThread;
	
	public MijnThread6(String name) {
		super(name); 
	}
	
	public void run () {
		if (wachtOpThread != null) {
			try {
				// synchronized(wachtOpThread) {
				wachtOpThread.wait(); // Hier moet een synchronized omheen
				//}
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" is interrupted while waiting!");
			}
		}
		System.out.println(Thread.currentThread().getName()+" klaar!");
		notify();
	}
}