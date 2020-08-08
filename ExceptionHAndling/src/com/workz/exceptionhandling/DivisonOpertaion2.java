package com.workz.exceptionhandling;

public class DivisonOpertaion2 {

	public static void main(String[] args) {
		
		int a=10 ,b=0;
		
		DivisonOpertaion2 divOpr = new DivisonOpertaion2();
		
		try {
			int result = divOpr.division(a , b);
			System.out.println("Result is: " + result);
		}catch (ArithmeticException e) {
			System.out.println("Something went wrong");
		}
	

	}
	
	int division(int a , int b)throws ArithmeticException {
		int div = 0;
		div =a/b;
		return div;
//Imp Note:Why Throws Keyword is used:If we dont want the current method like [division] to call the Exception,we use throws keyword  to call the Exception in Main method
	}

}
