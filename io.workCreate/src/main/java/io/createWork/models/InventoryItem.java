package io.createWork.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class InventoryItem {

	String iid;
	
	String iname;
	
	String idesc;
	
	String iquantity;

	String icost;
	
	public InventoryItem() {

	}
	
	public InventoryItem(String i_name, String i_desc, String i_quantity, String i_cost) {
		super();
		this.iname = i_name;
		this.idesc = i_desc;
		this.iquantity = i_quantity;
		this.icost=i_cost;
	}

	public String getIdesc() {
		return idesc;
	}

	public void setIdesc(String i_desc) {
		this.idesc = i_desc;
	}

	public String getIcost() {
		return icost;
	}

	public void setIcost(String i_cost) {
		this.icost = i_cost;
	}

	public String getIid() {
		return iid;
	}

	public void setIid(String i_id) {
		this.iid = i_id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String i_name) {
		this.iname = i_name;
	}

	public String getIquantity() {
		return iquantity;
	}

	public void setIquantity(String i_quantity) {
		this.iquantity = i_quantity;
	}
	
	
	
}
