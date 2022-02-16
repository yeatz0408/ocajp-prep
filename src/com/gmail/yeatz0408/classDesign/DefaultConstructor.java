package com.gmail.yeatz0408.classDesign;

class Cat {
	Cat() {		
	}
}

class Bird {
	
}

class Monkey {
	private Monkey() {}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Bird bird = new Bird();
//		Monkey monkey = new Monkey(); // private constructor doesn't let it get instantiated
		

	}

}
