package com.gmail.yeatz0408.string;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String str = "java";
		String str2 = "Java";
		String str3 = "ja";
		
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		
		
		//startsWith / endsWith
		System.out.println(str.startsWith("j"));
		System.out.println(str.startsWith(str3));
		System.out.println(str.startsWith("J".toLowerCase())); //******* on literals
		System.out.println(str.endsWith("va"));
		
		// contains
		System.out.println("contains method");
		System.out.println(str.contains(str3));
		System.out.println(str.contains("av"));
		System.out.println("Java".contains("j".toUpperCase()));
		
		// replace
		System.out.println("replace method");
		
		String myString = "Java" + " " + "is" + " " + "cool";
		
		System.out.println(myString.replace('a', 'A'));
		System.out.println(myString.replace(" ", "_"));
		System.out.println(myString.replace("is", "_"));
		
		
		// trim
		
		System.out.println("Java".trim());
		System.out.println("  Java is cool  ");
		System.out.println("  Java is cool  ".trim());
	}

}







