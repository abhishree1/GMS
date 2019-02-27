package io.createWork.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class engineerdetail {

	String eid;
	
	String name;
	
	String designation;
	
	String avail_status;

	public engineerdetail() {
	}
	public engineerdetail(String eid, String name, String designation, String avail_status) {
		super();
		this.eid=eid;
		this.name = name;
		this.designation = designation;
		this.avail_status = avail_status;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAvail_status() {
		return avail_status;
	}

	public void setAvail_status(String avail_status) {
		this.avail_status = avail_status;
	}
	
	
	
	 
}
