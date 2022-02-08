package com.gmail.yeatz0408.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		ArrayList<Object> list2 = new ArrayList<Object>();
		List<Object> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>(20); // sets the capacity
		
		list4.add("Dogs");
		list4.add(5);
		list4.add(new Object());
		
		System.out.println(list4);
		
		
	}

}
