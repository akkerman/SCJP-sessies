
public class Opgave5 implements Runnable {
	private Thread vorige;
	
	public Opgave5() {
		
	}
	
	public Opgave5(Thread vorige) {
		this.vorige = vorige;
	}
	
	public void run() {
		System.out.println("Ik run!");
		if (this.vorige != null) {
			try {
				this.vorige.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("En ben klaar.");
	}
	
	public static void main(String[] args) {
		Thread eersteOpgave5 = new Thread(new Opgave5());
		eersteOpgave5.start();
		new Thread(new Opgave5(eersteOpgave5)).start();
	}
}
