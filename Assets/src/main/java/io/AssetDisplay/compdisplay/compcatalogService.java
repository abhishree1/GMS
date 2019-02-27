package io.AssetDisplay.compdisplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.AssetDisplay.display.*;

@Service
public class compcatalogService {
	
	@Autowired
	private compcatalogRepository catalogrepository;
	

	public List<compcatalog> getAllCompAsset(String mid) {
		List<compcatalog> cat = new ArrayList<compcatalog>();
		catalogrepository.findByCatMid(mid)
		.forEach(cat::add);
		return cat;
	}
	
	public compcatalog getCompAssetbyId(String id){	
		return catalogrepository.findById(id).orElse(null);
	}
	
	public void addCompAsset(compcatalog cat){	
		catalogrepository.save(cat);
	}
	
	public void updateCompAsset(compcatalog cat){	
		catalogrepository.save(cat);
	}
	
	public void deleteCompAsset(String id){	
		catalogrepository.deleteById(id);
	}
	
	
}
