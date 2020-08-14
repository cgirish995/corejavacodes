package com.on.abstraction;

public  abstract class Lift {
	
	
	abstract void press1();
	abstract void press2();
	
	
	
	void stop() {
		System.out.println("Stops the lift when pressed stop keys");
	}

	void alarm() {
		System.out.println("Listen to Alram");
	}
	public static void main(String[] args) {
		
	}

}
