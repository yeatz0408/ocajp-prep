package com.gmail.yeatz0408.basicControlFlow;

import java.util.Random;

public class SwitchStatement {

	public static void main(String[] args) {

		int day = 1;

		switch (day) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
//			break;
		case 2:
			System.out.println("Wednesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("weekend");
		}

		Random rand = new Random();
		int c = rand.nextInt(26) + 'a';
		System.out.println((char) c + ", " + c + ":");

		switch (c) {
			case 'a':
			case 'e':
			case 'o':
			case 'u':
			case 'i':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("sometimes a vowel");
			default:
				System.out.println("consonant");
		}
	}

}
