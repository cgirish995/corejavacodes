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
	public CosmeticDTO findBrand(String brand) {

		for (CosmeticDTO cosmeticdto : this.database) {
			String cosmeticdtobrand = cosmeticdto.getBrand();
			if (cosmeticdtobrand.equals(brand)) {
				System.out.println("Found brand");
				return cosmeticdto;
			}
		}
		return null;

	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand ");
		System.out.println("price" + price);
		System.out.println("quantity" + quantity);
		System.out.println("brand" + brand);
		CosmeticDTO findBrand = this.findBrand(brand);
		if (findBrand != null) {
			findBrand.setBrand(brand);
			System.out.println("Brand found ,  can update");
			return true;
		}
		System.out.println("Brand not found");
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndype(double price, String brand, CosmeticType cosmeticType) {
		System.out.println("invoked updatePriceByBrandAndype");
		System.out.println("price" + price);
		System.out.println("brand" + brand);
		System.out.println("cosmeticType" + cosmeticType);

		CosmeticDTO findBrand = this.findBrand(brand);
		if (findBrand != null) {
			findBrand.setBrand(brand);
			System.out.println("Brand found , can update");
			return true;
		}
		System.out.println("Brand not found , cannot  update");
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		System.out.println("Brand is " + brand);
		ListIterator<CosmeticDTO> listIterator = database.listIterator();
		while (listIterator.hasNext()) {
			CosmeticDTO element = listIterator.next();
			if (element.getBrand().equals(brand)) {
				listIterator.remove();
				System.out.println("element is removed");
				return true;
			}

		}
		System.out.println("element is not removed");
		return false;
	}

	@Override
	public void deleteAll() {
		System.out.println("Deleting all collections");
		database.clear();

	}

	@Override
	public List<CosmeticDTO> getAll() {

		return this.database;
	}

	@Override
	public int totalSize() {

		return this.database.size();
	}

}
