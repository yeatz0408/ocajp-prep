package com.gmail.yeatz0408.basicControlFlow;

public class WhileLoop {

	public static void main(String[] args) {

		int x = 0;
		
		while (x < 5) {
			System.out.println(x++);
		}

		// unreachable code, does not compile
//		while(false) {
//			int y = 0;
//		}
		
	}

}
