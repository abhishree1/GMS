package io.managementSystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class InventoryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String i_id;
	
	@NotNull
	String i_name;
	
	@NotNull
	String i_desc;
	
	@NotNull
	String i_quantity;

	@NotNull
	String i_cost;
	
	public InventoryItem() {

	}
	
	public InventoryItem(@NotNull String i_name, @NotNull String i_desc, @NotNull String i_quantity,@NotNull String i_cost) {
		super();
		this.i_name = i_name;
		this.i_desc = i_desc;
		this.i_quantity = i_quantity;
		this.i_cost=i_cost;
	}

	public String getI_desc() {
		return i_desc;
	}

	public void setI_desc(String i_desc) {
		this.i_desc = i_desc;
	}

	public String getI_cost() {
		return i_cost;
	}

	public void setI_cost(String i_cost) {
		this.i_cost = i_cost;
	}

	public String getI_id() {
		return i_id;
	}

	public void setI_id(String i_id) {
		this.i_id = i_id;
	}

	public String getI_name() {
		return i_name;
	}

	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	public String getI_quantity() {
		return i_quantity;
	}

	public void setI_quantity(String i_quantity) {
		this.i_quantity = i_quantity;
	}
	
	
	
}
