
public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial of 5 is:5*4*3*2*1
		
		
		int i=5;
		int fact=1;
		
		while(i>=1) {
			fact=fact*i;			
			i--;
			
		}
		
		System.out.println("factorial of number is : "+ fact);
		

	}

}
