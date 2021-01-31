package com.xworkz.resort.servicedao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ServiceDAO {
	
	boolean validateAndSave(ResortDTO resortDTO);
	
	boolean updateLocationByName(String location, String resortName);
	
	boolean updateLocationByNameandRating(String location, String resortName, float rating);
	
	boolean deleteByNameAndLocation(String resortName, String location);
	
	int totalResortSize();
	
	List<ResortDTO> getAll();

}
