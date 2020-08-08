package com.custom.exception;



public class TestNumber {
	
	static void num(int a)throws InvalidNumberException {
		
		if(a%2==0 && a>0)
			System.out.println("The number is positive");
		else {
			throw new InvalidNumberException("Please enter the Positive interger");
		}
	}	
		

	public static void main(String[] args) {
		
		try {
			num(-2);
		}catch(InvalidNumberException e) {
			//System.out.println("Exception Occured"+e);
			e.printStackTrace();
		}
	}

}
