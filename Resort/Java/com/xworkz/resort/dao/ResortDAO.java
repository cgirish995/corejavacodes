package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {

	boolean save(ResortDTO dto);

	ResortDTO findResortName(String resortName);

	boolean updateLocationByName(String location, String resortName);

	boolean updateLocationByNameandRating(String location, String name, float rating);

	boolean deleteByNameAndLocation(String name, String location);

	int totalResortSize();

	List<ResortDTO> getAll();
	
	boolean addMultipleResorts(List<ResortDTO> dtos);

}
