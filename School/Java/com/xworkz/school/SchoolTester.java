package com.xworkz.school;

import com.xworkz.school.dao.SchoolDAO;
import com.xworkz.school.dao.SchoolDAOImpl;
import com.xworkz.school.dto.SchoolDTO;

public class SchoolTester {

	public static void main(String[] args) {

		SchoolDTO schoolDTO1 = new SchoolDTO();
		schoolDTO1.setNameOfTheSchool("St,Johns");
		schoolDTO1.setAddress("vijayanagar");

		SchoolDTO schoolDTO2 = new SchoolDTO();
		schoolDTO2.setNameOfTheSchool("cambridge");
		schoolDTO2.setAddress("vijayanagar");

		SchoolDAO schoolDAOImpl = new SchoolDAOImpl();
		schoolDAOImpl.save(schoolDTO1);
		schoolDAOImpl.save(schoolDTO2);

		// boolean updateSchoolAddressBySchoolName =
		// schoolDAOImpl.updateSchoolAddressBySchoolName("kengeri", "St,Johns");
		// System.out.println(updateSchoolAddressBySchoolName);

		boolean updateNoOfStudentsByNameAndAddress = schoolDAOImpl.updateNoOfStudentsByNameAndAddress("vijayanagar",
				"cambridge", 50);
		System.out.println(updateNoOfStudentsByNameAndAddress);

		int totalSize = schoolDAOImpl.totalSize();
		System.out.println(totalSize);

		boolean deleteByNameAndAddress = schoolDAOImpl.deleteByNameAndAddress("cambridge", "vijayanagar");
		System.out.println(deleteByNameAndAddress);

		int totalSize2 = schoolDAOImpl.totalSize();
		System.out.println(totalSize2);

	}

}
