package com.xworkz.resort.servicedao;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ServiceDAOImpl implements ServiceDAO {

	private ResortDAO resortDAO;

	public ServiceDAOImpl(ResortDAO resortDAO) {
		this.resortDAO = resortDAO;
	}

	@Override
	public boolean validateAndSave(ResortDTO resortDTO) {
		boolean validData = false;
		if (resortDTO != null) {
			String locations = resortDTO.getLocation().replaceAll("[^a-zA-Z0-9][0-9]", " ");
			if (locations != null && !locations.isEmpty() && !locations.contains(" ") && locations.length() >= 3
					&& locations.length() <= 15) {
				System.out.println("Valid Location");
				validData = true;
			} else {
				System.out.println("Invalid Location");
				validData = false;
			}

			String name = resortDTO.getName();
			if (validData && name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3
					&& name.length() <= 15) {
				System.out.println("Valid name");
				validData = true;
			} else {
				System.out.println("Invalid name");
				validData = false;
			}

			double pricePerHead = resortDTO.getPricePerHead();

			if (validData && pricePerHead <= 2500 && pricePerHead > 999) {
				System.out.println("Valid price");
				validData = true;
			} else {
				System.out.println("InValid price");
				validData = false;
			}

			float ratings = resortDTO.getRatings();
			if (validData && ratings >= 0 && ratings <= 5) {
				System.out.println("Valid ratings");
				validData = true;
			} else {
				System.out.println("InValid ratings");
				validData = false;
			}

			long phoneNo = resortDTO.getPhoneNo();
			if (validData && phoneNo > 6999999999l && phoneNo <= 9000000000l) {
				System.out.println("Valid phoneNo");
				validData = true;
			} else {
				System.out.println("Invalid phoneNo");
				validData = false;
			}

			String managerName = resortDTO.getManagerName();
			if (validData && managerName != null && !managerName.isEmpty() && !managerName.contains(" ")
					&& managerName.length() >= 3 && managerName.length() <= 12) {
				System.out.println("Valid managerName");
				validData = true;
			} else {
				System.out.println("Invalid managerName");
				validData = false;
			}

			int noOfEmployees = resortDTO.getNoOfEmployees();
			if (validData && noOfEmployees >= 5 && noOfEmployees <= 25) {
				System.out.println("valid number on Employees");
				validData = true;
			} else {
				System.out.println("Invalid number of Employees");
				validData = false;
			}

			if (validData) {
				System.out.println("Dto is valid can save");
				resortDAO.save(resortDTO);
			} else {
				System.out.println("dto is invalid cannot save");
			}

		} else {
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public boolean updateLocationByName(String location, String resortName) {
		System.out.println("Invoked service updateLocationByName");
		System.out.println("Invoked location" + location);
		System.out.println("Invoked resortName" + resortName);
		if (resortName != null && !resortName.contains(" ") && !resortName.isEmpty()) {
			return this.resortDAO.updateLocationByName(location, resortName);

		}

		return false;

	}

	@Override
	public boolean updateLocationByNameandRating(String location, String resortName, float rating) {
		System.out.println("Imvoked LocationByNameandRating");
		System.out.println("location" + location);
		System.out.println("name" + resortName);
		System.out.println("rating" + rating);
		if (resortName != null && !resortName.contains(" ") && !resortName.isEmpty()) {
			return this.resortDAO.updateLocationByNameandRating(location, resortName, rating);

		}

		return false;

	}

	@Override
	public boolean deleteByNameAndLocation(String resortName, String location) {
		System.out.println("Imvoked deleteByNameAndLocation");
		System.out.println("name" + resortName);
		System.out.println("location" + location);
		if (resortName != null && !resortName.contains(" ") && !resortName.isEmpty()) {
			return this.resortDAO.deleteByNameAndLocation(resortName, location);
		}

		return false;

	}

	@Override
	public int totalResortSize() {

		return this.resortDAO.totalResortSize();
	}

	@Override
	public List<ResortDTO> getAll() {

		return this.resortDAO.getAll();
	}

}
