package com.gmail.yeatz0408.arrays;

import java.util.Arrays;

public class SortAndSearch {

	public static void main(String[] args) {
		
		int[] numbers = {1,3,4,5,2,7,8,6,0,9};
		
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		String[] animals = {"Dog", "Cat", "Mouse", "Giraffe", "Gorilla"};
		
		System.out.println("The index of Mouse is: " + Arrays.binarySearch(animals, "Mouse"));

	}

}
