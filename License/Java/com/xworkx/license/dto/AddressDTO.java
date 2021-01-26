package com.xworkx.license.dto;

public class AddressDTO {
	
	private int doorNo;
	private String street;
	private int pincode;
	private String area;
	private String city;
	private String state;
	private String buildingName;
	

	
	
	
	public AddressDTO(int doorNo, String street, int pincode, String area, String city, String state,
			String buildingName) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
		this.buildingName = buildingName;
	}




	/**
	 * @return the doorNo
	 */
	public int getDoorNo() {
		return doorNo;
	}

	/**
	 * @param doorNo the doorNo to set
	 */
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	
	

}
