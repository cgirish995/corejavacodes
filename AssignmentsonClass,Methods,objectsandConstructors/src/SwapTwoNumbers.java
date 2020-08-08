
public class SwapTwoNumbers {
	
	int a,b;
	
	void swap(int ina,int inb) {
		a=inb;
		b=ina;
		System.out.println("The value of a is : " +a);
		System.out.println("The value of b is : " +b);
		
	}
	

	public static void main(String[] args) {
		
		SwapTwoNumbers s = new SwapTwoNumbers();
		
		s.swap(30,25);
		

	}

}
