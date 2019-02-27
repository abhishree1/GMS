package io.managementSystem.models;

public class TypeOfMaintenance {

	String typeOfContract;

	public TypeOfMaintenance() {
		
	}
	
	public TypeOfMaintenance(String typeOfContract) {
		super();
		this.typeOfContract = typeOfContract;
	}

	public String getTypeOfContract() {
		return typeOfContract;
	}

	public void setTypeOfContract(String typeOfContract) {
		this.typeOfContract = typeOfContract;
	}
	
}
