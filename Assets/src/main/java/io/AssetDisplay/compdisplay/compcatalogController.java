package io.AssetDisplay.compdisplay;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.AssetDisplay.display.*;

@RestController
public class compcatalogController {

	@Autowired
	private compcatalogService catalogservice;
	
	@RequestMapping("/assets/{id}/component")
	public List<compcatalog> getallcompasset(@PathVariable String id){
		return catalogservice.getAllCompAsset(id);
	}
	
	@RequestMapping("/assets/{mid}/component/{id}")
	public compcatalog getAssetById(@PathVariable String id) {
		return catalogservice.getCompAssetbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/assets/{mid}/component")
	public void addAsset(@RequestBody compcatalog cat,@PathVariable String mid) {
		cat.setCat(new catalog(mid,"","","","",""));
		catalogservice.addCompAsset(cat);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/assets/{mid}/component/{id}")
	public void updateAsset(@RequestBody compcatalog cat,@PathVariable String mid,@PathVariable String id) {
		cat.setCat(new catalog(mid,"","","","",""));
		catalogservice.updateCompAsset(cat);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/assets/{mid}/component/{id}")
	public void deleteAsset(@PathVariable String id) {
		catalogservice.deleteCompAsset(id);
	}
	
	@RequestMapping("/mainmachine/{mid}/compmachine")
	public compcat getengdetails(@PathVariable String mid) {
		List<compcatalog> caat = new ArrayList<>();
		caat = catalogservice.getAllCompAsset(mid);
		compcat cata = new compcat();
		cata.setCompcat(caat);
		return cata;	
	}

}
