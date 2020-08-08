
public class Bank {
	
	private  String acctNum;	
	private  int balance=10000;
	
	//Constructor is to Initilization
	
	public Bank(String inputAcctNO) {
		acctNum=inputAcctNO;	
	}
	
	//Methods
	public void displayBalance(String acctno) {
		System.out.println("The balance for acct " + acctno +"is" +balance);
	}

	
	public void deposit(int amount) {
		if(amount>0)
			balance += amount;
		else
			System.out.println("You have entered a wrong deposit amount");
	}
	
	
	void withdraw() {
		//
	}
	
	

	public static void main(String[] args) {
		

	}

}
