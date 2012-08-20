package scjp.h5;

// Assume this program compiles and runs correctly
public class ForRunner {	

	public static void main(String[] args) {
		new ForRunner().run(); 	// what is the output?
	}

	void run() {
		for (int i = init(); i < max(); i = iterate(i)) {
			System.out.println("body");
		}
	}

	int init()         
	     { System.out.println("init");   return 0; }
	int max()          
	     { System.out.println("max");    return 3;   } 
	int iterate(int i) 
	     { System.out.println("iterate");return i+1; } 
}