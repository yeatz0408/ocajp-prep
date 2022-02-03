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
  		



	}

}
