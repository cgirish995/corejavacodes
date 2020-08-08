import java.util.Scanner;

public class ScoreGreaterThanOrNot {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the number");		
		int number = scan.nextInt();
		
		if(number>=100)
		{
			System.out.println("You have scored a century");
		}
			else {
				System.out.println("Sorry you have not scored century");
			}
		}
		
	
	}


