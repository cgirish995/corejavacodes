package com.topic.abstraction;

public class BMW extends car{
	
	@Override
	void applyAccelator() {
		System.out.println("BMW using Accelator moves very fast ");
	}
	
	@Override
	void applyBreak() {
		System.out.println("BMW applies Breaks");

	}
	
	@Override
  	 void applySteeringToRight() {
		System.out.println("BMW is moving to Right");

	}
	
	@Override
	void applySteeringToLeft() {
		System.out.println("BMW is moving to Left");
	}
	

}
