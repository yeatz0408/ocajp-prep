package com.gmail.yeatz0408.classDesign;

class Dog2 {
	
	String name;
	String breed;
	
	public Dog2() {
		name = "Max";
		breed = "Mix";
	}
	
	public Dog2(String name) {
		this.name = name;
		breed = "Mix";
	}
	
	public Dog2(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public Dog2(int i) {
//		System.out.println("fskldfjds");
		// when this constructor is called, it should be on the first line.
		this();
	}
	
	public Dog2(boolean b) {
		this("Boolean", "Shepherd");
	}
	
	public void printDog() {
//		this()  // this() cannot be used in methods but only in constructors
		System.out.println(name + " " + breed);
	}
}

public class OverloadingConstructor {

	public static void main(String[] args) {
		
		Dog2 dog1 = new Dog2();
		Dog2 dog2 = new Dog2("Milk");
		Dog2 dog3 = new Dog2(3);
		Dog2 dog4 = new Dog2(true);
		
		dog1.printDog();
		dog2.printDog();
		dog3.printDog();
		dog4.printDog();
		

	}

}
