package com.gmail.yeatz0408.javaBasics;

public class DefaultInitialization {
	
	static boolean myBoolean;
	static byte myByte;
	static short myShort;
	static int myInt;
	static long myLong;
	static float myFloat;
	static double myDouble;
	static char myChar;

	public static void main(String[] args) {
		
		// local variables need initialization
		int localInt;
		
		// System.out.println(localInt);
		
		
		// static variables have default initialization.
		System.out.println(myBoolean);
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println("myChar(" + myChar + ")");
		

	}

}
