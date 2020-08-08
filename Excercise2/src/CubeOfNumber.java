import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int number = scan.nextInt();
		
		
		for(int i=1;i<=number;i++) {
	
			System.out.println(" cube of "+ i +" is :" +(i*i*i));
			
		}
		scan.close();

		
	}

}
