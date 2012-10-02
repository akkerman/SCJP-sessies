
import java.io.*;
public class Opdr4 {

	public static void main(String[] args) {
		
		BulDog dog = new BulDog(35, "Fido", "black");
    	System.out.print("weight = " + dog.weight + " name = " +  dog.name + " color = " +  dog.col.getCol());
	    System.out.print("\n");
    	try
	      {
	         FileOutputStream fileOut =
	        		 new FileOutputStream("buldog.ser");
	         ObjectOutputStream out =
	                            new ObjectOutputStream(fileOut);
	         out.writeObject(dog);
	         out.close();
	         fileOut.close();
 	      }catch(IOException i) { i.printStackTrace(); }

	    try
	      {
	    	FileInputStream fileInput  =
	        		 new FileInputStream("buldog.ser");
	         ObjectInputStream ois =
                     new ObjectInputStream(fileInput);
	         try {
	        	 dog = (BulDog) ois.readObject();
				ois.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	      }catch(IOException i) { i.printStackTrace(); }
	    
	    System.out.print("\n");
        System.out.print("weight = " + dog.weight + " name = " +  dog.name + " color = " +  dog.col.getCol());
        
	}
}

class BulDog extends Dog implements Serializable{
	String name;
	Color col = new Color();
	BulDog(int w, String n, String color){
		weight = w;
		name = n;
		col.setCol(color);
	}
}

class Dog {
	static int weight = 42;
}

class Color {
	String col = "white";
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
}