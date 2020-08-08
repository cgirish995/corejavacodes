package com.up.downcasting;

public class Tester {

	public static void main(String[] args) {
		
		Transport trans = new Transport();
		System.out.println("The Value of a: " + trans.a);
		trans.travelling();//we get as: Travelling from one place to another
		mymethod(trans);
		
		RoadwayTransport rdtrans = new RoadwayTransport();
		System.out.println("Value of a in childclass: " +rdtrans.a);
		System.out.println("Value of a in childclass: " +rdtrans.b);
//Here we get a and b equals to Zero because we are because In RoadwayTransport we are not assigned a and b so we get default values
		
		rdtrans.travelling();//child class: we get as:Road way travelling		
		rdtrans.road(); //child class method
		
		mymethod(rdtrans);
		
		
		
//Converting child class object into parent class called Upcasting	
//Here RoadwayTransport is child class
//Travelling is parent class 
//so RoadwayTransport() is converting to Transport ctrans	
		
		
		Transport ctrans  = new RoadwayTransport();//Auto-Upcasting
		System.out.println("The value of a during upcasting " + ctrans.a);
				
		ctrans.travelling();//Overriding method is still called at Runtime 

//When Upcasting is done , we can only access Parent class,fields and Methods like int a and travelling();
		
		
		
//Downcasting:Converting parent class into child class 	
//Downcasting is not supported in java gives Runtime Exception
	/*RoadwayTransport crdtrans	= (RoadwayTransport) new Transport();
		
		crdtrans.a=100;
		crdtrans.travelling();
		
		crdtrans.b=10;
		crdtrans.road();
		
	}
	*/
	mymethod(ctrans);
		
	}
	
	static void mymethod(Transport trans) {
		System.out.println("Received :" +trans.toString());
		System.out.println("Hashcode :" +trans.hashCode());
}

}
