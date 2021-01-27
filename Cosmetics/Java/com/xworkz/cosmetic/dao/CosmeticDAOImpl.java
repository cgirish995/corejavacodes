package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> database;

	public CosmeticDAOImpl() {
		this.database = new ArrayList<CosmeticDTO>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		// System.out.println("Invoked save method");
		boolean added = false;
		boolean contains = this.database.contains(dto);
		if (!contains) {
			added = this.database.add(dto);
		}
		if (added) {
			System.out.println("Cosmetic added " + dto);
		} else {
			System.out.println("Cosmetic already exist");
		}

		return added;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("Invoked updatePriceAndQuantityByBrand");
		System.out.println("price" + price);
		System.out.println("quantity" + quantity);
		System.out.println("brand" + brand);
		ListIterator<CosmeticDTO> listIterator = database.listIterator();
		while (listIterator.hasNext()) {
			CosmeticDTO listDto = listIterator.next();
			if (listDto.getBrand() != null) {
				if (listDto.getBrand().equals(brand)) {
					listDto.setPrice(price);
					listDto.setQuantity(quantity);
					System.out.println("Updated sucessfully");
					break;
				}
				System.out.println("not updated sucessfully");
				return true;
			}
	
		}
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndype(double price, String brand, CosmeticType cosmeticType) {

		System.out.println("Invoked updatePriceByBrandAndype");
		System.out.println("price" + price);
		System.out.println("brand" + brand);
		System.out.println("CosmeticType" + cosmeticType);
		ListIterator<CosmeticDTO> listIterator = database.listIterator();
		while (listIterator.hasNext()) {
			CosmeticDTO listDto = listIterator.next();
			if (listDto.getBrand() != null && listDto.getCosmeticType() != null) {
				if (listDto.getBrand().equals(brand) && listDto.getCosmeticType().equals(cosmeticType)) {
					listDto.setPrice(price);
					System.out.println("Updated sucessfully");
				}else{
					System.out.println("not updated sucessfully");
					return true;
				}
				
			}
		}
		
		return false;
	}
}	
