package com.gmail.yeatz0408.string;

public class StringEquality {

	public static void main(String[] args) {
		
		String a = "java";
		String b = "ja" + "va";
		
		System.out.println(a == b);
		
		String c = "ja ".trim() + "va"; // trim creates another object
		System.out.println(a == c);

	}

}
