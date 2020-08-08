package com.xworkz.overriding;

public class smallAnimals extends Animals {
	
	int age=20;
	
	String animalType;
	
	void smallRunning() {
		System.out.println("Small animals run fast");
	}
	
	@Override
	void goodAnimals() {
		System.out.println("Good Animals are cute animals");
	}

	public static void main(String[] args) {
		

	}

}
