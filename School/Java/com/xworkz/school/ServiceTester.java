package com.xworkz.school;

import com.xworkz.school.dao.SchoolDAO;
import com.xworkz.school.dao.SchoolDAOImpl;
import com.xworkz.school.dto.SchoolDTO;
import com.xworkz.school.service.ServiceDAO;
import com.xworkz.school.service.ServiceDAOImpl;

public class ServiceTester {

	public static void main(String[] args) {

		SchoolDTO schoolDTO = new SchoolDTO();
		schoolDTO.setNameOfTheSchool("st,jonhs");
		schoolDTO.setAddress("vijayanagar");
		schoolDTO.setNoOfStudents(200);

		SchoolDAO schoolDAOImpl = new SchoolDAOImpl();

		ServiceDAO serviceDAOImpl = new ServiceDAOImpl(schoolDAOImpl);
		serviceDAOImpl.ValidateAndSave(schoolDTO);

		// boolean updateSchoolAddressBySchoolName =
		// serviceDAOImpl.updateSchoolAddressBySchoolName("vijayanagar",
		// "st,jonhs");
		// System.out.println(updateSchoolAddressBySchoolName);

		boolean updateNoOfStudentsByNameAndAddress = serviceDAOImpl.updateNoOfStudentsByNameAndAddress("vijayanagar",
				"st,jonhs", 250);
		System.out.println(updateNoOfStudentsByNameAndAddress);

	}

}
