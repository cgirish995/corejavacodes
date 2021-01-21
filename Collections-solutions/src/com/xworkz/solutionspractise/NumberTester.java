package com.xworkz.solutionspractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NumberTester {

	public static void main(String[] args) {


		Collection<Integer> numbers = new ArrayList();
		numbers.add(10);
		numbers.add(25);
		numbers.add(10);
		numbers.add(55);
		numbers.add(10);
		numbers.add(60);
		numbers.add(55);
		System.out.println("The size of the  List Before removing duplicates is " + numbers.size());
		System.out.println(numbers);
		
		Collection <Integer> temp = new ArrayList();
		
		Iterator<Integer> iterator = numbers.iterator();
			while(iterator.hasNext()){
				Integer num = iterator.next();
				if(temp.contains(num)){
				}else{
					temp.add(num);
				}
			}
			
			
		
			System.out.println("The size of the List after removing duplicates is :"+ temp.size());
			
			
			numbers.clear();
			
			
			Iterator<Integer> it = temp.iterator();
				while(it.hasNext()){
					Integer uniqueNumbers = it.next();
					numbers.add(uniqueNumbers);
				}
			
			System.out.println("The size of the List is "+ numbers.size());
			System.out.println(numbers);
			
			
	}

}
