package com.on.abstraction;

public abstract class RBIBank {
	
//When we have class as abstract we should have prefix method name as abstract	
	
	 abstract void openBankAccount();
	
	
	void deposit(int amount) {
		System.out.println("Depositing amount :"  + amount);
	}
	
	void withdraw(int amount) {
		System.out.println("Withdrawing amount: " + amount);
	}

	public static void main(String[] args) {
		

	}

}
