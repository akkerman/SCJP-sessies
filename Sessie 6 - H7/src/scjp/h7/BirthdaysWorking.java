package scjp.h7;

import java.util.*;

public class BirthdaysWorking {
	public static void main(String[] args) {
		Map<Friends, String> map = new HashMap<Friends, String>();
		map.put(new Friends("John"), "June 21 1980");
		map.put(new Friends("Tom"), "Oktober 2 1991");
		Friends f = new Friends(args[0]);
		System.out.println(map.get(f));
	}
}

class Friends {
	String name;

	Friends(String n) {
		name = n;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) 
			return true;
		if (obj instanceof Friends) {
			Friends that = (Friends)obj;
			return this.name.equals(that.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 13 * this.name.hashCode();
	}
}

// what is the output given the following command-line invocation:
// java Birthdays Tom 