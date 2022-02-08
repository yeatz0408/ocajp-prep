package com.gmail.yeatz0408.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversion {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Noah");
		names.add("Tony");
		names.add("Claire");
		
		Object[] objArray = names.toArray();
		System.out.println(objArray);
		
		String[] strArray = names.toArray(new String[0]);
		
		String[] anotherStringArray = names.toArray(new String[names.size()]);
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("strArray " + i + ": " + strArray[i]);
			System.out.println("another  " + i + ": " + anotherStringArray[i]);
		}
		
		List<String> pets = Arrays.asList("dog", "cat", "parrot");
		// pets.add("elephant") // add(), remove() not supported for lists made from arrays 
		
		
		String[] fruits = {"apple", "banana", "cherry"};
		List<String> fruitList = Arrays.asList(fruits);
		
		fruits[1] = "orange";
		
		System.out.println(fruitList);
		System.out.println(fruitList.get(1));
		
		// fruitList.add("kiwi"); // add() not supported for lists made from arrays
		// fruitList.remove(1); // remove(0) not supported either

	}

}
