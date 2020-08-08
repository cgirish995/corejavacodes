package com.xworkz.overriding;

public class VegiTester {

	public static void main(String[] args) {

		Vegetarian vegi = new Vegetarian();
		vegi.cusineType="Indian";
		vegi.quantityingrms=200;
		
		System.out.println("Cusine type" +vegi.cusineType+"Quantity"+vegi.quantityingrms);
		vegi.cooking();
		vegi.vegiemethod();
	}

}
