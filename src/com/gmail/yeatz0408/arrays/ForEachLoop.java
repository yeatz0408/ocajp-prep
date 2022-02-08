package com.gmail.yeatz0408.arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5};
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		for (int number : numbers) {
			number = 0; // you can't assign value with a for each loop
		}
		
		System.out.println("===============================");
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		
		System.out.println("===============================");
		
		StringBuilder[] builders = {
				new StringBuilder("For"), new StringBuilder("Loop")
		};
		
		for (StringBuilder builder : builders) {
			builder.append("123");
		}
		
		for (StringBuilder builder : builders) {
			System.out.println(builder);
		}

		
		System.out.println("===============================");
		
		String pets = "Parrot";
		
		for (char c : pets.toCharArray()) {
			System.out.println(c);
		}
		

	}

}
