import java.util.Scanner;

public class WhileloopMultiplicationEx {

	public static void main(String[] args) {
		
		
		System.out.println("Beginning of program");
		
		Scanner scan = new Scanner(System.in);
		
		
		int mult;
		System.out.println("Enter the number");
		int number = scan.nextInt();
		
		
		int i=1;
		while(i<=10) {
			mult=i*number;
				System.out.println(number+ " * "+i+" = "+mult);
				i++;
		}
		
		System.out.println("End of program");
	}

}
