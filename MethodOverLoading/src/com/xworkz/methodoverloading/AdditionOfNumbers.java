package com.xworkz.methodoverloading;

public class AdditionOfNumbers {
	
	
	int a;
	int b;
	int c;
	
	AdditionOfNumbers(){
		
	}

	
	public AdditionOfNumbers(int inputa,int inputb, int inputc) {
		a=inputa;
		b=inputb;
		c=inputc;
	}
	
	//Method
	void sum(int a,int b) { //Method Signature
		int sum = a+b;
		System.out.println("Sum of 2 numbers is:" + sum);
	}
	
	
	void sum(int a,int b,int c) { // Overloading 
		int sum = a+b+c;
		System.out.println("Sum of 3 numbers is:" + sum);
	}
	
	
	void sum(double a,double b,double c) { //Method overloading 
		double sum = a+b;
		System.out.println("Sum of 3 numbers is:" + sum);
	}
	
	void sum(int a,double b) { //Method overloading 
		double sum = a+b;
		System.out.println("Sum of 2 numbers is:" + sum);
	}
	
	
	public static void main(String[] args) {
		
		AdditionOfNumbers add = new AdditionOfNumbers();
//1st method System.out.println("a: " + add.a +" b " + add.b + " c" + add.c ); //This is coming up due to constructor Intialization 
		
		
		//2nd Method 
		add.a=10;
		add.b=50;
		//System.out.println("a: " + add.a +" b " + add.b + " c" + add.c );
		
		//3rd method to give values 
		add.sum(10,20);
		
		add.sum(10,258.2589,1478);
		
		add.sum(10,12357,147);// which method is to be called is declared in compile time based on numbers //
								// type of parameters
		
		
	}

}
