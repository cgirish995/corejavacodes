
public class toFindLargestAndSmallest {
	
	public static void main(String[] args) {
	
	
	int myArray[][]={{10,20,30},{70,80,90},{60,50,40}};
	
	int largest=myArray[0][0];
	int smallest=myArray[0][0];
	
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(myArray[i][j]>largest)
				largest=myArray[i][j];
			else if (myArray[i][j]<smallest)
				smallest=myArray[i][j];
		}	

	}
	
	System.out.println("The largest Number is: "+largest);
	System.out.println("The smallest Number is:"+smallest);

	}
		
}




