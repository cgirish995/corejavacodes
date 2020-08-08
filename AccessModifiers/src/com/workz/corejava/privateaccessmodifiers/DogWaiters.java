package com.workz.corejava.privateaccessmodifiers;

public class DogWaiters {

	public static void main(String[] args) {
		
		
		DogTesters rock = new DogTesters();
		//james.breed="Brownie";
		//james.breed = "brownie";//Private Modifier:Getting an error because of using private in DogTesters
		rock.age=25;//Default variable: can be accessed outside the class 
		rock.color="Yellow";//protected Modifiers from DogTesters
		rock.isMale=true;//public Modifiers from DogTesters
		
		System.out.println("age: "+rock.age+"  color:"+rock.color+" isMale: "+rock.isMale);
		
		rock.barking();
		
		rock.eating();
		
		
		
		
		
//Important Note 1:We can Access protected,public ,default modifiers from one class to another class but cannot access private 
//Important Note 2:We can also access methods from one class to other class;like:rock.barking(); ,rock.eating();
		
		

	}

}
