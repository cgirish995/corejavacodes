package com.xworkz.school.dto;

public class SchoolDTO {

	private String nameOfTheSchool;
	private int noOfStudents;
	private String address;

	public SchoolDTO() {

	}

	/**
	 * @param nameOfTheSchool
	 * @param noOfStudents
	 * @param address
	 */
	public SchoolDTO(String nameOfTheSchool, int noOfStudents, String address) {
		super();
		this.nameOfTheSchool = nameOfTheSchool;
		this.noOfStudents = noOfStudents;
		this.address = address;
	}

	/**
	 * @return the nameOfTheSchool
	 */
	public String getNameOfTheSchool() {
		return nameOfTheSchool;
	}

	/**
	 * @param nameOfTheSchool
	 *            the nameOfTheSchool to set
	 */
	public void setNameOfTheSchool(String nameOfTheSchool) {
		this.nameOfTheSchool = nameOfTheSchool;
	}

	/**
	 * @return the noOfStudents
	 */
	public int getNoOfStudents() {
		return noOfStudents;
	}

	/**
	 * @param noOfStudents
	 *            the noOfStudents to set
	 */
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SchoolDTO [nameOfTheSchool=" + nameOfTheSchool + ", noOfStudents=" + noOfStudents + ", address="
				+ address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("Object is null");
			return false;
		}

		if (obj instanceof SchoolDTO) {
			SchoolDTO casted = (SchoolDTO) obj;
			if (this.nameOfTheSchool != null && this.address != null) {
				if (this.nameOfTheSchool.equals(casted.nameOfTheSchool)) {
					System.out.println("School name got Matched ");
					return true;
				}
			}

		}
		System.out.println("School name is not matched ");
		return false;
	}

}
