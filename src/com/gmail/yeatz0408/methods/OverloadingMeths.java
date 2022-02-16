package com.gmail.yeatz0408.methods;

public class OverloadingMeths {
	
	public void walk(int... miles) {
		System.out.println("This is varaggs");
	} // can be ambiguous
	
	public void walk(int miles) {
		System.out.println("This is int");
	}
	
	public static void walk(short feet) {
		System.out.println("This is short");
	}
	
	public boolean walk() {
		return false;
	}
	
	boolean walk(String a) {
		return false;
	}

	public static void main(String[] args) {
		OverloadingMeths a = new OverloadingMeths();
		a.walk(5);
		
	}

}
