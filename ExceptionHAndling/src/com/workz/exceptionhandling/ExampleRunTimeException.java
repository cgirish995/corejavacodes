package com.workz.exceptionhandling;

public class ExampleRunTimeException {

	public static void main(String[] args) {
		System.out.println("Beginning of program");
		
		arrayManipulation();
	 
	 System.out.println("End of program");
		

	}
	
	static void arrayManipulation(){

	try {
		
		int[] intArray = {1,2,3,4};
		System.out.println("The element is: " + intArray[5]);
		}catch(IndexOutOfBoundsException e) {
		System.out.println("Index you are trying to access does not exist");
		}
	}
}

