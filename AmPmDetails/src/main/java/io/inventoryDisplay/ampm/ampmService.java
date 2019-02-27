package io.inventoryDisplay.ampm;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ampmService")
public class ampmService {

	@Autowired
	private ampmRepository ampmRepository;
	public List<ampmitems> findAll() {
		List<ampmitems> cat = new ArrayList<>();
		ampmRepository.findAll().forEach(cat::add);
		return cat;
	}

	public ampmitems save(ampmitems ampmitems) {
		return ampmRepository.save(ampmitems);
	}

	public List<String> getAllNotifyingList() {
		return ampmRepository.findByNotifydate();
	
	}

	public ampmitems findByid(String assetid) {
		return ampmRepository.findById(assetid).orElse(null);
	}

	/*public void addWork(workItem wrk) {
		ampmRepository.save(wrk);
		
	}*/
	
	

}
