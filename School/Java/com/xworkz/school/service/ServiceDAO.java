package com.xworkz.school.service;

import com.xworkz.school.dto.SchoolDTO;

public interface ServiceDAO {

	boolean ValidateAndSave(SchoolDTO dto);

	boolean updateSchoolAddressBySchoolName(String address, String name);

	boolean updateNoOfStudentsByNameAndAddress(String address, String name, int noOfStudents);

}
