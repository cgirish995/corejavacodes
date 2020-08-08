package com.workz.exceptionhandling;

public class DivisonOperation {

	public static void main(String[] args) {
		System.out.println("Begin");
		
		DivisonOperation divOpr = new DivisonOperation();
		
		int result = divOpr.division(10, 0);
		//System.out.println("Result is" + result);

	}
	
	
	int division(int a,int b) {
		
		int div =0;
		try {
		div = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Enter the divisor other than Zero");
		}return div;
		
		
		
	}

}
