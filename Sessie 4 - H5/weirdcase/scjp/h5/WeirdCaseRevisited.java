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
// explain what happens for the following command-line invocations:

//1. java scjp.h5.WeirdCaseRevisited

//2. java scjp.h5.WeirdCaseRevisited hello world