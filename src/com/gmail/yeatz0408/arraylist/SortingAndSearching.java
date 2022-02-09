package com.gmail.yeatz0408.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAndSearching {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("nop");
		list.add("ghi");
		list.add("def");
		
		Collections.sort(list);
		System.out.println(list);
		
		List<Integer> nums = Arrays.asList(7, 4, 98, 23, 1);
		System.out.println(nums);
		
		System.out.println(Collections.binarySearch(nums, 1));
		
		Collections.sort(nums);
		System.out.println(nums);
		
		System.out.println(Collections.binarySearch(nums, 1));
		

	}

}
