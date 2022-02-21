package com.gmail.yeatz0408.classDesign.abstractInterface;

public class Dog extends Animal implements HasTail, Carnivore, Herbivore, Walk, Run{

	public static void main(String[] args) {

	}

	@Override
	public void eat() {
		System.out.println("I like nuggies!");
	}

	@Override
	void run() {
		System.out.println("I run quite fast!");
	}
	
	@Override
	public void breathe() {
		System.out.println("pant pant");
	}

	@Override
	void cry() {
		this.breathe();
		super.breathe();
		System.out.println("Bark Bark!");
	}

	@Override // defined in interface
	public int getTailLength() {
		return 50;
	}

	@Override // redundant method defined in interface 
	public int getTailLength2() {
		return 50;
	}
	
	public void printHasTail() {
		System.out.println(HASTAIL);
	}

	@Override
	public void sense() {
		System.out.println("We have good ears and a nose!");
	}

	@Override
	public void attack() {
		System.out.println("Our bites are fearesome!");
	}

}
