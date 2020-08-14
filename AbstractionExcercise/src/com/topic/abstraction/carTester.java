package com.topic.abstraction;

public class carTester {

	public static void main(String[] args) {
		
		
		car test= new BMW();//UpCasting
		
		test.applyAccelator();
		test.applyBreak();
		test.applySteeringToLeft();
		test.applySteeringToRight();
		
		System.out.println("\n");
		
		car test1 = new Audi();//UpCasting 
		
		test1.applyAccelator();
		test1.applyBreak();
		test1.applySteeringToLeft();
		test1.applySteeringToRight();
	}

}
