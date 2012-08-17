public class Harem {

	public static void main(String[] args) {
		addWife( 160, 200 );
		addWife(new int[] = {10,20,23,24});
		addWife( 1600000, 2000000000);
		addWife( 9 );
	}
	
	static void addWife(Integer... stats) {
		System.out.println("Wife stat added:" + stats);
	}
	
	static void addWife(Integer length, Integer weight) {
		System.out.println("Wife added:l" + length.intValue() + "+h" + Integer.parseInt(weight));
	}
	
	static void addWife(Long price, Long paymentToParents) {
		System.out.println("Wife added:€" + price + '+€' + paymentToParents + " until you die");
	}	
	
	static void addWife(short IQ) {
		System.out.println("Wife added:iq=" + IQ);
	}	
}
