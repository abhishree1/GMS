package io.inventoryDisplay.catalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class InventoryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int iid;
	
	@NotNull
	String iname;
	
	@NotNull
	int iquantity;

	@NotNull
	int icost;
	
	public InventoryItem() {

	}
	
	public InventoryItem(@NotNull String i_name, @NotNull int i_quantity,@NotNull int i_cost) {
		super();
		this.iname = i_name;
		this.iquantity = i_quantity;
		this.icost=i_cost;
	}


	public int getIcost() {
		return icost;
	}

	public void setIcost(int i_cost) {
		this.icost = i_cost;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int i_id) {
		this.iid = i_id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String i_name) {
		this.iname = i_name;
	}

	public int getIquantity() {
		return iquantity;
	}

	public void setIquantity(int i_quantity) {
		this.iquantity = i_quantity;
	}
	
}
