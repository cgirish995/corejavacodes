import java.util.Scanner;

public class WhileLoopScannerExample {

	public static void main(String[] args) {
		
		
		System.out.println("Beginning of program");
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		int number = scan.nextInt();
		
		int i=0;
		while(i<=number) {
			System.out.println(i);
			i++;
		}
		
	}

}
