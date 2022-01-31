package com.gmail.yeatz0408.javaBasics;

public class MainMethod {
	
	public static void main(String[] args) {
		
		VariableAndMethod person = new VariableAndMethod();
		person.setFirstName("Noah");
		person.setLastName("Jung");
		person.setAge(30);
		
		System.out.println("The person is " + person.getFirstName() + " " + person.getLastName() + ".");
		
		System.out.println("The arguments are ...\n");
		
		for (int i = 0; i < args.length; i++)
		System.out.print(args[i] + " ");
	}

}
