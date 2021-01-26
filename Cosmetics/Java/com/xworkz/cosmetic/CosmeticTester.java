package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		
		CosmeticDTO dto1 = new CosmeticDTO();
		dto1.setBrand("parker");
		dto1.setCosmeticshades(CosmeticShades.BROWN);
		dto1.setCosmeticType(CosmeticType.LIPSTICK);
		dto1.setPrice(499l);
		dto1.setQuantity(1);

		
		CosmeticDTO dto2 = new CosmeticDTO();
		dto2.setBrand("lakme");
		dto2.setCosmeticshades(CosmeticShades.BLUE);
		dto2.setCosmeticType(CosmeticType.TONER);
		dto2.setPrice(120l);
		dto2.setQuantity(1);
		
		CosmeticDTO dto3 = new CosmeticDTO();
		dto2.setBrand("Maybelline");
		dto2.setCosmeticshades(CosmeticShades.BLACK);
		dto2.setCosmeticType(CosmeticType.TONER);
		dto2.setPrice(120l);
		dto2.setQuantity(1);
		
		
		
	
		CosmeticDAO dto = new CosmeticDAOImpl();
		dto.save(dto1);
		dto.save(dto2);
		dto.save(dto3);
		
		//CosmeticDTO dto3 = new CosmeticDTO("Parker",CosmeticType.LIPSTICK,250,CosmeticShades.BROWN,2);
		
		
		
		
		
		
		
		//cosmeticDAO.save(dto3);
		
		

	}

}
