package com.gmail.yeatz0408.classDesign;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation {

	public static void main(String[] args) {

		Company c = new Company("Google");
		// c.name = "Apple";
		// c.employees.add("Noah");
		
		c.add("Noah");
		
		System.out.println(c.get(0));
		
	}
}	
	
// an example of POJO (Plain Old Java Object)
class Company {

	// these fields are accessible through custom methods
	private String name;
	private List<String> employees;

	public Company(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(String name) {

		if (name == null || name.isEmpty()) {
			return;
		}

		employees.add(name);
	}

	public String get(int i) {
		return employees.get(i);
	}

	public void remove(String name) {
		employees.remove(name);
	}

}
