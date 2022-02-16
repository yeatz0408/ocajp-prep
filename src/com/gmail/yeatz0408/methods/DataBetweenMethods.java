package com.gmail.yeatz0408.methods;

public class DataBetweenMethods {
	
	public static void newNumber(int i) {
		i = 10;
	}
	
	public static void newName(String a) {
		a = "Noah";
	}

	public static void main(String[] args) {
		
		int number = 0;
		newNumber(number);
		System.out.println(number);
		
		String name = "Tommy";
		newName(name);
		System.out.println(name);

	}

}
