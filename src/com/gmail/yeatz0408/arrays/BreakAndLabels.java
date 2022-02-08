package com.gmail.yeatz0408.arrays;

public class BreakAndLabels {

	public static void main(String[] args) {
		
		myLabel: {
			int[] myArray = {1,2,3};
		}
		
		// myArray[0] = 0; // myArray only exists in myLabel
		
		String[] animals = {"Dog", "Cat", "Lizard", "Bird"};
		
		myLoop: for (String animal: animals) {
			if (animal.equals("Cat")) {
				break myLoop;
			}
			
			System.out.println(animal);
		}
		
		System.out.println("==============================");
		
		for (String animal : animals) {
			if (animal.equals("Lizard")) {
				break;
			}
			
			System.out.println(animal);
		}

	}

}
