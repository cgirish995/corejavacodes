package com.xworkz.alcoholdto;

import java.util.ArrayList;
import java.util.List;

public class AlcoholTester {

	public static void main(String[] args) {
		
		AlcoholDTO alcoholdto1 = new AlcoholDTO("IB" ,"Imperial" ,48);
		
		AlcoholDTO alcoholdto2 = new AlcoholDTO("Amstel" ,"King fisher" ,4);
		
		AlcoholDTO alcoholdto3 = new AlcoholDTO("Magic Moments" ,"NA" ,38);
		
		AlcoholDTO alcoholdto4 = new AlcoholDTO("old Munk" ,"NA" ,42);
		
		
		List<AlcoholDTO> alcoholdtos = new ArrayList();
		
		alcoholdtos.add(alcoholdto3);
		alcoholdtos.add(alcoholdto4);
		alcoholdtos.add(1,alcoholdto2);
		alcoholdtos.add(alcoholdto3);//Magic
		alcoholdtos.add(alcoholdto1);
		alcoholdtos.add(alcoholdto3);
		
		AlcoholDTO alcoholdto5	= new AlcoholDTO("bag piper" , "KK", 48);
		
		alcoholdtos.set(2, alcoholdto5);
		
	
		
		System.out.println("Before Removing");
		alcoholdtos.forEach(s->System.out.println(s));
		
		//alcoholdtos.remove(alcoholdto5);
		
//		System.out.println("After removing");
//		alcoholdtos.forEach(s->System.out.println(s));
		
		
//		int index=alcoholDTOs.indexOf(alcoholDTO5);
//		System.out.println("indexOf"+index);

		int indexOf = alcoholdtos.indexOf(alcoholdto1);
		System.out.println("Index of  is :" +  indexOf);
		
	
		int lastIndex=alcoholdtos.lastIndexOf(alcoholdto3);
		System.out.println("lastIndex:"+lastIndex);
		
		

	}

}
