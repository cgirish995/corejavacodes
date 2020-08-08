
public class MultiDimensionalArray {

	public static void main(String[] args) {
		

		
		System.out.println("Start of multiDimensional Array");
		
		int intArray[][]=new int[2][2];
		
		intArray[0][0]=10;
		intArray[0][1]=20;
		intArray[1][0]=30;
		intArray[1][1]=40;
		
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(intArray[i][j]+"\t");
				
			}
			System.out.println();
		}
		

			System.out.println("Using Literals");
			
			int[][] arr={{50,60},{70,80}};
			
			for(int k=0;k<2;k++){
				for(int l=0;l<2;l++){
					System.out.print(arr[k][l]+"\t");
				}
				System.out.println();
			}
	}

}
