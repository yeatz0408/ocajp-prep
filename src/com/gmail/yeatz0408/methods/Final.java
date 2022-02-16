package com.gmail.yeatz0408.methods;

import java.util.ArrayList;
import java.util.List;

public class Final {
	
//	private static final int SIZE; // final should be initialized since it cannot be modified
	private static final int SIZE = 10;
	private static final List<String> VALUES = new ArrayList<>();

	public static void main(String[] args) {
		
//		SIZE = 11;
		
		int doubleSize = 2 * SIZE;
		
		VALUES.add("Hello");
		System.out.println(VALUES.get(0));

	}

}
