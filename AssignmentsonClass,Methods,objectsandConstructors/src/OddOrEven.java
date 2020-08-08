
public class OddOrEven {
	
	
	int a;
	
	void evenodd(int ina) {
		a=ina;
		
		if(a%2==0) {
			System.out.println("The number is even");
		}else {
				System.out.println("The number is odd");
			}
		}
	

	public static void main(String[] args) {
		
		OddOrEven num = new OddOrEven();
		num.evenodd(19);
		
	}

}
