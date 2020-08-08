package com.xworkz.overriding;

public class bigAnimals extends smallAnimals{
	
	int age=55;
	
	String animalType;;
	
	void bigRunning() {
		System.out.println("Big Animals cannot run fast");
	}
	
	@Override
	void goodAnimals() {
		System.out.println("Good animals are very lovable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
