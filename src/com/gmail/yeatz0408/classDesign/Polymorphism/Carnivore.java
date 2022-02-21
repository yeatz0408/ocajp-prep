package com.gmail.yeatz0408.classDesign.Polymorphism;

public interface Carnivore {
	
	void attack();
	
	default boolean likeMeat() {
		return true;
	}

}
