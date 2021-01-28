package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
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
		
		CosmeticDAO dao = new CosmeticDAOImpl();
		
		
		ServiceDAOImpl serviceDAOImpl = new ServiceDAOImpl(dao);
		
		
		
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO();
		cosmeticDTO2.setBrand("parker");
		cosmeticDTO2.setCosmeticshades(CosmeticShades.BLACK);
		cosmeticDTO2.setCosmeticType(CosmeticType.TONER);
		cosmeticDTO2.setPrice(300);
		cosmeticDTO2.setQuantity(45);
		
		serviceDAOImpl.validateAndSave(cosmeticDTO);
		serviceDAOImpl.validateAndSave(cosmeticDTO2);
		
		System.out.println(serviceDAOImpl.cosmeticsSize());
		
		//serviceDAOImpl.deleteByBrand("parker");
		
		System.out.println(serviceDAOImpl.cosmeticsSize());
		
		
		
			
		
		

	}

}
