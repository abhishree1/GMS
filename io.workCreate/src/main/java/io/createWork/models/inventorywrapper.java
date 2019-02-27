package io.createWork.models;

import java.util.*;

public class inventorywrapper {

	List<InventoryItem> iitem = new ArrayList<>();

	public inventorywrapper() {
	}
	
	public inventorywrapper(List<InventoryItem> iitem) {
		super();
		this.iitem = iitem;
	}

	public List<InventoryItem> getIitem() {
		return iitem;
	}

	public void setIitem(List<InventoryItem> iitem) {
		this.iitem = iitem;
	}
	
}
