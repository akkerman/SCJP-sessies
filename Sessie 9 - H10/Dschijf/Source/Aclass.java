package com.util.cmd;

import java.util.*;

public class Aclass{

	public static void main (String[] args) {

	Properties p = System.getProperties();
	p.setProperty(args[0],args[1]);
	//p.list(System.out);	
	System.out.println(p.get(args[0]));
	
	}
}
