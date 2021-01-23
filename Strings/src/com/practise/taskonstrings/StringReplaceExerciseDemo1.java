package com.practise.taskonstrings;

public class StringReplaceExerciseDemo1 {

	public static String replacingStrings(String characternames) {

		String replace = characternames.replace("name", "java");

		return replace;

	}

	public static void main(String[] args) {

		String name = "Hi name , i am new into programming";
		String replacingStrings = replacingStrings(name);
		System.out.println(replacingStrings);

	}

}
