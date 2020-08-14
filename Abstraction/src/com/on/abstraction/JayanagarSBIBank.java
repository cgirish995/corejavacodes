package com.on.abstraction;

public class JayanagarSBIBank extends SBIBank {
	
	@Override
	void loaning() {
		System.out.println("Loaning from SBIBank  to Jayanagar SBIBANK");
	}
	
	void openBankAccount() {
		System.out.println("This is Other bank");
	}


	public static void main(String[] args) {
		

	}

}
