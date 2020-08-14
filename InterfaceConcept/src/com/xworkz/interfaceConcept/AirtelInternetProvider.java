package com.xworkz.interfaceConcept;

public abstract class AirtelInternetProvider  implements InternetProvider{
	
	@Override
	public void transmittingSpeed() {
		System.out.println("The maximum Tramsmitting speed is : 16Mbps");
	}
	
	void speed() {
		System.out.println("The speed is very fast");
	}
	
	
	 @Override
	public void connectivityType() {
		System.out.println("Connectivity type used is : Fibernet");                      
	}
	 
	 
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
