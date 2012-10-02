
import java.io.*;

public class Opdr3 {

	
	public static void main(String[] args) {
		
	    try {
	    	//create File object
	    	File file = new File("C://EigenData//demo.txt");
			System.out.print(file.createNewFile());
			
			FileWriter fw = new FileWriter(file);
			fw.write("\"Hello World\"");
			fw.write("\n");
			fw.write("\"Good bye!\"");
			fw.flush();
			fw.close();
			
			FileReader fr =  new FileReader(file);
			BufferedReader br = new BufferedReader(fr); 
			String s; 
			while((s = br.readLine()) != null) { 
				System.out.println(s = s.replaceAll("[\"a-zA-Z]"," ").trim().toUpperCase().toString()); 
			} 
			fr.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
