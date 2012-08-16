
public class Foo {

	public static void main(String[] args) {
		
		int alpha = 0Xabcdefg; 
		
		short bravo = (short) 999.001f; 
		
		float charlie = 25.5; 
		
		double delta = 123D + 8; 
		
		byte echo = 128; 
		
		char foxtrot = (char) 666666; 
		
		byte gamma = (byte)(short)(int)(long)(float)(double)-100.00000000D;
		double hotel = (double)(float)(long)(int)(short)(byte) gamma;
		
		System.out.println("Alpha=" + alpha);
		System.out.println("Bravo=" + bravo);
		System.out.println("Charlie=" + charlie);
		System.out.println("Delta=" + delta);
		System.out.println("Echo=" + echo);
		System.out.println("Foxtrot=" + foxtrot);
		System.out.println("Gamma=" + gamma);
		System.out.println("Hotel=" + hotel);
	}
}
