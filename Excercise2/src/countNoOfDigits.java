
public class countNoOfDigits {

	public static void main(String[] args) {
		
		
		int num=5678;
		int count=0;
		
		do {
			
			num=num/10;
			count++;
		}while(num!=0);
		System.out.println("No of Digits are:"+count);

	}

}
