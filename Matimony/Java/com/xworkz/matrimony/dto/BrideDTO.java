package com.xworkz.matrimony.dto;

public class BrideDTO {

	private String name;
	private String caste;
	private String city;
	private int age;
	private String hobbies;
	private String qualification;
	private double height;
	private double weight;
	private String phone_number;

	public BrideDTO() {

	}

	/**
	 * @param name
	 * @param caste
	 * @param city
	 * @param age
	 * @param hobbies
	 * @param qualification
	 * @param height
	 * @param weight
	 * @param phone_number
	 */
	public BrideDTO(String name, String caste, String city, int age, String hobbies, String qualification,
			double height, double weight, String phone_number) {
		super();
		this.name = name;
		this.caste = caste;
		this.city = city;
		this.age = age;
		this.hobbies = hobbies;
		this.qualification = qualification;
		this.height = height;
		this.weight = weight;
		this.phone_number = phone_number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the caste
	 */
	public String getCaste() {
		return caste;
	}

	/**
	 * @param caste
	 *            the caste to set
	 */
	public void setCaste(String caste) {
		this.caste = caste;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the hobbies
	 */
	public String getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies
	 *            the hobbies to set
	 */
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification
	 *            the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number
	 *            the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BrideDTO [name=" + name + ", caste=" + caste + ", city=" + city + ", age=" + age + ", hobbies="
				+ hobbies + ", qualification=" + qualification + ", height=" + height + ", weight=" + weight
				+ ", phone_number=" + phone_number + "]";
	}

}
