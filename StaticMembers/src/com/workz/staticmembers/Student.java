package com.workz.staticmembers;

public class Student {
	
	
	int studentID;
	String name;
	static String college ;

	//Static Block:When we initialize any value in static block it will we can access that value without creating any object
	//When we any non static block and static block ,static block will be initialized first 
	
	//we can also use  this 
	/*static{
		college="Xworkz";
	}*/
	
	
	
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	//Can also Write Constructor like This 
	/*Student(int inputStudentID, String inputname){
		studentID=inputStudentID;
		name=inputname;
	}*/
	
	
	//Init to intialize : we can also use this :init method
	static void initCollege() {
		college="xworkz";
	}
	
	
	
	
	void display( ) {
		System.out.println("Student id :" + studentID);
		System.out.println("Student name :" + name);
		System.out.println("Student college :" + college);
	}



	public static void main(String[] args) {

		
		//Calling static block without creating objects:Xworkz we got result 
		//System.out.println(college);
	}

}
