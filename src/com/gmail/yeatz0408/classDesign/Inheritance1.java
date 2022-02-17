package com.gmail.yeatz0408.classDesign;

// Superclass constructor should be executed in all cases
public class Inheritance1 {

	public static void main(String[] args) {
		Husky husky = new Husky();
		System.out.println();
		Husky husky2 = new Husky("Noah");
		System.out.println();
		Salmon salmon = new Salmon();
	}

}

class Animal {
	public Animal() {
		System.out.println("Animal constructor");
	}
}

class Dogs extends Animal {
	public Dogs() {
		System.out.println("Dogs constructor");
	}
}

class Husky extends Dogs {
	public Husky() {
		System.out.println("Husky constructor");
	}
	
	public Husky(String name) {
		System.out.println("this is husky, " + name);
	}
}


class Fish extends Animal {
//	public Fish(boolean a) {
//		System.out.println("Fish constructor with boolean");
//	}
}

class Salmon extends Fish {
	public Salmon() {
//		super(true);
		System.out.println("Salmon constructor");
	}
}


