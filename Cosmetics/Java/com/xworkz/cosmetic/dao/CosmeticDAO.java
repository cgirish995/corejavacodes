package com.xworkz.cosmetic.dao;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
	
	
  boolean save(CosmeticDTO dto);
  
  boolean updatePriceAndQuantityByBrand(double price ,int quantity ,String brand);
  
  boolean updatePriceByBrandAndype(double price , String Brand , CosmeticType cosmeticType);
}
