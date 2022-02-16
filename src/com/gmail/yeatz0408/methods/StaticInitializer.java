package com.gmail.yeatz0408.methods;

public class StaticInitializer {
	
	private static final int ONE;
	private static final int TWO = 3;
	private static final int THREE;
	private static final int FOUR;

	static {
		int rows = 5;
		int columns = 4;
		ONE = rows * columns;
//		TWO = rows * columns; // can't be modified because it's initialized already
		THREE = 3;
	}
	
	static {
		FOUR = 4;
	}

}
