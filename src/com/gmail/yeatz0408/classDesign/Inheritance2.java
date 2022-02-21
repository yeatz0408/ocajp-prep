package com.gmail.yeatz0408.classDesign;

public class Inheritance2 {

	public static void main(String[] args) {
		Chair chair = new Chair("Noah", 4000);
		
		chair.print();
		System.out.println(chair.getSecret());
		System.out.println(chair.getSuperSecret());
		
		Chair chair2 = new Chair();
		
		chair2.print();
	}
}

class Furniture {

	private String owner;
	private int price;
	private String secret = "I threw up on it.";

	Furniture(String owner, int price) {
		this.owner = owner;
		this.price = price;
	}

	Furniture() {
		this.owner = "unknown";
		this.price = 0;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public void print() {
		System.out.println("owner: " + owner + "   price: " + price);
	}
}

class Chair extends Furniture {

	String secret = "I picked it up from the street.";

	Chair(String owner, int price) {
		super(owner, price);
	}
	
	Chair() {
		
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	public String getSuperSecret() {
		return super.getSecret();
	}
	
}
