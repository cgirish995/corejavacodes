package com.xworkz.cosmetic.servicedao;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class ServiceDAOImpl implements ServiceDAO {

	private CosmeticDAO cosmeticDAO;
	
	public ServiceDAOImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("Created ServiceDAOImpl");
		this.cosmeticDAO = cosmeticDAO;
		
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is null , add data");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("Brand is valid");
				validData = true;
			} else {
				System.out.println("Brand is Invalid");
				validData = false;
			}

			CosmeticType cosmeticType = cosmeticDTO.getCosmeticType();
			if (validData && cosmeticType != null) {
				System.out.println("cosmeticType is valid");
				validData = true;
			} else {
				System.out.println("cosmeticType is  Invalid");
				validData = false;
			}

			CosmeticShades cosmeticshades = cosmeticDTO.getCosmeticshades();
			if (validData && cosmeticshades != null) {
				System.out.println("cosmeticshades is valid");
				validData = true;
			} else {
				System.out.println("cosmeticshades is Invalid");
				validData = false;
			}

			double price = cosmeticDTO.getPrice();
			if (validData && price >= 0) {
				System.out.println("Price is valid");
				validData = true;
			} else {
				System.out.println("Price is Invalid");
				validData = false;
			}

			int quantity = cosmeticDTO.getQuantity();
			if (validData && quantity > 0 && quantity <= 100) {
				System.out.println("quantity is valid");
				validData = true;
			} else {
				System.out.println("quantity is  Invalid");
				validData = false;
			}
			
			if(validData){
				// CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
				cosmeticDAO.save(cosmeticDTO);
			}
			
		} else {
			System.out.println("enter valid data ");
		}
		return false;
	}
	
	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticDAO.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}

	}
	
	@Override
	public int cosmeticsSize() {
	
		return this.cosmeticDAO.totalSize();
	}

}
