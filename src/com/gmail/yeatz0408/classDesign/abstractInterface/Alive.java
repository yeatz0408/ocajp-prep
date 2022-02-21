package com.gmail.yeatz0408.classDesign.abstractInterface;

public interface Alive {
	
	// if there is a body, default should be written to notify the compiler that it's a default method
	default void isAlive(boolean isAlive) {
		System.out.println(isAlive);
	}

}
