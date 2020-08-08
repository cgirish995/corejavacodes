package com.workz.corejava.privateaccessmodifiers;

public class Dog {
	
	

	 String breed;//Instance Variable 
	 String color;//Instance Variable
	 int age;//Instance Variable
	 boolean isMale;//Instance variable
	
	
	//Constructors:Are used to initialization and should print the results inside main Method as below 
	
	Dog(){
		breed="Shephard";
		color="Black";
		age=10;
		isMale=false;
		System.out.println("Creating object of Dog");
	}

	Dog(String inbreed){
		System.out.println("Creating the objects of dog using one paramaeter constructor");
	}
	
	Dog(String inbreed,int age){
		System.out.println("Creating the objects of dog using two paramaeter constructor");
	}
	
	
	
	//Methods:The contents inside the Methods will print by giving the new keyword as 
	//wolf.eating();
	//wolf.barking();
	//wolf.running();
	
	
	void eating(){
		System.out.println("Dog is eating:");
	}
	
	void barking(){
		breed="Julie";
		System.out.println("Dog is Barking: "+breed);
	}
	
	void running(){
		System.out.println("Dog is running");
	}
	

	public static void main(String[] args) {
		
		
Dog wolf=new Dog();
		
		//Using the Constructor
		//System.out.println(" Breed: "+ wolf.breed +" Color: "+ wolf.color + " age: "+wolf.age + " isMale: "+wolf.isMale);
		
		
		/*//Using the Instance Variables  
		wolf.breed="Dabar";
		wolf.color="White";
		wolf.age=20;
		wolf.isMale=true;
		System.out.println(" Breed: "+ wolf.breed +" Color: "+ wolf.color + " age: "+wolf.age + " isMale: "+wolf.isMale);
		*/
		
		//Using the Methods
		/*wolf.eating();
		wolf.barking();
		wolf.running();*/
		
		
		//Using private to Instance variables String,boolean and Access the String inside main Method
		
		/*important note is that we can Access private,public,default,and protected within the same class
		inside the  same method*/
		
		wolf.breed="Brownie";
		wolf.color="Brown";	
		wolf.isMale=true;
		System.out.println(" breed: "+wolf.breed+" color: "+wolf.color+" isMale: "+ wolf.isMale);
		

	}

}
