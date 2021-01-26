package com.xworkx.license.dto;

import java.time.LocalDate;
import java.util.Date;

import com.xworkx.license.consonants.BoodGroup;
import com.xworkx.license.consonants.Gender;

public class CommonDTO {
	
	
	private String name;
	private int age;
	private AddressDTO addressDTO;
	private Date DOB;
	private long mobileNo;
	private BoodGroup bloodGroup;
	private Gender gender;
	
	
	public CommonDTO(){
		
	}


	/**
	 * @param name
	 * @param age
	 * @param addressDTO
	 * @param dOB
	 * @param mobileNo
	 * @param bloodGroup
	 * @param gender
	 */
	public CommonDTO(String name, int age, AddressDTO addressDTO, Date dOB, long mobileNo, BoodGroup bloodGroup,
			Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.addressDTO = addressDTO;
		DOB = dOB;
		this.mobileNo = mobileNo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the addressDTO
	 */
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}


	/**
	 * @param addressDTO the addressDTO to set
	 */
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}


	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}


	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	/**
	 * @return the mobileNo
	 */
	public long getMobileNo() {
		return mobileNo;
	}


	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	/**
	 * @return the bloodGroup
	 */
	public BoodGroup getBloodGroup() {
		return bloodGroup;
	}


	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(BoodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}


	
	/**
	 * @param name
	 * @param age
	 * @param addressDTO
	 * @param dOB
	 * @param mobileNo
	 * @param bloodGroup
	 * @param gender
	 */
	


 
	
	
	
	
	
	
	
}
