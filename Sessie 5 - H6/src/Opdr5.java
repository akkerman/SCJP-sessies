import java.util.regex.*;

public class Opdr5 {

public static void main(String[] args) {

  String s1 = "\\d\\w.";
  String s2 = "ab4^~@ 56_7!ab9% 4A$";
  Pattern p = new Pattern(s1); 
  Matcher m = p.matcher(s2);

   while(m.find()) {
     System.out.println(m.start() + " " + m.group() ); 
    }
  }
}
