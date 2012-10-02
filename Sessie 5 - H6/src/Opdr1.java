
public class Opdr1 {


	public static void main(String[] args) {
		
		String s1 = "APPEL "; // 1
		String s2 = "PEER "; // 2
		s2.toLowerCase(); // 3
		s1.concat("MIES"); // 4 // 5
		s1 += s2; // 6
		s1 += "CITROEN"; // 7
		
		StringBuffer sb = new StringBuffer("appel "); // 8
		sb.append("peer ").append("citroen").toString().toUpperCase();  // 9 , 10 , 11
		
		if (s1.equals(sb.toString())){
			System.out.print("gelijk"); // 12
		}
	}
}
