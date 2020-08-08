package com.workz.corejava.privateaccessmodifiers;

public class DogTesters {
	
	private String breed;//Private Variables 
	int age;////Instance Variables or Default Variables
	
	protected String color;
	public boolean isMale;
	
	void barking(){
		System.out.println("Dog is barking ");
	}
	void eating(){
		System.out.println("Dog is eating ");
	}

	public static void main(String[] args) {
		
		
		DogTesters james=new DogTesters();
		james.breed="German Shephard";
		james.age=10;
		
		System.out.println(" breed :"+james.breed+" age:"+james.age);
		
		//We are Accessing the breed and age into DogWaiters from DogTesters

		

	}

}
