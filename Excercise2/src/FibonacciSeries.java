import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of terms");
		
		int number=scan.nextInt();
	
		int i=0,j=1,s1=0;
		
		int k=1;
		while(k<number) {
			
			
			i=j;
			j=s1;
			s1=i+j;
			k++;
			
		}
	
		System.out.println("The fibonacci series are: "+s1);
		
		scan.close();
	}
	
	

}
