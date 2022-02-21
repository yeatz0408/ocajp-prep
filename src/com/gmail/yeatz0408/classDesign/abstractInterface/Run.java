package com.gmail.yeatz0408.classDesign.abstractInterface;

public interface Run extends Walk {
	
	public default void getSpeed() {
		System.out.println("10");
	}

}
