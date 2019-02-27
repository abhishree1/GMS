package io.managementSystem.models;

public class Asset {

	String model_name;
	String model_no;
	String model_desc;
	
	public Asset() {
	}
	
	public Asset(String model_name, String model_no, String description) {
		super();
		this.model_name = model_name;
		this.model_no = model_no;
		this.model_desc = description;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getModel_no() {
		return model_no;
	}
	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}
	public String getDescription() {
		return model_desc;
	}
	public void setDescription(String description) {
		this.model_desc = description;
	}
}
