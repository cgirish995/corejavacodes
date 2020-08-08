package com.custom.exception;

public class TestBloodDonation {
	
	
	
	static void bloodDonor(int weight)throws InvalidBloodException{
		if(weight>50)
			System.out.println(" You Can donate blood as your weight more than 50");
	else {
		throw new InvalidBloodException("You Cannot Donate Blood as your weight less than 50");
		
	
	}
	}
	

	public static void main(String[] args) {
		
		try {
		bloodDonor(25);
		}catch(InvalidBloodException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
	}

}

