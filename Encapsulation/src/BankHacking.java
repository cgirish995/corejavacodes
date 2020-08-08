
public class BankHacking {

	public static void main(String[] args) {
		
		
		Bank bank =new Bank("ICICI00785412");
		
		//bank.acctNum="ICICI00785412";
		//bank.balance=-10000;
		
		bank.deposit(10000);
		
		bank.displayBalance("ICICI0147789");

	}

}
