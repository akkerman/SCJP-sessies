package scjp.h7;

import java.util.*;

public class Birthdays {
	public static void main(String[] args) {
		Map<Friend, String> map = new HashMap<Friend, String>();
		map.put(new Friend("John"), "June 21 1980");
		map.put(new Friend("Tom"), "Oktober 2 1991");

		Friends f = new Friends(args[0]);
		System.out.println(map.get(f));
	}
}

class Friend {
	String name;

	Friend(String n) {
		name = n;
	}
}

// what is the output given the following command-line invocation:
// java Birthdays Tom 