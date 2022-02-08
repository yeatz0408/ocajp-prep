package com.gmail.yeatz0408.arrays;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		
		int[] one = new int[3];
		int[] two = new int[] {10, 11, 12};
		
		double[] b = new double[4 * 5 / 2];
		
		int[] three = {10, 11, 12};
		int[] four = {};
		int a3[];
		int[] ids, types;
		
		String[] animals = {"Parrot", "Dog", "cat"};
		String[] myAnimals = animals;
		
		System.out.println(animals.equals(myAnimals));
		System.out.println(animals == myAnimals);
		
		System.out.println(animals);
		System.out.println(animals.toString());
		System.out.println(Arrays.toString(animals));

	}

}
