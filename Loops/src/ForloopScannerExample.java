import java.util.Scanner;

public class ForloopScannerExample {

	public static void main(String[] args) {
		
		
		//Need to add Scanner 
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		
		
		for(int i=0;i<number;i++) {
			System.out.println(i);
		}

	}

}
