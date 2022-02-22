package com.gmail.yeatz0408.exceptions;

public class UnderstandingExceptions {

	public static void main(String[] args) {
		
//		int[] myArray = new int[2];
//		System.out.println(myArray[5]);
		
		try {
			System.out.println(divide(10, 1));
			System.out.println(divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught");
			e.printStackTrace();
		} finally {
			System.out.println("This is finally block executed");
		}

	}
	
	public static int divide(int a, int b) {
		return a / b;
	}
	
	public static void myMethod() throws RuntimeException {
		throw new RuntimeException("Failed to load");
	}
	
	public static void myMethod2() throws Exception {
		throw new RuntimeException();
	}
	
	public static void myMethod3() throws Exception {
		throw new Exception();
	}

}
