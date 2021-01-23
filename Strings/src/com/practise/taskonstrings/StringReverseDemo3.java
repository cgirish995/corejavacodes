package com.practise.taskonstrings;

public class StringReverseDemo3 {

	public static String reverseOfString(String name) {

		String rev = "";
		char[] charArray = name.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}

		return rev;
	}

	public static void main(String[] args) {

		String s = "I am new into programming.";

		String reverseOfString = reverseOfString(s);
		System.out.println("The reverse of String is :" + reverseOfString);

	}

}
