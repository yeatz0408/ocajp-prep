package com.gmail.yeatz0408.javaBasics;

public class DecimalNumericPrimitives {
	
	public static void main(String[] args) {
		
		float myNumber = 25.4F;
		
//		========these don't compile.============
//		double before = 10_.25;
//		double after = 10._25;
//		double first = _10.25;
//		double last 10.25_;
		
		double myDouble = 2.54;
		double myDouble2 = 2.54F;
		double anotherDouble = 2.45D;
		double scientific = 5.000125E03; // E3 is to move the dot
		double scientific2 = 5.000125E3; // E03 is to move the dot
		double myDouble3 = 5000.125; // the same as scientific one line above
		
		System.out.println(scientific);
		System.out.println(scientific2);
		System.out.println(myDouble3);
		
		double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal
		
	}

}
