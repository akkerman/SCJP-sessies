import java.util.*;
public class Cclass {
	public static void main (String [] args){
	int asserter = 107;
	assert(++asserter > 7);
	Properties p = System.getProperties();	
	System.out.println(p.get("assert"));
	}
}
