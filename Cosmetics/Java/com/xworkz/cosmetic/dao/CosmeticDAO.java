package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {

	boolean save(CosmeticDTO dto);

	CosmeticDTO findBrand(String brand);

	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);

	boolean updatePriceByBrandAndype(double price, String brand, CosmeticType cosmeticType);

	boolean deleteByBrand(String brand);

	void deleteAll();

	List<CosmeticDTO> getAll();

	int totalSize();

}
