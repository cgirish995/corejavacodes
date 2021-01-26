package com.xworkx.license;

import java.util.Date;

import com.xworkx.license.consonants.BoodGroup;
import com.xworkx.license.consonants.Gender;
import com.xworkx.license.consonants.IdProof;
import com.xworkx.license.consonants.VehicleType;
import com.xworkx.license.dao.LicenseDAOImpl;
import com.xworkx.license.dto.AddressDTO;
import com.xworkx.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
	
		
		AddressDTO addressDTO = new AddressDTO(3254, "NA", 560003, "Soundatti", "Soundatti", "Ka", "Na");
		
		Date dob = new Date();
		
		LicenseDTO dto = new LicenseDTO("Girish",23,addressDTO,dob,8553651681l,BoodGroup.B_POSITIVE,Gender.FEMALE);
		dto.setIdProof(IdProof.AADHAR);
		dto.setIdProofNo("6363 8787 6449");
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		dto.setCommercial(false);
		dto.setDisability(false);
		dto.setStartDate(new Date());
		
		LicenseDAOImpl dao = new LicenseDAOImpl();
		dao.save(dto);
		
//			LicenseDTO dtoFound= dao.findByIdProofNo("6363 8787 6449");
//			System.out.println(dtoFound);
//		
//			boolean updated = dao.updateVehicleTypeByIdProof("6363 8787 6449", VehicleType.TWO_WHEELER);
//			System.out.println(updated);
		
		
			boolean deleted = dao.deleteByIdProofNo("6363 8787 6449");
			System.out.println(deleted);
			
			
			
			
			
	}

}
