package com.xworkx.license.dao;

import com.xworkx.license.consonants.VehicleType;
import com.xworkx.license.dto.LicenseDTO;

public interface LicenseDAO {
	
	void save(LicenseDTO dto);
	
	LicenseDTO findByIdProofNo(String idProofNo);
	
	 boolean updateVehicleTypeByIdProof(String idProofNo , VehicleType type);
	
	 
	 boolean deleteByIdProofNo(String idPrrof);
	
	
}
