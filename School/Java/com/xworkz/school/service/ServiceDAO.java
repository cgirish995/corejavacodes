package com.xworkz.school.service;

import java.util.List;

import com.xworkz.school.dto.SchoolDTO;

public interface ServiceDAO {

	boolean ValidateAndSave(SchoolDTO dto);

	SchoolDTO findSchoolName(String name);

	boolean updateSchoolAddressBySchoolName(String address, String name);

	boolean updateNoOfStudentsByNameAndAddress(String address, String name, int noOfStudents);

	List<SchoolDTO> getAll();

	SchoolDTO getAllTheInformationUsingSchoolName(String name);

}
