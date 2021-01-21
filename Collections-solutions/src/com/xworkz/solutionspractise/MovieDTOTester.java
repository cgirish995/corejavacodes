package com.xworkz.solutionspractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MovieDTOTester {

	public static void main(String[] args) {
		
		MovieDTO movieDTO1 = new MovieDTO("KGF" , 5 , 3 ,"Acton");
		MovieDTO movieDTO2 = new MovieDTO("BahuBali" , 4.5 , 3.2 ,"Action Thriller");
		MovieDTO movieDTO3 = new MovieDTO("Vare vah" , 3.5 , 5 ,"Comedy");
		MovieDTO movieDTO4 = new MovieDTO("Kempegowda" , 4 , 3 ,"Action Crime");
		MovieDTO movieDTO5 = new MovieDTO("Tarle nam maga" , 5 , 5 ,"Comedy thriller");

		Collection<MovieDTO> movies = new ArrayList();
		movies.add(movieDTO1);
		movies.add(movieDTO2);
		movies.add(movieDTO3);
		movies.add(movieDTO4);
		movies.add(movieDTO5);
		
		
		
		Iterator<MovieDTO> iterator = movies.iterator();
			while(iterator.hasNext()){
				MovieDTO listOfMovie = iterator.next();
				if(listOfMovie.getDuration()>4){
					iterator.remove();
				}
			}
		
			
			
			movies.forEach(s->System.out.println(s));
		
	}

}
