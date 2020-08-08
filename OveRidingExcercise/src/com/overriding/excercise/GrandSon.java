package com.overriding.excercise;

public class GrandSon extends Son {
	
	
	String name;
	int age;
	
	
	void education() {
		System.out.println("He is  an Artist");
	}

	void hobbies() {
		System.out.println("He loves to play football");
	}
	
	@Override
	void occupation() {
		System.out.println("He is a Director");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
