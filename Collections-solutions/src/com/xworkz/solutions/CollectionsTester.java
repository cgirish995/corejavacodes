package com.xworkz.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsTester {

	public static void main(String[] args) {
		
		
		String cadbury = "eclairs";
		String nestle = "Kitkat";
		String campco = "MilkyBar";
		String parle = "Kiss me";
		String amul = "Dark Chocolate";
		
		
		Collection chocolates = new ArrayList();
		 chocolates.add(parle);
		 chocolates.add(cadbury);
		 chocolates.add(nestle);
		 chocolates.add(campco);
		 chocolates.add(parle);
		 chocolates.add(amul);
		 chocolates.add(null);
		 chocolates.add(parle);
		
		
//		 Object[] choco = chocolates.toArray();
//		 
//		for(int i=0;i<choco.length;i++){
//			System.out.println(choco[i]);
//		}
		 
		
		
		 System.out.println("the size of the List before removing is : " + chocolates.size());
		
		int count=0;
		 Iterator iterator = chocolates.iterator();
		 while(iterator.hasNext()){
			Object s = iterator.next();
			if(s==parle){
				iterator.remove();
				count++;
			}
		 }
		
		 System.out.println("The removed count is " + count);
		 
		 System.out.println("After removing multiple occurence the size is : " + chocolates.size());
		 
		 chocolates.forEach(s->System.out.println(s));
		 
		
		 
		 
		 
		 
	}

}
