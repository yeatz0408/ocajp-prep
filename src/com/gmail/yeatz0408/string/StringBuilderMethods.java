package com.gmail.yeatz0408.string;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("programming");
		String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
		
		int len = sb.length();
		char ch = sb.charAt(5);
		System.out.println(sub + " " + len + " " + ch);
		
		sb.insert(7, "-");
		sb.insert(2, 2);
		
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		sb.deleteCharAt(5);
		
		sb.delete(3, 4);
		sb.delete(1, 1); // this doesn't change anything
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		String string = sb.toString();
		
	}

}
