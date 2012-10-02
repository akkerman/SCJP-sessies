
public class Opdr6 {

	 public static final String EXAMPLE_TEST = "This is my small example "
		      + "string which I'm going to " + "use for pattern matching.";

	  public static void main(String[] args) {
			  
	    System.out.println(EXAMPLE_TEST.matches("\\w.*"));
	    System.out.println(EXAMPLE_TEST.matches("\\d.*"));
	    System.out.println(EXAMPLE_TEST.matches("\\s.*")); // "....\\s.*"
	    
	    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
	    
	   System.out.println(splitString.length);
	    
	    for (String string : splitString) {
	      System.out.println(string);
	    }
		    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
	  }
}
