package com.gmail.yeatz0408.classDesign.abstractExamples;

public class Dog extends Animal{

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

}
