package com.overriding.excercise;

public class AnimalTester {

	public static void main(String[] args) {
		
		//Objects of Animals
		
		Animal ani =  new Animal();
		ani.animalType="Herbivours or carnivours";
		
		
		System.out.println("Animal age: " + ani.age + " Animal type is :" + ani.animalType);
		
		//Method of Animal
		ani.eating();
		ani.running();
		
		
		System.out.println("\n");
		
		Herbivours duck =  new Herbivours();
		
		//Object of Herbivours
		duck.age=25;
		duck.animalType="Aquatic";
		System.out.println("Animal age: " + duck.age + " Animal type is :" + duck.animalType);
		
		
		duck.eating();//overriding of animal class
		duck.softAnimals();
		//duck.running();//method of animal class
		
		
		
		
		System.out.println("\n");
		
		
		//Object of Carnivours
		
		carnivours tiger = new carnivours();
		tiger.age=55;
		tiger.animalType="Land";
		
		System.out.println("Animal age: " + tiger.age + " Animal type is :" + tiger.animalType);
		
		tiger.eating();//overriding of animal class
		tiger.dangerAnimals();
		tiger.softAnimals();//method of herbivours class
		tiger.running();//method of animal class

		
//Imp Note:Parent class is Animal,extends Herbivours,and carnivours extends Herbivours  
		
	}

}
