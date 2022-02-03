package com.gmail.yeatz0408;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators
		
		int basics = 100 + 2 - 2 * 4 / 2;
		int postIncrement = basics++;
		int preIncrement = --basics;
		int postDecrement = basics--;
		int preDecrement = --basics;

		int modules = 11 % 2;
//		System.out.println(modules);
		
		
		
		// promotion
  
  		int intPromo = 5;
  		double doublePromo = 5.55;
  		
 // 	System.out.println(intPromo + doublePromo);
  		
  		// int intDouble = 5 + doublePromo;
  		int intDouble = 5 + (int) doublePromo;
 // 	System.out.println(intDouble);
  
  		int bytePromo = 5;
  		int byteInt = bytePromo + 5;
 // 	System.out.println(byteInt);

  		
  		
  		
  		// Unary Operators
  		
  		int positive = +10;
  		int negative = -10;
  		 
  		int postIncre = positive ++;
  		int increment = ++positive;
  		 
  		boolean invert = false;
  		boolean inverted = !invert;
  		 
  		 
  		 // increment and decrement have higher order than (+-* /)
  		  		 
  		int newInt = 5;
  		// System.out.println(20 / --newInt);
  		

  		
  		
  		
  		/*
  		 Assignment operators
  		 */
  		// overflow and underflow
  		int x = (int) 1.0; // 1
  		short y = (short) 324892482; // 20473
  		int z = (int) 9.23f; // 9
  		long t = 32849328329402L; 
  		
  		byte myByte = 127;
  		byte myOtherByte = -128;
  		
  		// myByte = myByte + 1; // this doesn't work because 1 is an int as a literal
  		// myOtherByte = myOtherByte - 1; // the same
  		
  		myByte++; // now -128
  		myOtherByte--; // now +127
  		
  		// System.out.println(myByte);
  		// System.out.println(myOtherByte);
  		
  		short short1 = 10;
  		short short2 = 20;
  		// short short3 = short1 * short2 // this doesn't work because short is promoted to int when used.
  		short short3 = (short) (short1 * short2);
  		
  		
  		
  		/** 
  		 * Compound Assignment Operators
  		 */

  		int compound = 2;
  		  		
  		compound += 3; // short for compound = compound + 3;
  		compound -= 3; // short for compound = compound - 3;
  		compound *= 3; // short for compound = compound * 3;
  		compound /= 3; // short for compound = compound / 3;
  		compound %= 3; // short for compound = compound % 3;
  		
  		long cLong = 10;
  		int cInt = 4;
  		
  		// cInt = cInt * cLong; // doesn't work because cLong needs (int)
  		cInt *=cLong;
  		
  		int mess = 4;
  		int mess2 = (mess = 2); // this is legal.
  		
  		
  		/*
  		 * Relational Operators
  		 */
  		
  		int relInt = 12;
  		long relLong = 15L;
  		double relDou = 14.5;
  		
  		boolean relBool = relInt < relLong && relDou < relLong; // this works because relInt and relLong gets promoted.
  		
  		
  		/*
  		 * Conditional Operators 
  		 */
  		
  		// && || ^
  		
  		boolean xCondi = true, zCondi = false;
  		int yCondi = 20;
  		
  		xCondi = (yCondi != 10) ^ (zCondi = false); // true, because (zCondi = false) simply reassigns 'false' to zCondi. 
  													// (zCondi = false) isn't relational
  		
  		
  		
  		
  		/*
  		 * Equality operators and equals() method
  		 */
  		
  		boolean xEqual = true;
  		boolean yEqual = false;
  		
//  		System.out.println((yEqual = true) && (xEqual = false)); // false because (xEqual = false) is false. 
//  		System.out.println((yEqual == true) && (xEqual == false)); // true;
	
  		Integer myInteger = 100;
  		Integer anotherInteger = 100;
  		
//  		System.out.println(myInteger == anotherInteger);
//  		System.out.println(myInteger = anotherInteger); // this is just assigning, not comparing
	
  		myInteger = 128;
  		anotherInteger = 128; // when reassigned a value (even the same number with the one compared), it creates another object
  							  // unlike when it is constructed.
  		
//  		System.out.println(myInteger == anotherInteger );
  		
  		anotherInteger = myInteger;
  		
//  		System.out.println(anotherInteger == myInteger);
//  		System.out.println(anotherInteger.equals(myInteger));
	
	
	
	
	
	
	
	
	
	}

}
