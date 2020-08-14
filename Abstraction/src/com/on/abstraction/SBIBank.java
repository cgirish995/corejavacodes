package com.on.abstraction;

public abstract class SBIBank extends RBIBank{
	
	
	@Override
	void openBankAccount() {
		System.out.println("Things required From SBIBANK are:");
		System.out.println("AadarCard ,Photos,VoterID ");
	}
	
	abstract void loaning();


	public static void main(String[] args) {
		

	}

}
