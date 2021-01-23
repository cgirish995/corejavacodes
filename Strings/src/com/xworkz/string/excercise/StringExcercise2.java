package com.xworkz.string.excercise;

public class StringExcercise2 {
	
	//public static int numOfOccurence(String s1,String s2){
		
	
	
	
	

	public static void main(String[] args) {
		
		String s1 = "ramaramaramara";
		String s2 ="ra";
		
		int count =0;
		int pos =0;
	
	while((pos = s1.indexOf(s2, pos))!=-1){
		count++;
		pos++;
	}
	System.out.println(count);

	}

}
