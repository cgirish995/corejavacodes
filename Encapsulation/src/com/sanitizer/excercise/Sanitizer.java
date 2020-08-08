package com.sanitizer.excercise;

public class Sanitizer {
	
	private String name;
	private double price;
	private int quantity;
	
	//Set is used for assigning the values 
public	void setQuantity(int inQuantity) {
		quantity=inQuantity;
	}
	
	// we Need to give the return Type and data type when we are using the Getters
	//Get is used to read the values given by Set
	
		int getQuantity() {
		System.out.println(" Sanitizer quantity is " + quantity);
		return quantity;
	}
	
	
	void setPrice(double inPrice) {
		price = inPrice;
	}
	
	double getPrice() {
		System.out.println("  Sanitizer price is :" + price);
		return price;
	}
	
	
private	void setName(String inName) {
		name=inName;
	}
	
	String getName() {
		System.out.println("  Sanitizer Name is " + name);
		return name;
	}
	
	 
	 
	public static void main(String[] args) {
		
	/*	Sanitizer z = new Sanitizer();
		
		z.setName("ggg");
		z.getName();
		*/
	}

}
