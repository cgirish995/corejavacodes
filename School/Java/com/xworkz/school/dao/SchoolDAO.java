package com.xworkz.school.dao;

import com.xworkz.school.dto.SchoolDTO;

public interface SchoolDAO {

	boolean save(SchoolDTO dto);

	SchoolDTO findSchoolName(String name);

	boolean updateSchoolAddressBySchoolName(String address , String name);

	boolean updateNoOfStudentsByNameAndAddress(String address , String name , int noOfStudents);

	boolean deleteByNameAndAddress(String name ,String address);
	
	int totalSize();
	
}
