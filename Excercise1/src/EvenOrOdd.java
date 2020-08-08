import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		
		
		int number = scan.nextInt();
		
		if(number%2==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
	}

}
