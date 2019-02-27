package io.engineer.engineer_details;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class engineerdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eid;
	
	String name;
	
	String designation;
	
	String avail_status;
	
	
	

	public engineerdetail() {
	}
	public engineerdetail(int eid, @NotNull String name, @NotNull String designation, @NotNull String avail_status) {
		super();
		this.name = name;
		this.designation = designation;
		this.avail_status = avail_status;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
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
