package com.gmail.yeatz0408.string;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String str = "My name is Noah and I like Java";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('N'));
		System.out.println(str.indexOf('a', 15));
		
		String subString = str.substring(16);
		System.out.println(subString);
		System.out.println(str.substring(11, 15));
		System.out.println("substring with the same beginning and end index (" + str.substring(11,11) +")");
		// System.out.println(str.substring(4,2)); // throws StringIndexOutOfBoundsException
		
		System.out.println(str.toUpperCase());
		System.out.println(str);
	}

}
