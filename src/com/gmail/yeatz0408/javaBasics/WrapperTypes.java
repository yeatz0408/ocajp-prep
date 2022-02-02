package com.gmail.yeatz0408.javaBasics;

public class WrapperTypes {

	public static void main(String[] args) {
		
		// boxing = converting a primitive to a wrapper
		int myInt = 10;
		Integer myInteger = myInt;
		// Integer myInteger = new Integer(myInt); deprecated
		Integer myInteger2 = 20;
		Integer myInteger3 = Integer.valueOf(10);
		Integer myInteger4 = Integer.parseInt("3");
		Integer myInteger5 = null;
		// int myInt2 = null;
		
		
		
		// unboxing = converting a wrapper to a primitive
		
		Integer boxed = 10;
		int unboxed = boxed;
		
		// int nullInt = myInteger5; // this invokes NullPointerException
									 // primitives can't contain null
		
		// Wrappers and primitives can be used interchangeably in most situations
		
		wrapperSum(myInteger2, unboxed);
		primSum(myInteger2, unboxed);
		
	}
	
	private static void wrapperSum(Integer integer1, Integer integer2) {
		System.out.println(integer1 + integer2);
	}
	
	private static void primSum(int i1, int i2) {
		System.out.println(i1 + i2);
	}

}
