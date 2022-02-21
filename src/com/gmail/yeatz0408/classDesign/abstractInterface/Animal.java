package com.gmail.yeatz0408.classDesign.abstractInterface;

public abstract class Animal implements Alive {
	
	boolean isAlive;

	public abstract void eat();
	
	abstract void run();
	
	abstract void cry();
	
	public void breathe() {
		System.out.println("ÇÏ¾ÇÇÏ¾Ç");
	}
	
	public void isAlive() {
		System.out.println(isAlive);
	}
	
	
	
//	public final abstract void cry();
	
//	public static abstract void cry();
	
}
