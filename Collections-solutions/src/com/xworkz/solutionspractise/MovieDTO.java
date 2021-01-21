package com.xworkz.solutionspractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MovieDTO {

	String name;
	double duration;
	double ratings;
	String generic;
	
	
	
	public MovieDTO(String name, double duration, double ratings, String generic) {
		super();
		this.name = name;
		this.duration = duration;
		this.ratings = ratings;
		this.generic = generic;
	}



	public String getName() {
		return name;
	}



	public double getDuration() {
		return duration;
	}



	public double getRatings() {
		return ratings;
	}



	public String getGeneric() {
		return generic;
	}



	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", duration=" + duration + ", ratings=" + ratings + ", generic=" + generic
				+ "]";
	}
	
	
		
		
		
	

}
