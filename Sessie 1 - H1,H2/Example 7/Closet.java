
public class Closet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Closet cl = new Closet();
		
		cl.String = new String[4][5];
		cl.String[3][1] = "Sexy";
		System.out.println(cl.String[3][1].toString());
	}
	
	public String[] String[]; 
}
