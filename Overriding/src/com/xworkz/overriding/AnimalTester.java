package com.xworkz.overriding;

public class AnimalTester {
	
	

	

	

	public static void main(String[] args) {
		smallAnimals cheetha = new smallAnimals();

		cheetha.age=23;
		cheetha.animaltype="Cow";
		
		
		System.out.println("Animal age :" + cheetha.age + "Animal type :"+ cheetha.animaltype);
		
		cheetha.goodAnimals();
		
		
	}

}
