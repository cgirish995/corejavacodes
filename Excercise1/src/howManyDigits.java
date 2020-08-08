import java.util.Scanner;

public class howManyDigits {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Digits");
		
		
		int num=scan.nextInt();
		
		
		if(num>=2 && num<=100) {
			System.out.println("Given number has 2 digits");
		}
		else if(num>100 && num<=1000) {
			System.out.println("Given number has 3 digits");
			
		}
		else if(num>1000 && num<=10000) {
			System.out.println("Given number has 4 digits");
		}
		
		else if(num>10000 && num<=100000) {
			System.out.println("Given number has 5 digits");
		}
		
		else{
			System.out.println("Number not valid");
		}
		
		
		

	}

}
