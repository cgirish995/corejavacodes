package com.on.abstraction;

public class BankTester {

	public static void main(String[] args) {
		
		//RBIBank bank =  new RBIBank();//Cannot Create or instantiate object of abstract class
		
		
	//2nd Method  using upcasting  	
	/*RBIBank bank =new SBIBank();//Upcasting 
		bank.openBankAccount();
		bank.deposit(1000);
		bank.withdraw(500);
		*/
		
		//3rd Method Creating object of SBIBank and calling  Method from RBI bank
	/*	SBIBank bank2 = new SBIBank();
		bank2.deposit(500000);
		bank2.withdraw(2500);
		
		bank2.openBankAccount();
		*/
		
		
		//4th Method Creating object of HSBCBank and calling  Method from RBI bank
	/*	HSBCBank bank3 = new HSBCBank();
		bank3.deposit(30000);
		bank3.withdraw(4888);
		
		bank3.openBankAccount();*/
		
		
		//SBIBank bank4 = (HSBCBank) new HSBCBank();//because of child class to child class
		
	//5Th Method using upcasting 
	/*RBIBank bank4	= new HSBCBank();//Upcasting 
	bank4.deposit(90000);
	bank4.withdraw(6000);
	
	bank4.openBankAccount();*/
		
		
		//Made SBIBank as Abstract class and extending SBIBank to JayanagarSBIBank
		/*JayanagarSBIBank bank5 = new JayanagarSBIBank();
		bank5.deposit(10000);
		bank5.withdraw(7896);
		
		
		bank5.loaning();
		bank5.openBankAccount();
		*/
		
	RBIBank bank6 = new JayanagarSBIBank();//upcasting
	bank6.openBankAccount();
		
		
		
	}

}
