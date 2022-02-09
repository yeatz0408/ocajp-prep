package com.gmail.yeatz0408.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(createArray());
		
		
		// regular for loop
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
		}
		
		long totalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("For loop : " + totalTime + " ms");
		
		
		// for each loop
		
		startTime = System.currentTimeMillis();
		
		for (String temp : list) {}
		
		totalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("for each loop : " + totalTime + " ms");
		
		
		// iterator
		
		startTime = System.currentTimeMillis();
		
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String temp = iterator.next();
		}
		
		totalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("iterator : " + totalTime + " ms");
		
		
		// listIterator
		
		startTime = System.currentTimeMillis();
		
		for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
			String temp = iterator.next();
		}
		
		totalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("list iterator : " + totalTime + " ms");
		
	}
	
	public static String[] createArray() {
		
		String[] toReturn = new String[70_000_000];
		
		for (int i = 0; i < toReturn.length; i++) {
			toReturn[i] = "Array " + i;
		}
		
		return toReturn;
	}

}
