package com.gmail.yeatz0408.arrays;

public class NestedLoops {

	public static void main(String[] args) {
		
		int[][] myArray = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		
		OUTER:
			for (int[] array : myArray) {
				INNER:
					for (int i = 0; i < array.length; i++) {
						if (array[i] % 2 == 0) {
							// break;
							// break INNER;
							// break OUTER;
							continue INNER;
							// continue OUTER;
						}
						System.out.print(" " + array[i]);
					}
				System.out.println();
			}

	}

}
