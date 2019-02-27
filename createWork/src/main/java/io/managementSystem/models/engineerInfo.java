package io.managementSystem.models;

public class engineerInfo {

	String e_name;
	String eid;
	String designation;
	String Avail_status;
	
	public engineerInfo() {
	}
	
	public engineerInfo(String name, String eid, String designation, String avail_status) {
		super();
		this.e_name = name;
		this.eid = eid;
		this.designation = designation;
		Avail_status = avail_status;
	}
	public String getName() {
		return e_name;
	}
	public void setName(String name) {
		this.e_name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAvail_status() {
		return Avail_status;
	}
	public void setAvail_status(String avail_status) {
		Avail_status = avail_status;
	}
	
	
}
