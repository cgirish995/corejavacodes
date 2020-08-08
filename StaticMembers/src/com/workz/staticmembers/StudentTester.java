package com.workz.staticmembers;

public class StudentTester {

	public static void main(String[] args) {
		
		//imp Note:When we are calling static block in other class we need to create objects 
		
		
		System.out.println("Students in the college :" + Student.college);
		Student.initCollege();//we get the Students in the college :null because static init is initialized first so we got the results
		
		Student Girish = new Student(1,"Ganesh");
		Girish.display();
		

		Student Krishna= new Student(2,"Gowri");
		Krishna.display();
		
		Student Gopal = new Student(3,"Ganga");
		Gopal.display();
		
		
		
		
		
	}

}
