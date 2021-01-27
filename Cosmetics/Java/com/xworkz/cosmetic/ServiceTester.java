package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.servicedao.ServiceDAOImpl;

public class ServiceTester {

	public static void main(String[] args) {
		
		
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setCosmeticshades(CosmeticShades.BLACK);
		cosmeticDTO.setCosmeticType(CosmeticType.TONER);
		cosmeticDTO.setPrice(250);
		cosmeticDTO.setQuantity(100);
		
		ServiceDAOImpl serviceDAOImpl = new ServiceDAOImpl();
		serviceDAOImpl.validateAndSave(cosmeticDTO);
		
		

	}

}
