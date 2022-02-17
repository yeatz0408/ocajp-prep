package com.gmail.yeatz0408.classDesign;


public class InitOrder {
	
//	The order is
//			1. static initializer
//			2. regular initializer (after all static intializer are executed)
//			3. constructor

	public static void main(String[] args) {
		new InitExample();
		System.out.println();
		new Demo();
	}

}

class InitExample {
	
	{
		System.out.println("Regular initializer at top");
	}
	
	static {
		System.out.println("Static initializer below top regular initializer");
	}
	
	{
		System.out.println("Regular initializer below the first static");
	}
	
	static {
		System.out.println("Static initializer at bottom");
	}
	
	
	InitExample () {
		System.out.println("Constructor");
	}
}

class Demo {

	{
		System.out.println("first regular");
	}
	
	{
		System.out.println("second regular");
	}
	
	{
		System.out.println("third regular");
	}
	
	static {
		System.out.println("first static, new instantiation");
		new Demo();
	}
	
	static {
		System.out.println("second static");
	}
	
	static {
		System.out.println("third static");
	}

	public Demo() {
		System.out.println("Constructor");
	}

}

