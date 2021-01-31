package com.xworkz.resort;

import java.util.List;

import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {

	public static void main(String[] args) {

		ResortDTO resortDTO = new ResortDTO("Madkeri", "Club Mahindra", 3162, "Kavinder Singh");
		resortDTO.setRatings(5);

		ResortDAOImpl resortDAOImpl = new ResortDAOImpl();
		resortDAOImpl.save(resortDTO);
		
		ResortDTO resortDTO2 = new ResortDTO("Bangalore", "Happy Home Resort",  6500, "NA");
		resortDAOImpl.save(resortDTO2);
		
		
//		boolean updateLocationByName = resortDAOImpl.updateLocationByName("coorg", "Happy Home Resort");
//		System.out.println(updateLocationByName);
		
		
//		boolean updateLocationByNameandRating = resortDAOImpl.updateLocationByNameandRating("coorg", "Club Mahindra", 6);
//		System.out.println(updateLocationByNameandRating);
		
		
	
		int totalResortSize = resortDAOImpl.totalResortSize();
		System.out.println(totalResortSize);
		
//		boolean deleteByNameAndLocation = resortDAOImpl.deleteByNameAndLocation("Club Mahindra", "Madkeri");
//		System.out.println(deleteByNameAndLocation);
		
		
		int totalResortSize2 = resortDAOImpl.totalResortSize();
		System.out.println(totalResortSize2);
		
		
		List<ResortDTO> all = resortDAOImpl.getAll();
		all.forEach(s->System.out.println(s));
		
		
		boolean addMultipleResorts = resortDAOImpl.addMultipleResorts(all);
		System.out.println(addMultipleResorts);
		
		
		
		
		
		
	}

}
