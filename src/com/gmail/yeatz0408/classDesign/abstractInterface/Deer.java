package com.gmail.yeatz0408.classDesign.abstractInterface;

public class Deer extends Animal implements HasTail, Herbivore, Walk, Run {

	@Override
	public void sense() {
		System.out.println("We have good ears!");
	}

	@Override
	public int getTailLength() {
		return 2;
	}

	@Override
	public int getTailLength2() {
		return 2;
	}

	@Override
	public void eat() {
		System.out.println("We eat plants!");
	}

	@Override
	void run() {
		System.out.println("We are very fast!");
	}

	@Override
	void cry() {
		System.out.println("ajdfioajopxcofspjoiwjklfds");
	}

}
