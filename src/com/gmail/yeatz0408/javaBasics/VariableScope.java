package com.gmail.yeatz0408.javaBasics;

public class VariableScope {
	
	static int myNewInt = 5;

	public static void main(String[] args) {

		int myLocalInt = 10;
		
		{
			int myOtherInt = 20;
			System.out.println(myOtherInt);
			System.out.println(myLocalInt);
		}
		
//		System.out.println(myOtherInt);
		
		int myOtherInt = 30;
		
		System.out.println(myOtherInt);
		
	}

}
