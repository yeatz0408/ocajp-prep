package com.gmail.yeatz0408.javaBasics;

public class UnderstandingNull {
	
	static Object myObject = new Object();
	static Object myOtherObject;

	public static void main(String[] args) {
		Object myLocalObject = new Object();
		Object anotherLocalObject;
		
		String name = "Java";
		String anotherName = null;
		
		System.out.println(myObject);
		System.out.println(myOtherObject);
		
		System.out.println(myLocalObject);
		// System.out.println(anotherLocalObject);
		
		System.out.println(name);
		System.out.println(anotherName);

	}

}
