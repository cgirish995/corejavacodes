
public class SumOfTwoNumbers {
	
	
	void add(int a,double b) {
		double add = a+b;
		System.out.println("Sum of the 2 numbers is : " + add);
	}
	
	void add(float a,long b) {
		float add =a+b;
		System.out.println("Sum of the 2 numbers is : " + add);
	}
	
	void add(double a ,float b) {
		double add = a+b;
		System.out.println("Sum of the 2 numbers is : " + add);
	}

	public static void main(String[] args) {
		
		SumOfTwoNumbers adding = new SumOfTwoNumbers();
		
		adding.add(25, 25.258);
		adding.add(25.147, 369874125l);
		adding.add(2587,25.698);

	}

}
