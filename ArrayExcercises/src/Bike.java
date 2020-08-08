
public class Bike {
	
	
	//Instance Variables or Fields
	String companyName;
	String bikeName;
	String colorOfBike;
	int noOfWheels;
	boolean isGeared;
	
	
	//Constructors
	Bike(){
		System.out.println("Creating bike Objects");
	}
	
	
	//Behaviours or Methods or Functions
	void Running() {
	
		System.out.println("Bikes moves Fast");		
	}
	
	void Fueltype() {
		System.out.println("Bike runs on fuel");
	}
	
	
	void breaks() {
		System.out.println("Bike stops on applying breaks");
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		Bike splendor = new Bike();
		

		
	
		
		splendor.companyName="Honda ";
		splendor.bikeName="Victor pro ";
		splendor.colorOfBike="silver grey ";
		splendor.isGeared=true;
		splendor.noOfWheels=2;
		
		System.out.println(splendor.companyName);
		System.out.println(splendor.bikeName);
		System.out.println(splendor.colorOfBike);
		System.out.println(splendor.isGeared);
		System.out.println(splendor.noOfWheels);
		
		System.out.println("\n");
		
		splendor.Running();
		splendor.breaks();
		splendor.Fueltype();
		
		System.out.println("\n");
		
		Bike pulsar = new Bike();
		
		
		pulsar.companyName=" Bajaj ";
		pulsar.bikeName=" pulsar pro ";
		pulsar.colorOfBike="silver ";
		pulsar.isGeared=true;
		pulsar.noOfWheels=2;
		
		
		System.out.println(pulsar.companyName);
		System.out.println(pulsar.bikeName);
		System.out.println(pulsar.colorOfBike);
		System.out.println(pulsar.isGeared);
		System.out.println(pulsar.noOfWheels);
		
		System.out.println("\n");

		pulsar.Running();
		pulsar.breaks();
		pulsar.Fueltype();
		
		
		
		
	}

}
