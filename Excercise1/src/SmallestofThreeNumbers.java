
public class SmallestofThreeNumbers {

	public static void main(String[] args) {
		
		int a=10,b=20,c=5;
		
		if(a<b && a<c) {
			System.out.println("A is smaller than B and C");
		}
		else if(b<a && b<c) {
			System.out.println("B is Smaller than A and C");
		}else {
			System.out.println("C is Smaller");
		}
		
		
		
		//Using Ternary Operator
		 String result=(a<b && a<c)?("A is smaller than B and C"):
			(b<c && b<c)?("B is smaller than A and C"):
			("C is Smaller than A and B");
			
			System.out.println(result);
				
	}

}
