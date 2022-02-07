package com.gmail.yeatz0408.string;

public class StringBuilderExamples {

	public static void main(String[] args) {
		
		String string = "The alphabets:    ";
		StringBuilder sb = new StringBuilder("The alphabets:    ");
		System.out.println(sb.hashCode());
		
		
		for (char c = 'a'; c <='z'; c++) {
			string += c;
			sb.append(c);
			System.out.println("sb: " + sb.hashCode() + "  " + sb);
			System.out.println("st: " + string.hashCode() + "  " + string);
		}
		
		StringBuilder noah = new StringBuilder("Noah");
		StringBuilder jung = noah.append("Jung");
		
		System.out.println(noah + "    " + (noah.hashCode()));
		System.out.println(jung + "    " + (jung.hashCode()));
		
		StringBuilder capacity = new StringBuilder(100);
		System.out.println(capacity.capacity());
		System.out.println(capacity.length());
		
		capacity.append("hello");
		
		System.out.println(capacity.length());
		
		

	}

}
