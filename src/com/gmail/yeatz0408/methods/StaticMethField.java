package com.gmail.yeatz0408.methods;

public class StaticMethField {
	
	static String string = "This is a static String";
	
	public static void test() {
		System.out.println("This is a static method");
	}
	
	public static void one() {}
	public void two() {}
	public static void three() {
		one();
//		two(); // static methods cannot call non-static methods
	}
	
	public void four() {
		one();
	}

	public static void main(String[] args) {
		
		one();
		StaticMethField.one();
		new StaticMethField().one();
		
		// two();
		// StaticMethField.two();
		new StaticMethField().two();

		StaticMethField.test();
		
		System.out.println(StaticMethField.string);
		
		StaticMethField a = new StaticMethField();
		StaticMethField b = new StaticMethField();
		
		a.string = "changed from a";
		
		System.out.println(b.string);
		System.out.println(StaticMethField.string);
		
	}

}
