package com.custom.exception;

public class InvalidBloodException extends Exception {
	
	InvalidBloodException(String s){
		super("You are not eligible to Donate the blood");
	}

	public static void main(String[] args) {
		

	}

}
