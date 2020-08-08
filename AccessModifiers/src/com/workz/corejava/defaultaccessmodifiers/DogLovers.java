package com.workz.corejava.defaultaccessmodifiers;

import com.workz.corejava.privateaccessmodifiers.DogTesters;

public class DogLovers {

	public static void main(String[] args) {
		
		//Important Notes:We have Different Package name so,we cannot Access protected,default modifiers
				//but can access public modifiers
				
				DogTesters lab = new DogTesters();
				//james.age=25;Default modifiers cannot Access in Different Packages
				//james.color="Yellow";//Protected Modifiers cannot Access in Different Packages
				lab.isMale=false;//Public Modifiers can Access in Different Packages
				
				System.out.println(lab.isMale);
				
				
				//We cannot use Methods of DogTesters in Different package and we will get an error
				//lab.barking();
				//lab.eating();
				
	

	}

}
