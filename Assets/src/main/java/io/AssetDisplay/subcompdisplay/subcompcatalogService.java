package io.AssetDisplay.subcompdisplay;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class subcompcatalogService {
	
	@Autowired
	private subcompcatalogRepository catalogrepository;
	

	public List<subcompcatalog> getAllSubCompAsset(String subid) {
		List<subcompcatalog> cat = new ArrayList<subcompcatalog>();
		catalogrepository.findByCatCompid(subid)
		.forEach(cat::add);
		return cat;
	}
	
	public subcompcatalog getSubCompAssetbyId(String id){	
		return catalogrepository.findById(id).orElse(null);
	}
	
	public void addSubCompAsset(subcompcatalog cat){	
		catalogrepository.save(cat);
	}
	
	public void updateCompAsset(subcompcatalog cat){	
		catalogrepository.save(cat);
	}
	
	public void deleteCompAsset(String id){	
		catalogrepository.deleteById(id);
	}
	
	
}
