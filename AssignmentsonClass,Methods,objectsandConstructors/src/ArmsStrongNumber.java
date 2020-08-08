
public class ArmsStrongNumber {
	
	
	void armsStronNumber(int num) {
		
		int a=0,b,c=0;
		b=num;
		
		while(b>0) {
				a=b % 10;
				b=b / 10;
				c= c + (a*a*a);
				}
		
		if(c == num) {
			System.out.println("Armsstrong number");
		}else {
			System.out.println("not a Armsstrong number ");
		}
		
	}
	

	public static void main(String[] args) {
		
		ArmsStrongNumber number =  new  ArmsStrongNumber();
		
		number.armsStronNumber(153);

	}

}
