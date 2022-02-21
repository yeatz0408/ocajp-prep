package com.gmail.yeatz0408.classDesign.abstractInterface;

public class Snake extends Animal implements HasTail, Carnivore {

	@Override
	public void eat() {
		System.out.println("I like mice!");
	}

	@Override
	void run() {
		System.out.println("We actually slide");
	}

	@Override
	void cry() {
		System.out.println("Hiss Hiss!");
	}

	@Override
	public int getTailLength() {
		return 10;
	}

	@Override
	public int getTailLength2() {
		return 10;
	}

	@Override
	public void attack() {
		System.out.println("We strangle and bite!");
	}
	
	

}
