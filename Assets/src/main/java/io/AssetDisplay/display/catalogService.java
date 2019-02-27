package io.AssetDisplay.display;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.AssetDisplay.display.*;

@Service
public class catalogService {
	
	@Autowired
	private catalogRepository catalogrepository;
	

	public List<catalog> getAllAsset() {
		List<catalog> cat = new ArrayList<catalog>();
		catalogrepository.findAll().forEach(cat::add);
		return cat;
	}
	
	public catalog getAssetbyId(String id){	
		return catalogrepository.findById(id).orElse(null);
	}
	
	public void addAsset(catalog cat){	
		catalogrepository.save(cat);
	}
	
	public void updateAsset(catalog cat){	
		catalogrepository.save(cat);
	}
	
	public void deleteAsset(String id){	
		catalogrepository.deleteById(id);
	}

	public String getAmPm(String mid) {
		catalog ampm= getAssetbyId(mid);
		return ampm.typeOfMaintenance;
	}
	
}
