package com.gmail.yeatz0408.string;

public class ChainingMethods {

	public static void main(String[] args) {
		
		String start = "  Java  ";
		
		String trimmed = start.trim();
		String lowerCase = trimmed.toLowerCase();
		String result = lowerCase.replace('j', 'J');
		
		String another = "  Java  ".trim().toLowerCase().replace('j', 'J');
		System.out.println(result);
		System.out.println(another);
		System.out.println(result.equals(another));

	}

}
