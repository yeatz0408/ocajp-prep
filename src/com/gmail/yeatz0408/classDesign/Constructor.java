package com.gmail.yeatz0408.classDesign;

class Dog {
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		Dog milk = new Dog("milk");
		
		milk.printName();

	}

}
