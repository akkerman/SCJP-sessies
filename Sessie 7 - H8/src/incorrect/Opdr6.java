package incorrect;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Opdr6 {
	static class Inner{
		static String x = "test";
		
		void doStuff(){
			x += "ing";
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.doStuff();
		
		Big.Small bigSmall = new Big().Small("Yo", "Wazzup"); //() te veel
		System.out.println("Before serialize:" + bigSmall.getStrings());
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("opdr6.ser"));
			os.writeObject(bigSmall);
			os.flush();
			os.close();
		}catch (Exception e) {e.printStackTrace();}
		
		try{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("opdr6.ser"));
			bigSmall = (Big.Small) is.readObject();
			is.close();
		}catch(Exception e) {e.printStackTrace();}
		
		System.out.println("After serialize: " + bigSmall.getStrings());
	}
}

class Big implements Serializable{
	static class Small{//deze class is niet serializable, dus dan zal je runtime error krijgen als je deze niet implementeert
		static String x;
		static String y;
		
		Small(String x, String y){
			Small.x = x;
			Small.y = y;
		}
		
		String getStrings(){return x + " " + y;}
	}
}