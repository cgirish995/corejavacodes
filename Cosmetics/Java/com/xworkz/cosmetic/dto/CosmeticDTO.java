package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private CosmeticType cosmeticType;
	private double price;
	private CosmeticShades cosmeticshades;
	private int quantity;

	public CosmeticDTO() {

	}

	/**
	 * @param brand
	 * @param cosmeticType
	 * @param price
	 * @param cosmeticshades
	 * @param quantity
	 */
	public CosmeticDTO(String brand, CosmeticType cosmeticType, double price, CosmeticShades cosmeticshades,
			int quantity) {
		super();
		this.brand = brand;
		this.cosmeticType = cosmeticType;
		this.price = price;
		this.cosmeticshades = cosmeticshades;
		this.quantity = quantity;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the cosmeticType
	 */
	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}

	/**
	 * @param cosmeticType
	 *            the cosmeticType to set
	 */
	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the cosmeticshades
	 */
	public CosmeticShades getCosmeticshades() {
		return cosmeticshades;
	}

	/**
	 * @param cosmeticshades
	 *            the cosmeticshades to set
	 */
	public void setCosmeticshades(CosmeticShades cosmeticshades) {
		this.cosmeticshades = cosmeticshades;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", cosmeticType=" + cosmeticType + ", price=" + price
				+ ", cosmeticshades=" + cosmeticshades + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}

		if (obj instanceof CosmeticDTO) {
			CosmeticDTO casted = (CosmeticDTO) obj;
			if (this.brand != null && this.cosmeticType != null) {
				if (this.brand.equals(casted.getBrand()) && this.cosmeticType.equals(casted.getCosmeticType())) {
					System.out.println("cosmetic are equal ");
					return true;
				}
				System.out.println(" cosmetic dto is not equal");
				return false;
			}

		}
		return false;

	}
}
