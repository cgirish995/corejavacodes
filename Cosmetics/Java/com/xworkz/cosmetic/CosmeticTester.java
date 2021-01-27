package com.xworkz.cosmetic;

import java.util.List;

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
		dto2.setBrand("Himalaya");
		dto2.setCosmeticshades(CosmeticShades.BLUE);
		dto2.setCosmeticType(CosmeticType.LIPSTICK);
		dto2.setPrice(120l);
		dto2.setQuantity(1);

		CosmeticDTO dto3 = new CosmeticDTO();
		dto3.setBrand("Maybelline");
		dto3.setCosmeticshades(CosmeticShades.BLUE);
		dto3.setCosmeticType(CosmeticType.TONER);
		dto3.setPrice(120l);
		dto3.setQuantity(1);

		CosmeticDAO dao = new CosmeticDAOImpl();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);

		// CosmeticDTO findBrand = dao.findBrand("Mabelline");
		// System.out.println(findBrand);

		// boolean updatePriceAndQuantityByBrand =
		// dao.updatePriceAndQuantityByBrand(250, 2, "prker");
		// System.out.println(updatePriceAndQuantityByBrand);

		// boolean updatePriceByBrandAndype = dao.updatePriceByBrandAndype(900,
		// "parker", CosmeticType.LIPSTICK);
		// System.out.println(updatePriceByBrandAndype);

		// boolean deleteByBrand = dao.deleteByBrand("parker");
		// System.out.println(deleteByBrand);

		// dao.deleteAll();

		List<CosmeticDTO> all = dao.getAll();
		System.out.println(all);

		int totalSize = dao.totalSize();
		System.out.println("Total size is " + totalSize);

	}

}
