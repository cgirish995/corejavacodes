package com.xworkz.cosmetic.servicedao;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class ServiceDAOImpl implements ServiceDAO {

	public ServiceDAOImpl() {
		System.out.println("Created ServiceDAOImpl");
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validate = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is null , add data");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("Brand is valid");
				validate = true;
			} else {
				System.out.println("Brand is Invalid");
				validate = false;
			}

			CosmeticType cosmeticType = cosmeticDTO.getCosmeticType();
			if (validate && cosmeticType != null) {
				System.out.println("cosmeticType is valid");
				validate = true;
			} else {
				System.out.println("cosmeticType is  Invalid");
				validate = false;
			}

			CosmeticShades cosmeticshades = cosmeticDTO.getCosmeticshades();
			if (validate && cosmeticshades != null) {
				System.out.println("cosmeticshades is valid");
				validate = true;
			} else {
				System.out.println("cosmeticshades is Invalid");
				validate = false;
			}

			double price = cosmeticDTO.getPrice();
			if (validate && price >= 0) {
				System.out.println("Price is valid");
				validate = true;
			} else {
				System.out.println("Price is Invalid");
				validate = false;
			}

			int quantity = cosmeticDTO.getQuantity();
			if (validate && quantity > 0 && quantity <= 100) {
				System.out.println("quantity is valid");
				validate = true;
			} else {
				System.out.println("quantity is  Invalid");
				validate = false;
			}

		} else {
			System.out.println("enter valid data ");
		}
		return false;
	}

}
