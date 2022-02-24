package com.gmail.yeatz0408.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {
	
	public static boolean method1(String string, Predicate<String> p) {
		return p.test(string);
	}
	
	public static boolean myEquals(String string, Predicate<String> p) {
		return p.test(string);
	}
	

	public static void main(String[] args) {
		
		String john = "John";
		
		System.out.println(method1("John", p -> p.equals("Noah")));
		
		List<String> list = new ArrayList<>();
		
		String[] array = {"Noah", "John", "Victor", "Jessie", "Shota", "Toshi"};
		
		list.addAll(Arrays.asList(array));
		
		list.removeIf(p -> p.equals("Jessie"));
		list.removeIf(s -> s.charAt(0) == 'S');
		
		System.out.println(list);
		System.out.println(myEquals("Noah", p -> p.equals("Noah")));
		
	}

}
