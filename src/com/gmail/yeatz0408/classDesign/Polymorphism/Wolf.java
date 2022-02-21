package com.gmail.yeatz0408.classDesign.Polymorphism;

public class Wolf extends Animal implements Carnivore {

	@Override
	public void attack() {
		System.out.println("We use claws and fangs");
	}

	@Override
	public void eat() {
		System.out.println("We like meat");
	}

	@Override
	public void move() {
		System.out.println("We are quite fast!");
	}
	
	public void getPack() {
		System.out.println("We are the Greedy Bastards!");
	}

}
