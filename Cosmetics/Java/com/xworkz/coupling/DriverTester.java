package com.xworkz.coupling;

public class DriverTester {

	public static void main(String[] args) {
		
		Vehicle truckVehicle = new ScootyVehicle();
		

		Driver driver = new Driver("girish",truckVehicle);
		driver.drive();
		
		
		
	}

}
