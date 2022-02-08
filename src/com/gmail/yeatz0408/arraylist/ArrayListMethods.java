package com.gmail.yeatz0408.arraylist;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> pets = new ArrayList<>();
		pets.add(0, "Dogs");
		pets.add(1, "Cats");
		pets.add(1, "Parrots");
		pets.add("lizard");
		pets.add("hamsters");
		
		System.out.println(pets);
		
		pets.remove("hamsters");
		pets.remove(1);
		
		System.out.println(pets);
		System.out.println(pets.get(1));
		System.out.println(pets.get(2));
		
		pets.set(0, "Fish");
		System.out.println(pets);
		
		// pets.set(4, "Elephants"); // the size is only 3 now.
		
		System.out.println(pets.isEmpty());
		System.out.println(pets.size());
		
		pets.clear();
		System.out.println(pets.isEmpty());
		
		pets.add("Dogs");
		System.out.println(pets.contains("Dogs"));
		
		ArrayList<String> newPets = new ArrayList<>();
		newPets.add("Dogs");
		System.out.println(pets.equals(newPets)); //******** watch this sh*t *******
		
		pets.add("Cats");
		newPets.add(0, "Cats");
		
		System.out.println(pets + " " + newPets);
		System.out.println(pets.equals(newPets));

	}

}
