package com.practise.taskonstrings;

public class ConvertIntoCharArray {

	public static void main(String[] args) {

		ConvertIntoCharArray character = new ConvertIntoCharArray();
		char[] stringIntoCharArray = character.stringIntoCharArray("chandrashekar");
		for (int i = 0; i < stringIntoCharArray.length; i++) {
			System.out.println(stringIntoCharArray[i]);

		}

	}

	public char[] stringIntoCharArray(String name) {

		char[] c = name.toCharArray();

		return c;
	}

}
