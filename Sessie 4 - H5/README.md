# SCJP6 - sessie 4 - H5
## Flow Control, Exceptions, and Assertions

	public class AssertThat {
		// remember to NOT do this, since it is inappropriate 
		// to assume things about code you don't control
		public static void main(String[] args) {
			assert ("test".equals(args[0])) : "value should be equal to 'test'";
			System.out.println("Hello World");
		}
	}

explain what happens for the following command-line invocations:  
1.  java AssertThat  
2.  java -enableassertions AssertThat  
3.  java -enableassertions AssertThat hello  
4.  java -enableassertions AssertThat test  

---

	public class Errrrr {
		static String a = null, s = "";

		public static void main(String[] args) {
			try {
				a = args[0];
				System.out.print(a);
				s += "t1 ";
			} catch (RuntimeException re) {
				s += "c1 ";
			} finally {
				s += "f1 ";
			}
			System.out.println(" " + s);
		}
	}

explain what happens for the following command-line invocations:  
1. java Errrrr  
2. java Errrrr x  

---

	package scjp.h5;

	public class WeirdCase {
		public static void main(String[] args) {		
			switch (args.length >= 0) {
				case true: 
					{ final Short var = 12; System.out.println(var);	}
					{ final String var = "12"; System.out.println(var);	}
				default: {
					{ System.out.println("do nothing");	}
				}
			}
		}
	}

explain what happens for the following command-line invocations:  
1. java scjp.h5.WeirdCasen  
2. java scjp.h5.WeirdCase hello world  

---

	package scjp.h5;

	public class WeirdCaseRevisited {
		public static void main(String[] args) {		
			switch (args.length) {
				case 1:
				case 2:
					{ final Short var = 12; System.out.println(var);	}
					{ final String var = "12"; System.out.println(var);	}
				default: {
					{ System.out.println("do nothing");	}
				}
			}
		}
	}

explain what happens for the following command-line invocations:  
1. java scjp.h5.WeirdCaseRevisited  
2. java scjp.h5.WeirdCaseRevisited hello world  

--- 

	class SubException extends Exception {}
	class SubSubException extends SubException {}

	class CC { void doStuff() throws SubException {} }

	class CC2 extends CC { void doStuff() throws SubSubException { } }

	class CC3 extends CC { void doStuff() throws Exception { } }

	class CC4 extends CC { void doStuff(int x) throws Exception { } }

	class CC5 extends CC { void doStuff() { } }

--- 

	package scjp.h5;

	public class BreakTheCase {

		public static void main(String[] args) {
			fl: for (int i = 1, j = 0; i < 4; j = i++ % 2) {
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
				System.out.println("please, print me!"); // Q:is this going to be printed? why?
			}
		}
	}

---

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
		     { System.out.println("init");   return 0;  }
		int max()
		     { System.out.println("max");    return 3;  } 
		int iterate(int i) 
		     { System.out.println("iterate");return i+1; } 
	}

