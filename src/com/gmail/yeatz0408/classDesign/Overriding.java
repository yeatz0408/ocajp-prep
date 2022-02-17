package com.gmail.yeatz0408.classDesign;

public class Overriding {

	public static void main(String[] args) {

		Human human = new Human();
		Soldier soldier = new Soldier();
		Archer archer = new Archer();
		
		human.work();
		soldier.work();
		archer.work();
		
		System.out.println();
		
		archer.work();
		archer.superWork();
		archer.superSuperWork();
		archer.salute();
		
	}

}

class Human {
	public void work() {
		System.out.println("poop");
	}
	
}

class Soldier extends Human {
	
	@Override
	public void work() {
		System.out.println("fight");
	}
	
	public void superWork() {
		super.work();
	}
	
	public final void salute() {
		System.out.println("Salute!");
	}
}

class Archer extends Soldier {
	
	@Override
	public void work() {
		System.out.println("shoot");
	}
	
	public void superWork() {
		super.work();
	}
	
	public void superSuperWork() {
		super.superWork();
	}
	
//	public final void salute() {
//		System.out.println("Salute!!");
//	}
}
