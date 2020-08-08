package com.workz.exceptionhandling;

public class ArthmeticException {

	public static void main(String[] args) {
		
		//Exception is an event occurs when we have critical statement, during execution of program due to logical mistakes
		
		int x=10,y=0;
		try {
		int div=(x/y);
		System.out.println("Div is" + div);
		}catch(ArithmeticException e) {
			System.out.println("you have to entered zero for divisor,please enter the different value");
		}
		
		
		//null point Exception
		String name="Girish";
		try {
			int length=name.length();
			System.out.println("Length of string is " + length);	
		}catch(NullPointerException e) {
			System.out.println("Enter the name");
		}
	
		

	}

}
