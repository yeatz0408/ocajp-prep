package com.gmail.yeatz0408.classDesign;

class City {
	
	String name;
	String country;
	int population;
	
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		this.population = population;
		
		System.out.println("Constructor 1");
	}
	
	public City(String name, String country) {
		this(name, country, 0);
		
		System.out.println("Constructor 2");
	}
	
	public City(String name) {
		this(name, "unknown");
		
		System.out.println("Constructor 3");
	}
	
	public City() {
		this("unknown");
		
		System.out.println("Constructor 4");
	}
	
	public void printCity() {
		System.out.println(name + "  " + country + "  " + population);
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {

		City city = new City();
		city.printCity();
	}

}
