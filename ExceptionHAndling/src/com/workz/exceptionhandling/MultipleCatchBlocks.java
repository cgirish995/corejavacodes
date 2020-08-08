package com.workz.exceptionhandling;

public class MultipleCatchBlocks {
	
	
	

	public static void main(String[] args) {
		

		
	
		/*try {
		int[] array = {1,2,3,4,5,6};
		System.out.println("The element is : " + array[8]);
		}catch(ArithmeticException e) {
			System.out.println("Index you are trying to access does not exist");
		}*/
		
		
		
//imp Note:When there is no Proper exception mentioned in catch block it gives what type an Exception is it.as above code 	
		
		/*try {
			
		int num = Integer.parseInt("Abc");				
		System.out.println(num);
		
		
		}catch(NumberFormatException e) {
		System.out.println("Encountered NumberFormatException");
		}catch(RuntimeException e) {			
		System.out.println("Encountered RuntimeException");		
		}catch(Exception e) {
		System.out.println("Encountered RuntimeException");
	}	*/
//Imp Note:Order of the Exception is important because most appropriate Exception at the beginning will be executed first		
		

	
		try {
			
			

			int num = Integer.parseInt("A123");
			System.out.println(num);

			
			int[] array1 = {1,2,3,4,5};
			System.out.println("The element of array is " + array1[6]);
			
		}catch(NumberFormatException e)	{
			System.out.println("Encountered NumberFormatException Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index you are trying to access does not exist");
		}catch (RuntimeException e) {
			System.out.println("Encountered Runtime Exception");
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
		
//Imp Note:In the above code when first condition of try block is failed so , it executes the most appropriate Exception message 
// also when second condition of try block is failed so it does not go to any catch block because of already the message of first try block got executed  	

}

	
}
