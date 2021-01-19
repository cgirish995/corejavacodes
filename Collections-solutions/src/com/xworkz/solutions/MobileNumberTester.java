package com.xworkz.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MobileNumberTester {

	public static void main(String[] args) {
//		Create a Collection , add 10 mobile number
//		find all the number ending with greater than 3
		
		Collection<Long> numbers = new ArrayList<Long>();
		numbers.add(8553651584L);
		numbers.add(8888888888L);
		numbers.add(9786147852L);
		numbers.add(1234789564L);
		
		//System.out.println(numbers);
		
		Iterator<Long> iterator = numbers.iterator();
		while(iterator.hasNext()){
			Long num = iterator.next();
			System.out.println(num);
				
			}
	
			

		
		
	}

}
