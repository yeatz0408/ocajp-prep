package com.gmail.yeatz0408.exceptions;

public class ReturnInFinally {

	public static void main(String[] args) {

		System.out.println(calculate());
		
	}
	
	public static int calculate() {
		try {
			return 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("inside catch");
//			System.exit(0);
			return 1;
		} finally {
			System.out.println("inside finally");
			return 0;
		}
	}

}
