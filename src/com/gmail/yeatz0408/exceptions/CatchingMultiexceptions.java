package com.gmail.yeatz0408.exceptions;

class MyException extends RuntimeException {};

class MySuperException extends MyException {};

public class CatchingMultiexceptions {

	public static void main(String[] args) {

		try {
		
			mySuperMethod();
			myMethod();
			
		} catch (MySuperException e) {
			System.out.println("First catch executed");
		} catch (MyException e) {
			System.out.println("Second catch executed");
		} catch (Exception e) {
			System.out.println("Third catch executed");
		} finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println();
		System.out.println(calculate());
		
	}
	
	public static void myMethod() {
		throw new MyException();
	}
	
	public static void mySuperMethod() {
		throw new MySuperException();
	}
	
	public static String calculate() {
		String result = "";
		String str = null;
		
		try {
			try {
				result += "start";
				str.length();
				result += "end";
			} catch (NullPointerException e) {
				result += "npe";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
			
		} catch (Exception e) {
			result += "finished";
			e.printStackTrace();
		}
		
		return result;
	}

}
