package com.xworkz.overriding;

public class Vegetarian  extends Food{
	
	String cusineType;
	
	void vegiemethod() {
		System.out.println("Vegimethod from Vegiterean");
	}
	
	
	@Override
	void cooking() {
		System.out.println("Cooking only vegetarean food ");
	}

	public static void main(String[] args) {
		
		
	}

}
