

import java.util.Scanner;
public class UserInputArrays {

	
	public static void main(String[] args) {

		Scanner size = new Scanner(System.in);
		
		
		System.out.println("Enter the size of an Array");
		int num = size.nextInt();
		
		
		
		int myArr[] = new int[num];
		
		for(int i=0;i<num;i++){
			System.out.println("Enter the Elements of an Array");
			myArr[i]=size.nextInt();	
			System.out.println(myArr[i]);
			
		}
	
		
		/*for(int i=0;i<myArr.length;i++){	
			System.out.println("The elements in array are:"+myArr[i]);
		}*/
	


	}

}


