package com.on.abstraction;

public class LiftTester {

	public static void main(String[] args) {
		
		
		//Lift sss = new Lift();//Here we get as error because of 
		
		
		Schinder open = new Schinder();
		open.alarm();
		open.press1();
		open.press2();
		
	Lift lift	= new Schinder(); //Upcasting
	lift.stop();
	lift.alarm();

	}

}
