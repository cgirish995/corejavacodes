package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl  implements CosmeticDAO{

	
	private List<CosmeticDTO> database;
	
	
	public CosmeticDAOImpl(){
		this.database = new ArrayList<CosmeticDTO>();
	}
	
	
	
	@Override
	public boolean save(CosmeticDTO dto) {
		//System.out.println("Invoked save method");
		boolean added = false;
		 boolean contains = this.database.contains(dto);
		if(!contains){
			 added = this.database.add(dto);
		}
			 if(added){
					System.out.println("Cosmetic added " +dto);
				}else{
					System.out.println("Cosmetic already exist");
				}
		
		return added;
	}



	
	
	
	
	
	
	

}
