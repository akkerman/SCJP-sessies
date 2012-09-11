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

// explain what happens for the following command-line invocations:

// 1. java scjp.h5.WeirdCase

// 2. java scjp.h5.WeirdCase hello world
