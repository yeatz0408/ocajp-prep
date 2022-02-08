package com.gmail.yeatz0408.arrays;

import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		int[][] int2d = new int[2][4];
		int2d[0][3] = 1023;
		
		String[][] string2d = new String[][] {
			{"One", "Two"},
			{"Three", "Four", "Five"},
			{"Six", "Seven"}
		};
		
		for (String[] string1d : string2d) {
			for (String string : string1d) {
				System.out.println(string);
			}
		}
		
		System.out.println("=================================");
		
		for (int i = 0; i < string2d.length; i++) {
			for (int k = 0; k < string2d[i].length; k++) {
				System.out.println(string2d[i][k]);
			}
		}
		
		int[][][] threeD = new int[3][3][3];
		
		int count = 1;
		
		for (int a = 0; a < threeD.length; a++) {
			for (int b = 0; b < threeD[a].length; b++) {
				for (int c = 0; c < threeD[a][b].length; c++) {
					threeD[a][b][c] = count;
					count++;
				}
			}
		}
		
		System.out.println("==================================" + count);
		System.out.println();
		
		for (int[][] twoD : threeD) {
			for(int[] oneD : twoD) {
				for(int integer : oneD) {
					System.out.print(" " + integer);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		int[][][] threeArray = {
				{{1,  2,  3},  {4,  5,  6},  {7,  8,  9}},
				{{10, 11, 13}, {14, 15, 16}, {17, 18, 19}},
				{{20, 21, 22}, {23, 24, 25}, {26, 27, 28}}	
		};
		
		System.out.println(Arrays.toString(threeArray[2][2]));

	}

}
