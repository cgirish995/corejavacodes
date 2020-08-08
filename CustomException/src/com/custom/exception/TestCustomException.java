package com.custom.exception;

public class TestCustomException {
	
		int age;
	
	  void validate (int inputage)throws InvalidAgeException {
		  age=inputage;

		 if(age<18) {
			 throw new InvalidAgeException("Invalid to Vote");
		 }else {
			 System.out.println("Welcome to Vote");
		 }
	 }
		
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		TestCustomException vote = new  TestCustomException();
		
		try {
		vote.validate();
		}catch(InvalidAgeException e) {
			//System.out.println("Your are age should be greater than 18");
			e.printStackTrace();
		}
	}

}
