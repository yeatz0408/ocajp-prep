package com.gmail.yeatz0408.basicControlFlow;

public class IfElse {

	public static void main(String[] args) {
		
		if (5 > 2) System.out.println("true");
		else System.out.println("false");
		
		int testScore = 90;
		char grade; 
		
		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("The test score is " + testScore);

	}

}
