package com.gmail.yeatz0408.lambda;

import java.util.ArrayList;
import java.util.List;

class Animal {
	boolean canJump;
	boolean canSwim;
	String name;
	
	Animal(String name, boolean canJump, boolean canSwim) {
		this.canJump = canJump;
		this.canSwim = canSwim;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

interface CheckAnimal {
	boolean check(Animal animal);
}

class CheckCanJump implements CheckAnimal {
	public boolean check (Animal animal) {
		return animal.canJump;
	}
}



public class LambdasBasics {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Animal("dog", true, true));
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("cat", true, false));
		
		print(animals, new CheckCanJump());
		System.out.println();
		print(animals, animal -> animal.canSwim);
		
		print(animals, (Animal animal) -> {
			return true;
		});
		
	}
	
	public static void print(List<Animal> animals, CheckAnimal filter) {
		for (Animal animal : animals) {
			if (filter.check(animal)) {
				System.out.println(animal);
			}
		}
	}
	
	

}
