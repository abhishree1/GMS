package io.AssetDisplay.subcompdisplay;
import java.util.ArrayList;
import java.util.List;

import io.AssetDisplay.compdisplay.compcat;
import io.AssetDisplay.compdisplay.compcatalog;
import io.AssetDisplay.display.catalog;
import io.AssetDisplay.display.catlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class subcompcatalogController {

	@Autowired
	private subcompcatalogService catalogservice;
	
	@RequestMapping("/assets/{mid}/component/{compid}/subcomponent")
	public List<subcompcatalog> getallcompasset(@PathVariable String compid){
		return catalogservice.getAllSubCompAsset(compid);
	}
	
	@RequestMapping("/assets/{mid}/component/{compid}/subcomponent/{id}")
	public subcompcatalog getSubCompAssetById(@PathVariable String id) {
		return catalogservice.getSubCompAssetbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/assets/{mid}/component/{compid}/subcomponent/{id}")
	public void addAsset(@RequestBody subcompcatalog cat,@PathVariable String mid,@PathVariable String compid,@PathVariable String id) {
		cat.setCat(new compcatalog(compid,"","","","",mid));
		catalogservice.addSubCompAsset(cat);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/assets/{mid}/component/{compid}/subcomponent/{id}")
	public void updateAsset(@RequestBody subcompcatalog cat,@PathVariable String mid,@PathVariable String compid,@PathVariable String id) {
		cat.setCat(new compcatalog(compid,"","","","",mid));
		catalogservice.updateCompAsset(cat);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/assets/{mid}/component/{compid}/subcomponent/{id}")
	public void deleteAsset(@PathVariable String id) {
		catalogservice.deleteCompAsset(id);
	}
	
	@RequestMapping("/mainmachine/{mid}/compmachine/{id}/subcompmachine")
	public subcomp getengdetails(@PathVariable String mid,@PathVariable String id) {
		List<subcompcatalog> caat = new ArrayList<>();
		caat = catalogservice.getAllSubCompAsset(id);
		subcomp cata = new subcomp();
		cata.setSub(caat);
		return cata;	
	}
	

}
