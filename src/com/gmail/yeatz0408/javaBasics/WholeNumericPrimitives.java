package com.gmail.yeatz0408.javaBasics;

public class WholeNumericPrimitives {

	public static void main(String[] args) {
		
		// _ cannot used in the beginning or at the end. It can never come 
		// right before or after the decimal point. 
		
		long max = 32_123_456_789L;
		long n = 2_300;
		
		// octal (--7)
		int oct = 07;
		int firstOct = 010;
		int secondOct = 022;
		// int oct2 = 08;
		
		int sumOct = firstOct + secondOct;
		System.out.println("first= " + firstOct + " second= " + secondOct);
		System.out.println("decimal sum= " + sumOct + " octSum= " + Integer.toOctalString(sumOct));
		
		// hexadecimal (0-9 and A-F)
		int firstHex = 0xF; // 15 decimal
		int secondHex = 0x1E; // 30 decimal
		int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
		System.out.println("first= " + firstHex + " second= " + secondHex);
		System.out.println("decimalSum= " + sumHex + " hexSum= " + Integer.toHexString(sumHex));
		
		// binary
		int firstBin = 0b1001; // 9 decimal
		int secondBin = 0b0111; // 7 decimal
		int sumBin = firstBin + secondBin;
		
		// int thirdBin = 0b2;
		System.out.println("first= " + firstBin + " second= " + secondBin);
		System.out.println("decimalSum= " + sumBin + " binSum= " + Integer.toBinaryString(sumBin));

	}

}
