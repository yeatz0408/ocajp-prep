package com.gmail.yeatz0408.methods;

import java.util.Arrays;

public class ParamList {
	
	int getOne(int i) {
		return 1;
	}
	
	int getTwo(int i, int k) {
		return 2;
	}
	
	int getMany(int...i) {
		return 0;
	}

	// public void jump (int... numbers, int start) {}
	public static void jump (int start, int... numbers) {}
	public static void jump2(int[] start, int[] numbers) {}
	public static void jump3(int[] start, int ...numbers) {}
	// public static void jump4(int...numbers, int[] start) {}
	
	public static void run(int...numbers) {
		for (int number : numbers) {
			System.out.println("number= " + number);
		}
		
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void main(String[] args) {
		jump(1, null);
		run();
		run(1,2,3,4,5);
	}
	
}
