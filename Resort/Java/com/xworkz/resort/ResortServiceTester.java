package com.xworkz.resort;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.servicedao.ServiceDAO;
import com.xworkz.resort.servicedao.ServiceDAOImpl;

public class ResortServiceTester {

	public static void main(String[] args) {

		ResortDTO resortDTO = new ResortDTO();
		resortDTO.setLocation("Madkeri");
		resortDTO.setName("Club_Mahindra");
		resortDTO.setPricePerHead(2100);
		resortDTO.setPhoneNo(8553651681l);
		resortDTO.setManagerName("Mymanagerwer");
		resortDTO.setNoOfEmployees(5);
		
		ResortDTO resortDTO2 = new ResortDTO();
		resortDTO2.setLocation("coorg");
		resortDTO2.setName("Bif_place");
		resortDTO2.setPricePerHead(2100);
		resortDTO2.setPhoneNo(8553651681l);
		resortDTO2.setManagerName("Mymanagerwer");
		resortDTO2.setNoOfEmployees(5);

		ResortDAO dao = new ResortDAOImpl();

		ServiceDAO serviceDAOImpl = new ServiceDAOImpl(dao);

		serviceDAOImpl.validateAndSave(resortDTO);
		serviceDAOImpl.validateAndSave(resortDTO2);
				
		
//		boolean updateLocationByName = serviceDAOImpl.updateLocationByName("Coorg", "Club_Mahindra");
//		System.out.println(updateLocationByName);
		
//		boolean updateLocationByNameandRating = serviceDAOImpl.updateLocationByNameandRating("Dandehli", "Club_Mahindra", 5);
//		System.out.println(updateLocationByNameandRating);
		
//		boolean deleteByNameAndLocation = serviceDAOImpl.deleteByNameAndLocation("Club_Mahindra", "Madkeri");
//		System.out.println(deleteByNameAndLocation);
		
		int totalResortSize = serviceDAOImpl.totalResortSize();
		System.out.println(totalResortSize);
		
		List<ResortDTO> listOfCollections = serviceDAOImpl.getAll();
		listOfCollections.forEach(s->System.out.println(s));
		
		
	}

}
