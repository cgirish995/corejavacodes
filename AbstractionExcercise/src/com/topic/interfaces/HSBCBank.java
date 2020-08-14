package com.topic.interfaces;

public class HSBCBank extends SBIBank {

	
		void debitCard() {
			System.out.println("SBI provides Debit card");
		}
		
		void loan() {
			System.out.println("SBI provides loan upto 50 lacks");     
		}
		
		void creditCard() {
			System.out.println("SBI provides credit card facilities");
		}
		
		
			@Override
		public void rateOfInterest() {
			System.out.println("HSBC rate of Interset is 8 percentage per Annum");
		}
		
		@Override
		public 	void branchName() {
			System.out.println(" HSBCBank Branch name is Vijayanagar");
		}
			
		@Override	
		public void digitalBanking() {
			System.out.println("HSBC BANK provides Digital Banking facilities");
		}
		
	
			
		public void fixedbankigAccount() {
			System.out.println("Can keep money in Fixed Deposit");
		}
}
