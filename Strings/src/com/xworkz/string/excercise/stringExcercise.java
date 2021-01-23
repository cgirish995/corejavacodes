package com.xworkz.string.excercise;

public class stringExcercise {

	public static void main(String[] args) {

		//1.How to find the length of the string
		//2.it returns int value
//		String s1 ="rangi";
//		System.out.println(s1.length());
		
		//2.How to get the each characters from string
			
//		String s2="rangitaranga";
		//System.out.println(s2.charAt(3));
//		for(int i=0;i<s2.length();i++){
//			char c = s2.charAt(i);
//			System.out.println(c);
//		}
		
		//3.How to check the strings are equal
//		//Returns boolean
//		String s3 = new String("abc");
//		String s4 = "defg";
//		System.out.println(s3.equals(s4));
		
		//4.How to compare two Strings
		//Returns int
		//If positive is returned it means s5>s6
		//If negative is returned it means s5<s6
		//If equal is returned it means s5==s6
		
//		String s5="ABC";
//		String s6="Abc";
//		System.out.println(s5.compareToIgnoreCase(s6));
		
//		String s5 ="abc";
//		String s6="bcd";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="ramu";
//		String s6="raju";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="ram";
//		String s6="ramu";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="abc";
//		String s6="acb";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="abx";
//		String s6="acb";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="abx";
//		String s6="abb";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="abxab";
//		String s6="abx";
//		System.out.println(s5.compareTo(s6));
//		
//		String s5="abx";
//		String s6="abx";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="123";
//		String s6="143";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="#1";
//		String s6="*1";
//		System.out.println(s5.compareTo(s6));
		
//		String s5="godhi bannana";
//		String s6="godhi hannu";
//		System.out.println(s5.compareTo(s6));
		
		
//		String s5="Raga";
//		String s6="modi";
//		System.out.println(s5.compareTo(s6));
		
		//5. concat()
		
//		String s5 ="abc";
//		String s6="def";
//		System.out.println(s5.concat(s6));
		
		
		//6.contains()
		//returns boolean
		//System.out.println("ramachandar".contains("macha"));
	
//		String s5 ="abracadabra";
//		System.out.println(s5.contains("abc"));
		
		//7.IndexOF()
//		String s5 ="abracadabra";
//		System.out.println(s5.indexOf("r"));//only gives the first occurences
//		System.out.println(s5.indexOf("ra", 3));//starts from index 3 and finds the "r"
//		System.out.println(s5.indexOf("ram", 0));
		
		//8.Replace
//		String s6="mogambobo";
//		String s7="mogambomo";
//		System.out.println(s6.replace("bo", "go"));//replaces all occurences
//		System.out.println(s7.replace("mo", "ram"));
//		System.out.println(s7.replace("mm", "abc"));
		
		//9.tocharArray()
//		String s8="abc 456";
//		char[] charArray = s8.toCharArray();
//		System.out.println(charArray[0]);
//		System.out.println(charArray[1]);
//		System.out.println(charArray[2]);
		
//		for(char c : charArray){
//			System.out.println(c);
//		}
//		
		//int size = s8.length();
		
//		for(int i=0;i<charArray.length;i++){
//			System.out.println(charArray[i]);
//		}
		
		
		//10 Substring
		//String s9="uppi2";
		//System.out.println(s9.substring(4));
		//System.out.println(s9.substring(0, s9.length()));
		//System.out.println(s9.substring(0, 5));
		
		//11.Upper and Lowercase
//		String s10="RaMbo";
//		System.out.println(s10.toUpperCase());
//		System.out.println(s10.toLowerCase());
//		System.out.println(s10);
//		String s10="#123a";
//		System.out.println(s10.toUpperCase());
		
		
		//12.trim:chops of the front and trailling spaces
//		String s1= " abc def ";
//		System.out.println(s1.trim());
//		
//		String s2 = " ";
//		System.out.println(s2.trim());
				
		
//		String s11 ="and";
//		char c=s11.charAt(0);
//		String res = s11.substring(1, s11.length());
//		System.out.println(res+c);
//		
	
		
//		String s11 ="rambo";
//		char c= s11.charAt(0);
//		String substring =s11.substring(1,s11.length());
//		System.out.println(substring+c);
		
	
//		String s="thisiscrazy";
//		String r=" ";
//		
//		for(int i=0;i<s.length();i+=2){
//			char c = s.charAt(i);
//			r=r+c;
//		}
//		System.out.println(r);
		
		
//		String s1 = "Strings in java are crazy";
//		String[] split = s1.split("a");
//		
//		for(int i=0;i<split.length;i++){
//			System.out.println(split[i]);
//		}

		
		
//		String s2 ="abc";
//		for(int i=0;i<s2.length();i++){
//			System.out.println(s2.substring(i, i+1));
//		}

	
//		String str="vishwamitra";
//		for(int i=0;i<str.length();i++){
//			for(int j=i+1;j<str.length();j++)
//			System.out.println(str.substring(i, j));
//		}
		
		
		String s="gogo";
		System.out.println(s.toUpperCase());
		
		
		
		String s1 ="vishwamitra";
		for(int i=0;i<s1.length();i++){
			for(int j=i+1;j<s1.length();j++)
			System.out.println(s1.substring(i,j));
			
		}
		
		
		
	}

}
