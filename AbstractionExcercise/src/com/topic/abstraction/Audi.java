package com.topic.abstraction;

public class Audi extends car {

	
	@Override
	void applyAccelator() {
		System.out.println(" Audi moves very fast compare to BMW");
	}
	
	@Override
	void applyBreak() {
		System.out.println("Breaking system is very good in Audi compared to BMW");
	}
	
	@Override
	void applySteeringToRight() {
		System.out.println("Moving Right using Right Indicator");
	}
	
	@Override
	void applySteeringToLeft() {
		System.out.println("Moving Left using Left Indicator ");
	}
	
}
