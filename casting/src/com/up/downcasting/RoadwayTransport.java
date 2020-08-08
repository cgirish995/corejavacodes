package com.up.downcasting;

public class RoadwayTransport  extends Transport{
	
	int a;
	int b;
	
	@Override
	void travelling() {
		System.out.println("Road way travelling");
	}
	
	void road() {
		System.out.println("Require road");
	}

	public static void main(String[] args) {
		

	}

}

