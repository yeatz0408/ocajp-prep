package com.gmail.yeatz0408.basicControlFlow;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i += 1) {
			System.out.print(i + "  ");
		}
		
		System.out.println();
		
		int a;
		for (a = 0; a < 10; a++) {
			System.out.print(a + "  ");
		}

		System.out.println("\na = " + a);
		
//		for (;;) System.out.println("This never ends");
		
		for (int y = 0, z = 4; y < 5 && z < 10; y++, z++) {

			System.out.println("Big conditions are ok too");
		
		}
		
		int d = 10;
		
//		for (int e = 0, d = 0; e < 10 || d < 10; e++, d--) {}; this doesn't compile because you are redeclaring d.
		
//		for (long z = 0, int d = 4; z < 10; z++, d++) {} // The conditionals should be the same type. 
		
		long p = 3;
		
		for (int v = 3; p < 5 && v < 5; p++) {}
		
	}

}
