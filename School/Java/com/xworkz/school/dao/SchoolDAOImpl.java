package com.xworkz.school.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.school.dto.SchoolDTO;

public class SchoolDAOImpl implements SchoolDAO {

	private List<SchoolDTO> schoollist;

	public SchoolDAOImpl() {
		this.schoollist = new ArrayList<>();
	}

	@Override
	public boolean save(SchoolDTO dto) {
		System.out.println("Invoked save Method");
		boolean added = false;
		boolean contains = this.schoollist.contains(dto);
		if (!contains) {
			added = this.schoollist.add(dto);
		}
		if (added) {
			System.out.println("school added :" + dto);
		} else {
			System.out.println("School exist already ");
		}
		return added;
	}

	@Override
	public SchoolDTO findSchoolName(String name) {
		System.out.println("Invoked findSchoolName");
		for (SchoolDTO listofschool : schoollist) {
			String nameOfTheSchool = listofschool.getNameOfTheSchool();
			if (nameOfTheSchool.equals(name)) {
				return listofschool;
			}
		}
		return null;
	}

	@Override
	public boolean updateSchoolAddressBySchoolName(String address, String name) {
		System.out.println("Invoked updateSchoolAddressBySchoolName");
		SchoolDTO findSchoolName = this.findSchoolName(name);
		if (findSchoolName != null) {
			findSchoolName.setAddress(address);
			System.out.println("School found can update address of school");
			return true;
		}
		System.out.println("School not found cannot update");
		return false;
	}

	@Override
	public boolean updateNoOfStudentsByNameAndAddress(String address, String name, int noOfStudents) {

		System.out.println("invoked updateNoOfStudentsByNameAndAddress");
		SchoolDTO findSchoolName = this.findSchoolName(name);
		if (findSchoolName != null) {
			if (findSchoolName.getNameOfTheSchool().equals(name) && findSchoolName.getAddress().equals(address)) {
				findSchoolName.setNoOfStudents(noOfStudents);
				System.out.println("School name and adrress found can update no of students");
				return true;
			}
		}
		System.out.println("school name and address is not matching ");
		return false;
	}

	@Override
	public boolean deleteByNameAndAddress(String name, String address) {
		System.out.println("Invoked deleteByNameAndAddress");
		ListIterator<SchoolDTO> listIterator = this.schoollist.listIterator();
		while (listIterator.hasNext()) {
			SchoolDTO list = listIterator.next();
			if (list.getNameOfTheSchool().equals(name) && list.getAddress().equals(address)) {
				listIterator.remove();
				System.out.println("Name and address found can delete ");
				return true;
			}
		}
		System.out.println("Name and address not matching cannot delete");
		return false;

	}

	@Override
	public int totalSize() {
		System.out.println("the total size is ");
		return this.schoollist.size();
	}

	@Override
	public List<SchoolDTO> getAll() {

		return this.schoollist;
	}

	@Override
	public SchoolDTO getAllTheInformationUsingSchoolName(String name) {
		System.out.println("Invoked getAllTheInformationUsingSchoolName");
		System.out.println("name " + name);
		for (SchoolDTO school : schoollist) {
			String nameOfTheSchool = school.getNameOfTheSchool();
			if (nameOfTheSchool != null && nameOfTheSchool.equals(name)) {
				System.out.println("Name of the school found");
				return school;
			}

		}
		System.out.println("Name of the school not found");
		return null;
	}

}
