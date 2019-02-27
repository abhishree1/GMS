package io.inventoryDisplay.catalog;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	public List<InventoryItem> getallitem(){
		List<InventoryItem> items = new ArrayList<>();
		inventoryRepository.findAll().forEach(items::add);
		return items;
	}

	public void updateInventory(int id, int no) {
		InventoryItem invent = new InventoryItem();
		invent = inventoryRepository.findById(id).orElse(null);
		invent.setIquantity(invent.getIquantity()-no);
		inventoryRepository.save(invent);
	}
	
}
