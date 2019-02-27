package io.inventoryDisplay.catalog;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryservice;
	
	@RequestMapping("/inventory")
	public List<InventoryItem> getallitem(){
		return inventoryservice.getallitem();
	}
	
	/*@RequestMapping("/inventory/get")
	public inventorywrapper getInventoryDetails() {
		List<InventoryItem> invent = new ArrayList<>();
		invent = inventoryservice.getallitem();
		inventorywrapper Inventorywrapper = new inventorywrapper();
		Inventorywrapper.setIitem(invent);
		return Inventorywrapper;	
	}*/
	
	@RequestMapping(method=RequestMethod.POST,value="inventory/{id}")
	public void inventoryUpdate(@RequestParam int no,@PathVariable int id){
		inventoryservice.updateInventory(id,no);	
	}
	
}
