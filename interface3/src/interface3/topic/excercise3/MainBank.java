package interface3.topic.excercise3;

public class MainBank implements Bank1,Bank2 {
	
	
	public void rateOfInterestBank1() {
		System.out.println("Bank1 provides higher rate of Interest");
	}
	
	
	public void branchNameBank1() {
		System.out.println(" Bank1 Branch is Vijayanagar");
	}
	
	
	public void branchNameBank2() {
		System.out.println(" Bank2 Branch is Jayanagar");
	}
	
	public void rateOfInterestBank2() {
		System.out.println("Bank1 provides Low rate of Interest");
	}
	
		@Override
		public void digitalBanking() {
		System.out.println("digitalBanking facilites are provided");
	}
		
		public void debitCard() {
			System.out.println("Provides debit card");
		}
		
		@Override
		public void loan() {
		System.out.println("Provides a loan");
		}

}
