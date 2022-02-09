package com.gmail.yeatz0408.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList1 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(10);
		nums.add(13);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println("element at index " + i + " is " + nums.get(i));
//			nums.remove(4); // IndexOutOfBoundsException
		}
		
		for (int i : nums) {
			System.out.println("number is " + i);
//			nums.remove(0); // ConcurrentModificationException
		}
		
		System.out.println(nums);
		
		for (Iterator<Integer> iterator = nums.iterator(); iterator.hasNext(); ) {
			Integer number = iterator.next();
			System.out.println(number);
			iterator.remove();
		}
		
		System.out.println(nums);
		
		nums.addAll(Arrays.asList(3, 5, 6, 7, 2, 9, 23, 42, 52, 34));
		
		System.out.println(nums);
		
		for (ListIterator<Integer> listIterator = nums.listIterator(5); listIterator.hasPrevious(); ) {
			System.out.println(listIterator.previous());
			listIterator.remove();			
		}
		System.out.println(nums);
		
//		for (ListIterator<Integer> listIterator = nums.listIterator(0); listIterator.hasNext(); ) {
//			System.out.println(listIterator.next());
//			listIterator.remove();			
//		}
//		System.out.println(nums);

	}

}
