package com.xworkz.cosmetic.servicedao;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface ServiceDAO {
	
	boolean validateAndSave(CosmeticDTO cosmeticDTO);

	void deleteByBrand(String brand);
	
	int cosmeticsSize();
}
