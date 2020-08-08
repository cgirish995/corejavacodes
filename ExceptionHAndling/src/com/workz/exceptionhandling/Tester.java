package com.workz.exceptionhandling;

public class Tester {

	public static void main(String[] args) {
		
	System.out.println("Hello folks");
	
	int a=10,b=20;
	
	int sum = a+b;
	
	System.out.println("sum is:" +sum);
	
	//int div =10/0; //infinity //critical
	//Receive var from scanner
	
	int x=10,y=0;
	
	try {
		int div=x/y;
		System.out.println("Div is"+div);
	}catch (ArithmeticException e) {
		System.out.println("You have entered Zero for divisor,please enter differnet value");
	}
	
	
	String name =null;
	
	try {
		int length = name.length();
		System.out.println("Lenght of string is+lenght"+length);
	}catch (NullPointerException e) {
		System.out.println("Please enter the name");
	}
		

	
		

	}

}
