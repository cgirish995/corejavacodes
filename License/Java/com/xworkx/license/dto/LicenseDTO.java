package com.xworkx.license.dto;

import java.time.LocalDate;
import java.util.Date;

import com.xworkx.license.consonants.IdProof;
import com.xworkx.license.consonants.VehicleType;
import com.xworkx.license.consonants.BoodGroup;
import com.xworkx.license.consonants.Gender;


public class LicenseDTO extends CommonDTO{
	
	private IdProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startDate;;
	private boolean disability;
	private boolean commercial;
	
	public LicenseDTO(){
		
	}

	/**
	 * @param name
	 * @param age
	 * @param addressDTO
	 * @param dOB
	 * @param mobileNo
	 * @param bloodGroup
	 * @param gender
	 */
	public LicenseDTO(String name, int age, AddressDTO addressDTO, Date dOB, long mobileNo, BoodGroup bloodGroup,
			Gender gender) {
		super(name, age, addressDTO, dOB, mobileNo, bloodGroup, gender);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean equals(Object obj) {
	
		if(obj == null){
			System.out.println("Object is null");
			return false;
		}
		
		
		if(obj instanceof LicenseDTO){
			LicenseDTO casted = (LicenseDTO)obj;
			if(this.idProofNo!=null && this.idProofNo.equals(casted.getIdProofNo()));
			return true;
		}
		return false;
	}
	
	/**
	 * @return the idProof
	 */
	public IdProof getIdProof() {
		return idProof;
	}

	/**
	 * @param idProof the idProof to set
	 */
	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	/**
	 * @return the idProofNo
	 */
	public String getIdProofNo() {
		return idProofNo;
	}

	/**
	 * @param idProofNo the idProofNo to set
	 */
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	/**
	 * @return the vehicleType
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

	/**
	 * @return the disability
	 */
	public boolean isDisability() {
		return disability;
	}

	/**
	 * @param disability the disability to set
	 */
	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	/**
	 * @return the commercial
	 */
	public boolean isCommercial() {
		return commercial;
	}

	/**
	 * @param commercial the commercial to set
	 */
	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

	/**
	 * @param name
	 * @param age
	 * @param addressDTO
	 * @param dOB
	 * @param mobileNo
	 * @param bloodGroup
	 * @param gender
	 */
	
	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", startDate=" + startDate + ", disability=" + disability + ", commercial=" + commercial + "]";
	}
	

}
