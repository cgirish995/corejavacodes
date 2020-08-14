package com.xworkz.interfaceConcept;

public interface InternetProvider {
	
  int a =10; //Should have final but not need to declare the final keyword complier by default add it and by default it is static and final
	
	void transmittingSpeed();
	void connectivityType();
	
	
	//Method body is not allowed in Interface
	/*
	void speed() {
		System.out.println();
	}*/

	public static void main(String[] args) {
		

		
		
	}

}
