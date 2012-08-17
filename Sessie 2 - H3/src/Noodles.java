public class Noodles {
	
	private static int wagamama;

	public static void main(String[] args) {
		Noodles g = new Noodles();
		g.slurp();
	}
	
	private static void slurp() {
		for(int s = 010; s < (int)10; ++s) {
			int istrue = 1;
			if(istrue) 
				wagamama = s; 
			System.out.println(s);
		}
		System.out.println(istrue);
		System.out.println(wagamama);
	}
	
	{ wagamama = 20; }
}