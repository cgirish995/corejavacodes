package com.xworkz.school.dao;

import java.util.List;

import com.xworkz.school.dto.SchoolDTO;

public interface SchoolDAO {

	boolean save(SchoolDTO dto);

	SchoolDTO findSchoolName(String name);

	boolean updateSchoolAddressBySchoolName(String address, String name);

	boolean updateNoOfStudentsByNameAndAddress(String address, String name, int noOfStudents);

	boolean deleteByNameAndAddress(String name, String address);

	int totalSize();

	List<SchoolDTO> getAll();

	SchoolDTO getAllTheInformationUsingSchoolName(String name);

}
