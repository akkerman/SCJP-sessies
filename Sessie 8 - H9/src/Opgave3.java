
public class Opgave3 {
	public Opgave3() {
		Thread pietje = new SnoepjePakken("Pietje");
		Thread jantje = new SnoepjePakken("Jantje");
		Thread klaasje = new SnoepjePakken("klaasje");
		pietje.setPriority(Thread.MAX_PRIORITY);
		jantje.setPriority(Thread.NORM_PRIORITY);
		klaasje.setPriority(5);
		pietje.start();jantje.start();klaasje.start();
	}
	
	public static void main(String[] args) {
		new Opgave3();
	}
}

class SnoepjePakken extends Thread {
	//public SnoepjePakken (String name) {
		//super(name);
	//}
	
	public void run () {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" pakt een snoepje al "+i+" keer!");
			if (i == 3) {
				Thread.yield();
			}
		}
	}
}