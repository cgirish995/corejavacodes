
public class Vehicle {

	String regNo;
	int noOfWheels;
	String fuelType;

	public Vehicle() {
		System.out.println("No-Agrument Constructor");
	}

	public Vehicle(String inRegNo, int inNoWheels, String infuelType) {
		regNo = inRegNo;
		noOfWheels = inNoWheels;
		fuelType = infuelType;
	}

	public Vehicle(String inRegNo) {
		regNo = inRegNo;
	}

	public Vehicle(String inRegNo, int inNoWheels) {
		regNo = inRegNo;
		noOfWheels = inNoWheels;
	}

	void running() {
		System.out.println("Running the Vehicle");
	}

	void applyBreaks(boolean breaks) {
		System.out.println("Applying thr Breaks" + breaks);
	}

	public static void main(String[] args) {

		System.out.println("Start of Programs");

		// Calling the constructors
		Vehicle car = new Vehicle();
		// Vehicle bike=new Vehicle("KA4789",4);

		System.out.println(car.regNo);
		// System.out.println(bike.noOfWheels);

		System.out.println(" regNo:" + car.regNo + " No Of Wheels: " + car.noOfWheels + " fueltype " + car.fuelType);

		car.regNo = "KA45789";
		car.noOfWheels = 2;
		car.fuelType = "Petrol";
		System.out.println(" regNo:" + car.regNo + " No Of Wheels: " + car.noOfWheels + " fueltype " + car.fuelType);

		// Can use like this

		String regNo = "KA054321";
		int noOfWheels = 2;
		String fuelType = "Petrol";
		Vehicle bike = new Vehicle(regNo, noOfWheels, fuelType);
		// Vehicle bike=new Vehicle("KA054789",2,"Petrol");//Assigning the values to
		// instances

		System.out.println("regno:" + bike.regNo + "noOFwheels:" + bike.noOfWheels + "fueltype" + bike.fuelType);

		Vehicle truck = new Vehicle("KA47896");
		System.out.println("regno:" + truck.regNo + "noOFwheels:" + truck.noOfWheels + "fueltype" + truck.fuelType);

		System.out.println("End of Propgram");

	}

}
