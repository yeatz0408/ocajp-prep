package com.gmail.yeatz0408.arrays;

public class ContinueStatement {

	public static void main(String[] args) {
		
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Monkey"};
		
		myLoop:
			for (String animal : animals) {
				if (animal.equals("Lizard")) {
					continue myLoop;
				}
				System.out.println(animal);
			}
		
		myLoop2:
			for (String animal : animals) {
				if (animal.equals("Lizard") || animal.equals("Bird")) {
					continue;
				}
				System.out.println(animal);
			}

	}

}
