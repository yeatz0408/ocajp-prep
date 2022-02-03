package com.gmail.yeatz0408.basicControlFlow;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int x = 5;
		int y;
		
		y = x > 5 ? 3 : 7;
		y = (x > 5) ? (3 * x) : (7 * x);
		
		int a = 1;
		int b = 1;
		int c = a < 10 ? a++ : b++; //b++ doesn't get executed.
		
		
		
		int d = 1;
		int e = 2;
		int f = 3;
		
		if (d < 10) f = d++ < 1 ? e++ : f++; // this line will be executed. Yet, f stays 3 because it is before ++ of f executes. 
		else f = (d + e) < 2 ? d++ : e++; 
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}


