
public class Operations {

	int a,b,c,d,e,f,g,h,i,j;
	
	
	
	

	void sum(int inputa ,int inputb) {
		//Important to assign a and b to input
		a=inputa;
		b=inputb;
		//sum=a+b;
		System.out.println(" The sum of " + a + " and "+ b + " is : "+ (a+b));
	}
	
	void sub(int inputc ,int inputd ) {
		//sub =a-b;
		c=inputc;
		d=inputd;
		System.out.println(" The subtraction of " + c + " and "+ d + " is : "+ (c-d));
	}
	
	void div(int inpute ,int inputf) {
		//div=a/b;
		e=inpute;
		f=inputf;
		System.out.println(" The Division of " + e + " and "+ f + " is : "+ (e/f));
	}
	
	
	void mul(int inputg ,int inputh) {
		//mul=a*b;
		g=inputg;
		h=inputh;
		System.out.println(" The Multilpication  of " + g + " and "+ h + " is : "+ (g*h));
	}
	
	
	
	void mod(int inputi ,int inputj) {
		//mod=a%b;
		i=inputi;
		j=inputj;
		System.out.println(" The modulus of " + i + " and "+ j + " is : "+ (i%j));
	}
	
	public static void main(String[] args) {
	
		Operations operation = new Operations();
		
		operation.sum(10,20);
		operation.sub(40,20);
		operation.div(40,20);
		operation.mul(5,5);
		operation.mod(25,7);
		
		
		
	}

}
