package com.custom.exception;

public class Division {
	
	
	int a ,b ;
	 void div(int inputa,int inputb)throws InvalidDivisorException{
		  
		  a=inputa;
		  b=inputb;
		  
		  int div=a/b;
		  if(div==0) {
			  System.out.println("The result is " + div);
		  }else {
			  throw new InvalidDivisorException("Please change the Divisor");
			 
		  }
		  
		  
	
			
	
		 
	
		 
		
}
	
	
		
	

	public static void main(String[] args) {
		
		Division divisor = new Division();
		
		try {
		divisor.div(25,0);
		}catch (InvalidDivisorException e) {
			e.printStackTrace();
		}
	}

}
