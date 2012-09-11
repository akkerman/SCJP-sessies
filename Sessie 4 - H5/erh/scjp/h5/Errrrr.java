package scjp.h5;

public class Errrrr {
	static String a = null, s = "";

	public static void main(String[] args) {
		try {
			a = args[0];
			System.out.print(a);
			s += "t1 ";
		} catch (RuntimeException re) {
			s += "c1 ";
		} finally {
			s += "f1 ";
		}
		System.out.println(" " + s);
	}
}

// explain what happens for the following command-line invocations:
// 1. java scjp.h5.Errrrr
// 2. java scjp.h5.Errrrr x 