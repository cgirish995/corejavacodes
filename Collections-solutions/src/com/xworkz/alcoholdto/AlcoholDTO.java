package com.xworkz.alcoholdto;

public class AlcoholDTO {
	
	private String name;
	private String brandName;
	private int spiritPercentage;
	
	public AlcoholDTO() {

	}
	
	public AlcoholDTO(String name, String brandName, int spiritPercentage) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spiritPercentage = spiritPercentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSpiritPercentage() {
		return spiritPercentage;
	}

	public void setSpiritPercentage(int spiritPercentage) {
		this.spiritPercentage = spiritPercentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null){
			return false;
			
		}
		
		if(obj instanceof AlcoholDTO){
		AlcoholDTO casted=(AlcoholDTO)obj;
		if(this.brandName.equals(casted.brandName)){
			System.out.println("BrandName " + casted.brandName);
			return true;
		}
		
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", spiritPercentage=" + spiritPercentage + "]";
	}
	
	
	
	
	

}
