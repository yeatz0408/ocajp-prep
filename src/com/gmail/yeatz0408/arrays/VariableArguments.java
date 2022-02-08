package com.gmail.yeatz0408.arrays;

import java.util.Arrays;

public class VariableArguments {

	public static void main(String ... args) { // ... is the varags

		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		print("Java ", "is ", "cool", "!");
		print(new String[] {"Java", " is", "OK"});
	}
	
	public static void print(String ... myArguemnts) {
		System.out.println(Arrays.toString(myArguemnts));
	}

}
