package com.overriding.excercise;

public class PersonTester {

	public static void main(String[] args) {
		
		
		//Objects of Person
		Person per = new Person();
		per.age=65;
		per.name="Sachin";
		System.out.println("Person age" +per.age + " Person.name"+ per.name);
		
		per.occupation();
		per.education();
		per.hobbies();
		
		System.out.println("\n");
		
		
		//Objects of Son
		Son pson = new Son();
		
		pson.age=45;
		pson.name="Suraj";
		System.out.println("Son age" +pson.age + " Son name"+ pson.name);
		
		pson.occupation();
		pson.education();
		pson.hobbies();
		
		
		System.out.println("\n");
		//Objects of Grandson
		
		GrandSon gson = new GrandSon();
		gson.age=26;
		gson.name="Santhosh";
		System.out.println("Grandson age" +gson.age + " Grand sonn ame"+ gson.name);
		
		gson.occupation();
		gson.education();
		gson.hobbies();
		
	}

}
