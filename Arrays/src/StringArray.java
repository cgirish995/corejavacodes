
public class StringArray {

	public static void main(String[] args) {
		
		
System.out.println(" Start of Program ");
		
		String strArray[]= new String[10];
		
		strArray[0]="Winter";
		strArray[1]="Rainy";
		strArray[2]="Monsoon";
		strArray[3]="Summer";
		strArray[4]="Autum";
		strArray[5]="No Season";
		
		int length=strArray.length;
		for(int i=0;i<length;i++){
			if(strArray[i]!=null)
				System.out.println("The values of arrayrs are:"+strArray[i]);
		}
		
		String strliterals[]={"Winter","Monsoon","Rainy"};
		int leng=strliterals.length;
		for(int i=0;i<leng;i++){
			System.out.println(strliterals[i]);
		}
		
		System.out.println("Start of For each loop:");
		
		
		for(String str:strArray){
			System.out.println(str);
		}

	}

}
