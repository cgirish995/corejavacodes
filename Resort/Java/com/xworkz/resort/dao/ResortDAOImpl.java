package com.xworkz.resort.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl() {
		this.resortList = new ArrayList<>();
	}

	@Override
	public boolean save(ResortDTO dto) {
		boolean added = false;
		boolean contains = this.resortList.contains(dto);
		if (!contains) {
			added = this.resortList.add(dto);
		}
		if (added) {
			System.out.println("resort added : " + dto);
		} else {
			System.out.println("Resort is already exist");
		}

		return added;
	}

	@Override
	public ResortDTO findResortName(String resortName) {
		System.out.println("Invoke LoactionName");
		System.out.println("location" + resortName);
		for (ResortDTO resortList : this.resortList) {
			String resortNames = resortList.getName();
			if (resortNames.equals(resortName)) {
				System.out.println("Found Resort Name");
				return resortList;
			}

		}

		return null;
	}

	@Override
	public boolean updateLocationByName(String location, String resortName) {
		System.out.println("invoke updateLocationByName");
		System.out.println("location" + location);
		System.out.println("name" + resortName);

		ResortDTO findResortName = this.findResortName(resortName);
		if (findResortName != null) {
			findResortName.setLocation(location);
			System.out.println("Resort name found , can update  resort Location: " + location);
			return true;
		}
		System.out.println("Resort name not found, cannot update");
		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("Imvoked LocationByNameandRating");
		System.out.println("location" + location);
		System.out.println("name" + name);
		System.out.println("rating" + rating);
		ResortDTO findResortName = this.findResortName(name);
		if (findResortName != null) {
			findResortName.setLocation(location);
			System.out.println("Resort Name and ratings found ,can update location");
			return true;
		}
		System.out.println("Resort name not found, cannot update");
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("Invoke deleteByNameAndLocation");
		System.out.println("Invoke name " + name);
		System.out.println("Invoke location" + location);
		ListIterator<ResortDTO> listIterator = resortList.listIterator();
		while (listIterator.hasNext()) {
			ResortDTO list = listIterator.next();
			if (list.getName().equals(name) && list.getLocation().equals(location)) {
				listIterator.remove();
				System.out.println("Both Resort and Location got Matched ");
				return true;
			}
		}
		System.out.println("Both Resort and Location not Matched ");
		return false;
	}

	@Override
	public int totalResortSize() {
		System.out.println("The Total size of collection is :");
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println(" All elements in the collections");
		return this.resortList;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("Invoked addMultipleResorts");
		System.out.println("dtos" + dtos);
		ListIterator<ResortDTO> listIterator = dtos.listIterator();
		while (listIterator.hasNext()) {
			boolean addAll = this.resortList.addAll(dtos);

			System.out.println("Added");
			return true;
		}

		System.out.println("Not added");
		return false;
	}

}
