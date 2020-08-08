import java.util.Scanner;

public class ForLoopMultiplication {

	public static void main(String[] args) {
		
		
		System.out.println("Starting the program");
		
		Scanner scan = new Scanner(System.in);
		
		int mult;
		
		System.out.println("Enter the number to be multiplied: ");
		int number = scan.nextInt();
		
		
		for(int i=1;i<=10;i++) {
			mult=i*number;
			System.out.println(number + " * "+i+ " = " +mult);
		}
		
		
	System.out.println("End of program");
		
		
	
	}

}
