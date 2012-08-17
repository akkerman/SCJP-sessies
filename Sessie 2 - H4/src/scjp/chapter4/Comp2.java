package scjp.chapter4;

public class Comp2 {


	public static void main(String[] args) {
		float f1 = 2.3f;
		float [][] f2 = {{42.0f},{1.7f,2.3f},{2.6f, 2.7f}};
		float [] f3 = {2.7f};
		long x = 42l;
		if(f1 == f2[1][1] | f1 <= f2[2][2]) 
		System.out.println("true");
	}

}
