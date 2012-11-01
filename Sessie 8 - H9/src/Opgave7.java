
public class Opgave7 {
	public Object lockObject = new Object();
	
	public Opgave7 () {
		MijnThread7 henk = new MijnThread7("henk", lockObject);
		MijnThread7 piet = new MijnThread7("piet wacht op henk");
		piet.wachtOpThread = henk;
		MijnThread7 klaas = new MijnThread7("klaas wacht op henk");
		klaas.wachtOpThread = henk;
		MijnThread7 mike = new MijnThread7("mike wacht op piet");
		mike.wachtOpThread = piet;
		henk.start();piet.start();klaas.start();mike.start();
		mike.interrupt();
		henk.interrupt();
	}

	public static void main(String[] args) {
		new Opgave7();
	}
}

class MijnThread7 extends Thread {
	public Thread wachtOpThread;
	public MijnThread7(String name) {
		super(name); 
	}
	
	public MijnThread7(String name, Object lockObject) {
		super(name);
		try {
			synchronized (lockObject) {
				lockObject.wait(); // Hier gaat de main thread in vast zitten, aangezien de main thread de constructor aanroept
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" is interrupted while waiting on Lock!");
		}
	}
	
	public void run () {
		if (wachtOpThread != null) {
			try {
				wachtOpThread.wait();
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" is interrupted while waiting!");
			}
		}
		System.out.println(Thread.currentThread().getName()+" klaar!");
		notifyAll();
	}
}