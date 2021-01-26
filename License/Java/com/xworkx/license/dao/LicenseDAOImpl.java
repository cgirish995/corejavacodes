package com.xworkx.license.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkx.license.consonants.VehicleType;
import com.xworkx.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO{
	
	private List<LicenseDTO> database;
	
	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("Invoked findByIdProofNo");
		System.out.println("idProofNo: " + idProofNo);
		for(LicenseDTO licensedto:this.database){
			String licensedtoFromDTO=licensedto.getIdProofNo();
			if(licensedtoFromDTO.equals(idProofNo)){
				System.out.println("license found");
				return licensedto;
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProof(String idProofNo, VehicleType type) {
		System.out.println("Invoked updateVehicleTypeByIdProof");
		System.out.println("idProofNo" + idProofNo);
		System.out.println("type" + type);
		LicenseDTO dtoFromDB  = this.findByIdProofNo(idProofNo);
		if(dtoFromDB!=null){
			System.out.println("can update ,license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		}else{
			System.out.println("cannot update , license not found");
			
		}
		return false;
	}

	@Override
	public boolean deleteByIdProofNo(String idProofNo) {
		System.out.println("Invoked deleteByIdProofNo");
		System.out.println("idProofNo" + idProofNo);
		ListIterator<LicenseDTO> listIterator = database.listIterator();
		while(listIterator.hasNext()){
			LicenseDTO listdto = listIterator.next();
			if(listdto.getIdProofNo().equals(idProofNo)){
				listIterator.remove();
				System.out.println("Sucessfully removed");
			}else{
				System.out.println("Not rmoved sucessfully");
			}
		}
		return true ;
		
	
		
		
	}

}
