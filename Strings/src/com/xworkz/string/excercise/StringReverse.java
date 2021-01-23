package com.xworkz.string.excercise;

public class StringReverse {

	public static void main(String[] args) {

//		String s = "girish";
//		String temp="";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			char c = s.charAt(i);
//			temp=temp+c;
//		}
//		System.out.println(temp);	
		
		
//		String s="reverse";
//		char[] charArray = s.toCharArray();
//		for(int i=charArray.length-1;i>=0;i--){
//			System.out.println(charArray[i]);
//		}
		
		
		String s="reverse";
		char[] charArray = s.toCharArray();
		for(int i=0;i<s.length()/2;i++){
			System.out.println(charArray[i]);
			
		}
		
		

	}

}
