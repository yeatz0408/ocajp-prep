package com.gmail.yeatz0408.classDesign.abstractInterface;

public interface HasTail {
	
	public boolean HASTAIL = true;
	public final boolean HASTAIL2 = true; // redundant because fields in interfaces are always constants
	
	int getTailLength();
	abstract int getTailLength2(); // redundant because all methods defined in interfaces are abstract
	
//	void wag() {
//		
//	} methods defined in interfaces cannot have a body

}
