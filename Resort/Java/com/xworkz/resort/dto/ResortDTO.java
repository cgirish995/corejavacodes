package com.xworkz.resort.dto;

public class ResortDTO {

	private String location;
	private String name;
	private double pricePerHead;
	private String managerName;
	private int noOfEmployees;
	private float ratings;
	private boolean poolExits;
	private int noOfRooms;
	private boolean offers;
	private long phoneNo;

	/**
	 * 
	 */
	public ResortDTO() {
		super();
	}

	/**
	 * @param location
	 * @param name
	 * @param pricePerHead
	 * @param managerName
	 */
	public ResortDTO(String location, String name, double pricePerHead, String managerName) {
		super();
		this.location = location;
		this.name = name;
		this.pricePerHead = pricePerHead;
		this.managerName = managerName;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
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
	 * @return the pricePerHead
	 */
	public double getPricePerHead() {
		return pricePerHead;
	}

	/**
	 * @param pricePerHead
	 *            the pricePerHead to set
	 */
	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName
	 *            the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * @return the noOfEmployees
	 */
	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * @param noOfEmployees
	 *            the noOfEmployees to set
	 */
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	/**
	 * @return the ratings
	 */
	public float getRatings() {
		return ratings;
	}

	/**
	 * @param ratings
	 *            the ratings to set
	 */
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	/**
	 * @return the poolExits
	 */
	public boolean isPoolExits() {
		return poolExits;
	}

	/**
	 * @param poolExits
	 *            the poolExits to set
	 */
	public void setPoolExits(boolean poolExits) {
		this.poolExits = poolExits;
	}

	/**
	 * @return the noOfRooms
	 */
	public int getNoOfRooms() {
		return noOfRooms;
	}

	/**
	 * @param noOfRooms
	 *            the noOfRooms to set
	 */
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	/**
	 * @return the offers
	 */
	public boolean isOffers() {
		return offers;
	}

	/**
	 * @param offers
	 *            the offers to set
	 */
	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	/**
	 * @return the phoneNo
	 */
	public long getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {

			System.out.println("Object is null");
		}

		if (obj instanceof ResortDTO) {
			ResortDTO casted = (ResortDTO) obj;
			if (this.name != null && this.location != null) {
				if (this.name.equals(casted.name) && this.location.equals(casted.location)) {
					System.out.println(" Resort name and Location matched");
					return true;
				} else {
					System.out.println("Resort name and Location is not matched");
					return false;
				}
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResortDTO [location=" + location + ", name=" + name + ", pricePerHead=" + pricePerHead
				+ ", managerName=" + managerName + ", noOfEmployees=" + noOfEmployees + ", ratings=" + ratings
				+ ", poolExits=" + poolExits + ", noOfRooms=" + noOfRooms + ", offers=" + offers + ", phoneNo="
				+ phoneNo + "]";
	}

}
