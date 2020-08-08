
public class blocks {
	
	String material;
	double price;
	
	
	/*blocks(){
		System.out.println("Creating Objects");
	}*/

	{
		material="Gold";
	}
	
	blocks(String inputMaterial,double inputPrice){
		System.out.println("Material"+material+"price"+price);
	
		material=inputMaterial;
		price=inputPrice;
	}
		
		void clip(){
			System.out.println("Put clips");
		
	}
		
		{
			price=80.00;
		}
	
	public static void main(String[] args) {
	
	/*	blocks steel =new blocks();
		steel.material="Platinum";
		steel.price=60.1235;
		
		System.out.println(" Material:"+steel.material+" price: "+steel.price);*/
	
		
		//Suppose if we create an constructor before the non static block we can create an object
		// and we can use the object to print the results 


		
	}

}
