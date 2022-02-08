package com.gmail.yeatz0408.arrays;

import java.util.Arrays;

public class UsingArrays {

	public static void main(String[] args) {
		
		String[] pets = {"parrot", "cat", "dog"};
		
		System.out.println(pets[0]);
		System.out.println(pets[1]);
		
		pets[0] = "bird";
		
		int[] numbers = new int[5];
		Integer[] numbers2 = new Integer[5];
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));

	}

}
