package com.practise.taskonstrings;

public class StringPalandrome {

	public static String palandrome(String name) {

		String rev = "";

		char[] convertedToCharacter = name.toCharArray();

		for (int i = convertedToCharacter.length - 1; i >= 0; i--) {
			rev = rev + convertedToCharacter[i];
		}

		return rev;

	}

	public static void main(String[] args) {

		String givenStringIs = "madam";

		String checkPalindrome = palandrome(givenStringIs);

		if (givenStringIs.equals(checkPalindrome)) {
			System.out.println(givenStringIs + "  is palindrome ");
		} else {
			System.out.println(givenStringIs + "  is not palindrome");
		}

	}

}
