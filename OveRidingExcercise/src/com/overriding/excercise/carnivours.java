package com.overriding.excercise;

public class carnivours extends Herbivours{

	
	String type;
	int age;
	
	
	
	void dangerAnimals() {
		System.out.println("carnivours are Danger animals");
	}
	
	@Override
	void eating() {
		System.out.println("Which eats animal flesh");
	}
	
	
	public static void main(String[] args) {
		

	}

}
