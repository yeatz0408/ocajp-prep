package com.gmail.yeatz0408.arraylist;

import java.util.ArrayList;
import java.util.List;

public class WrappingPrims {

	public static void main(String[] args) {
		
		// List<double> doubles = new ArrayList<>();
		List<Double> doubles = new ArrayList<>();
		doubles.add(5.5);
		doubles.add(7.2);
		
		double first = doubles.get(0);
		
		System.out.println(doubles);
		System.out.println(first);
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		
		nums.remove(1);
		System.out.println(nums);
		nums.remove(new Integer(1));
		System.out.println(nums);

	}

}
