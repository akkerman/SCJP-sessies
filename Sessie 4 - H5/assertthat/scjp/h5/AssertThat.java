package scjp.h5;

public class AssertThat {
	// remember to NOT do this, since it is inappropriate 
	// to assume things about code you don't control
	public static void main(String[] args) {
		assert ("test".equals(args[0])) : "value should be equal to 'test'";
		System.out.println("Hello World");
	}
}

// explain what happens for the following command-line invocations:

// 1. java scjp.h5.AssertThat

// 2. java -enableassertions scjp.h5.AssertThat

// 3. java -enableassertions scjp.h5.AssertThat hello

// 4. java -enableassertions scjp.h5.AssertThat test
