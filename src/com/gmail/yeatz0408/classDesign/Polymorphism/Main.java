package com.gmail.yeatz0408.classDesign.Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal mike = new Wolf();
		Carnivore john = new Wolf();
		
		mike.eat();
		john.attack();
		
//		mike.attack();
//		john.eat();
		
		Wolf victor = (Wolf) mike; // have to recast since it was initialized as Animal, but you can use all the methods defined in Wolf
		
		victor.getPack();
		

	}

}
