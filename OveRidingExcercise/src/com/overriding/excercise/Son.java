package com.overriding.excercise;

public class Son extends Person {
	
	String name;
	int age;
	
	
	void education() {
		System.out.println("He is an Phd holder");
	}
	
	void hobbies() {
		System.out.println("He loves to play cricket");
	}

	@Override
	void occupation() {
		System.out.println("He is a Business man");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
