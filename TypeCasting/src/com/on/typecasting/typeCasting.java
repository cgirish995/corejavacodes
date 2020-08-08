package com.on.typecasting;

public class typeCasting {
	
	static int sum(long a,double b) {
		int sum =(int)(a+b);
		return sum;
	}

	public static void main(String[] args) {
		
		int a=10;
		long b=20;
		int res=sum(a,b);
		System.out.println(res);

	}

}
