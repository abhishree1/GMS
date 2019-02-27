package io.managementSystem.workOrder;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class workCreation {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	String id;
	String eid;
	String e_name;
	String model_no;
	String model_desc;
	String model_name;
	String typeOfMaintenance;
	String work_desc;
	String priority;
	String location;
	
	public workCreation() {}
	
	public workCreation(String eid, String e_name, String model_no, String model_desc, String model_name, String id,
			String typeOfMaintenance, String work_desc, String priority, String location) {
		super();
		this.eid = eid;
		this.e_name = e_name;
		this.model_no = model_no;
		this.model_desc = model_desc;
		this.model_name = model_name;
		this.id = id;
		this.typeOfMaintenance = typeOfMaintenance;
		this.work_desc = work_desc;
		this.priority = priority;
		this.location = location;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getModel_no() {
		return model_no;
	}
	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}
	public String getModel_desc() {
		return model_desc;
	}
	public void setModel_desc(String model_desc) {
		this.model_desc = model_desc;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeOfMaintenance() {
		return typeOfMaintenance;
	}
	public void setTypeOfMaintenance(String typeOfMaintenance) {
		this.typeOfMaintenance = typeOfMaintenance;
	}
	public String getWork_desc() {
		return work_desc;
	}
	public void setWork_desc(String work_desc) {
		this.work_desc = work_desc;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
