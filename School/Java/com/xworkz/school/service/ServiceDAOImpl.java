package com.xworkz.school.service;

import com.xworkz.school.dao.SchoolDAO;
import com.xworkz.school.dto.SchoolDTO;

public class ServiceDAOImpl implements ServiceDAO {

	SchoolDAO schoolDAO;

	public ServiceDAOImpl(SchoolDAO schoolDAO) {
		this.schoolDAO = schoolDAO;
	}

	@Override
	public boolean ValidateAndSave(SchoolDTO dto) {
		boolean validate = false;
		if (dto != null) {
			String nameOfTheSchool = dto.getNameOfTheSchool();
			if (nameOfTheSchool != null && !nameOfTheSchool.isEmpty() && !nameOfTheSchool.contains(" ")) {
				System.out.println("Valid School Name");
				validate = true;
			} else {
				System.out.println("Invalid School name");
				validate = false;
			}

			String address = dto.getAddress();
			if (validate && address != null && !address.isEmpty() && !address.contains(" ")) {
				System.out.println("Valid address");
				validate = true;
			} else {
				System.out.println("Invalid Address");
				validate = false;
			}

			int noOfStudents = dto.getNoOfStudents();
			if (validate && noOfStudents > 0 && noOfStudents <= 500) {
				System.out.println("Valid number of Student");
				validate = true;
			} else {
				System.out.println("Invalid no of Student");
				validate = false;
			}

			if (validate) {
				System.out.println("dto is valid");
				schoolDAO.save(dto);
			} else {
				System.out.println("dto is not valid");
			}

		}

		return false;
	}

	@Override
	public boolean updateSchoolAddressBySchoolName(String address, String name) {
		System.out.println("Invoked updateSchoolAddressBySchoolName");
		System.out.println("address" + address);
		System.out.println("name" + name);
		if (address != null && !address.isEmpty() && !address.contains(" ") && name != null && !name.contains(" ")
				&& !name.isEmpty()) {

			return this.schoolDAO.updateSchoolAddressBySchoolName(address, name);
		}
		return false;
	}

	@Override
	public boolean updateNoOfStudentsByNameAndAddress(String address, String name, int noOfStudents) {

		System.out.println("Invoked updateNoOfStudentsByNameAndAddress");
		System.out.println("address " + address);
		System.out.println("name" + name);
		System.out.println("noOfStudents" + noOfStudents);
		if (address != null && !address.isEmpty() && !address.contains(" ") && name != null && !name.contains(" ")
				&& !name.isEmpty() && noOfStudents > 0 && noOfStudents <= 300) {
			return this.schoolDAO.updateNoOfStudentsByNameAndAddress(address, name, noOfStudents);
		}

		return false;
	}

}
