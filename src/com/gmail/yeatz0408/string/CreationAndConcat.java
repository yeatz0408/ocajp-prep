package com.gmail.yeatz0408.string;

public class CreationAndConcat {

	public static void main(String[] args) {
		
		int number = 10;
		int anotherNumber = 20;
		System.out.println("result= " + (number + anotherNumber));
		System.out.println("result= " + number + anotherNumber);
		
		
		String str = "";
		for (int i = 0; i < 10; i++) {
			str += i + " ";
		}
		
		System.out.println(str);
		
		String hello = "hello";
		String world = "world";
		String helloWorld = hello + world;
		
		
		// concat
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
