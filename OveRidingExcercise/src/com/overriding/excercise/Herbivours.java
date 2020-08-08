package com.overriding.excercise;

public class Herbivours extends Animal{
	
	String Type;
	int age;
	
	
	void softAnimals() {
		System.out.println("Herbivours are soft animals ");
	}
	
	@Override
	void eating() {
		System.out.println("Which eats herbs and shrubs ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
