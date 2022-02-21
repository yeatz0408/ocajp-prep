package com.gmail.yeatz0408.classDesign.abstractInterface;

public class Main {

	public static void main(String[] args) {
		
		Deer deer = new Deer();
		
		deer.getSpeed(); // when there are two default methods with the same name, those two interfaces should be sub-super relation
		
		System.out.println(Hop.getAverageJumpHeight());

	}

}
