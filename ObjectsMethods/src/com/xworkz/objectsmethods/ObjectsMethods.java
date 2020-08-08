package com.xworkz.objectsmethods;

public class ObjectsMethods {

	public static void main(String[] args) {
	
		
/*ImpNote: We have 8 objectsmethods		
1.toString();
2.equals();
3.hashcode();
4.clone();
5.getclass();
6.wait;
7.notify;
8.notifyAll();


*/
		ObjectsMethods instance = new ObjectsMethods();
		
		String str = instance.toString(); //converting objects to string
		System.out.println(str);//Gives Fully qualified packagename+class name+Hexadecimal representation of class name
		
		
//equality:It checks the equality between two objects 	
		
		ObjectsMethods instance2 = new ObjectsMethods();
		
		boolean equality = instance.equals(instance2);
		System.out.println(equality);//equality:It checks the equality between two objects 
		
		boolean equality2 = instance.equals(instance);
		System.out.println(equality2);
		
		boolean equality3 = instance.equals(instance);
		System.out.println(equality3);
		
		//Assigning the created object instance to instance3
		ObjectsMethods instance3 = instance;
		
		boolean equality4 = instance.equals(instance3);
		System.out.println(equality4);
		
		
//HashCode:It gives the Integer Representation of object, where it resides		
		
		int hashcodeOfInstance = instance.hashCode();
		System.out.println(hashcodeOfInstance);
		
		int hashcodeOfInstance2 = instance2.hashCode();
		System.out.println(hashcodeOfInstance2);
		
		int hashcodeOfInstance3 = instance3.hashCode();
		System.out.println(hashcodeOfInstance3);
		
		}

}
