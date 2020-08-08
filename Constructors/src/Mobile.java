
public class Mobile {
	
	//Initializing Default values ,Instanace variables are intialized
		String brand;//null
		boolean IsSmartphone;//false
		double price;//00.00
		int ram;//0
		
		Mobile(){//Constructor
			System.out.println("calling the Constructor");
			brand="Nokia";
			IsSmartphone=true;
			price=5000.00;
			ram=4;
			System.out.println("Ending of Constructor");
			
		}
		
		void makecall(long phonenumber){
			System.out.println("Making the call"+phonenumber);
		}
		
		void charging(boolean ischarging){
			System.out.println("IS the phone chargigng on:"+ischarging);
		}
		
		void locked(boolean islocked){
			System.out.println("Is the phone locked:"+islocked);
		}

	public static void main(String[] args) {
			
		System.out.println("Start of program");
		
		Mobile nokia=new Mobile();
		System.out.println("brand:"+ nokia.brand +" iSSmartphone "+nokia.IsSmartphone +
				" price "+ nokia.price +" ram "+ nokia.ram);
		
		
		nokia.brand="Samsung";
		nokia.IsSmartphone=false;
				System.out.println("brand:"+ nokia.brand +" iSSmartphone "+nokia.IsSmartphone +
				" price "+ nokia.price +" ram "+ nokia.ram);
		

	}

}
