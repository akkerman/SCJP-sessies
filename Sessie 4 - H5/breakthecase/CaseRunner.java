public class CaseRunner {

	public static void main(String[] args) {
		fl: for (int i = 1, j = 0; i < 4; i++, j = i % 2) {
			sl: switch (j) {
			case 1:
				System.out.println(i + " is odd");
				break fl;
			default:
				throw new AssertionError("unexpected " + j);				
			case 0:
				System.out.println(i + " is even");
				break sl;				
			}
			System.out.println("please, print me!"); // Q:is this going to be printed?
		}
	}
}
