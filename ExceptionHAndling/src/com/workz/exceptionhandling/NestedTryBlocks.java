package com.workz.exceptionhandling;

public class NestedTryBlocks {

	public static void main(String[] args) {
		
		
		
	try {
			
		try {	

			int num = Integer.parseInt("Abc");
			System.out.println(num);
			}catch(ArithmeticException e) {
			System.out.println("Entered string cant be converted to number");
		}
			
		
		int[] array1 = {1,2,3,4,5};
			System.out.println("The element of array is " + array1[8]);
			
		}catch(NumberFormatException e)	{
			System.out.println("Encountered NumberFormatException Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index you are trying to access does not exist");
		}catch (RuntimeException e) {
			System.out.println("Encountered Runtime Exception");
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
		
	
//ImpNote:When we have Nested Try Block	the first block goes to " NumberFormatException" because of most appropriate exception in the Nested Block
	}

}
