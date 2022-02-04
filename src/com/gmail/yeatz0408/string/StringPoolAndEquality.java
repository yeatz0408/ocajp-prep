package com.gmail.yeatz0408.string;

public class StringPoolAndEquality {

	public static void main(String[] args) {
		
		String name = "john";
		String anotherName = "john";
		String john = "jo" + "hn";
		String newName = new String("john");
		
		System.out.println(name == anotherName);  // true
		System.out.println(anotherName == john);  // true
		System.out.println(john == name);  // true
		System.out.println(name == newName);  // false
		// when created using literals, they are created inside String pool. 
		// Otherwise (like when created using new) they are created in heap.
		
		String str1 = "abc";
		String str2 = "ab";
		String str3 = str2 + "o";
		
		System.out.println(str1 == str3); // false because str3 isn't created from only literals
		

	}

}
