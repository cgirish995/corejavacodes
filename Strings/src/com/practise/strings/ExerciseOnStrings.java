package com.practise.strings;

public class ExerciseOnStrings {

	public static void main(String[] args) {

		String s = "rangi";
		String a = "rangi";

		System.out.println("The length of a String is :" + s.length());

		// How to iterate each elements in String

		// for(int i=0;i<s.length();i++){
		// char c = s.charAt(i);
		// System.out.println(c);
		// }

		// System.out.println(s.equals(a));//true

		String s1 = "ram";
		String s2 = "ramu";
		System.out.println(s1.compareTo(s2));

		System.out.println("The concatenated String is :" + s1.concat(s2));

		
		System.out.println("ramachandra".contains("macha"));
		
		System.out.println("ramachandara".charAt(2));
		
		System.out.println(s1.toUpperCase());
		
		
		
		String x= "03-04-1995";
		String[] split = x.split("-");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		
		System.out.println("\n");
		for(int i=0;i<split.length;i++){
			System.out.println(split[i]);
			
			
			
			String a1 = "xworkz";
			String a2 ="xworkz";
			System.out.println(a1==a2);
			
			System.out.println("\n");
			String b1 = "xworkz";
			String b2 = new String("xworkz");
			System.out.println(b1.equals(b2));
		}
		
	}

}
