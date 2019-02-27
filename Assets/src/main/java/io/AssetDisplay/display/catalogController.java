package io.AssetDisplay.display;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.AssetDisplay.display.*;

@RestController
public class catalogController {

	@Autowired
	private catalogService catalogservice;
	
	
	@RequestMapping("/assets/{id}")
	public catalog getAssetById(@PathVariable String id) {
		return catalogservice.getAssetbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/assets")
	public void addAsset(@RequestBody catalog cat) {
		catalogservice.addAsset(cat);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/assets/{id}")
	public void updateAsset(@RequestBody catalog cat) {
		catalogservice.updateAsset(cat);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/assets/{id}")
	public void deleteAsset(@PathVariable String id) {
		catalogservice.deleteAsset(id);
	}
	
	@RequestMapping("/mainmachine")
	public catlist getengdetails() {
		List<catalog> cat = new ArrayList<>();
		cat = catalogservice.getAllAsset();
		catlist cata = new catlist();
		cata.setCatli(cat);
		return cata;	
	}
	
	@RequestMapping("/atow/{mid}")
	public catalist getAtow(@PathVariable String mid) {
		 catalog ca = catalogservice.getAssetbyId(mid);
		 String name = ca.getMname();
		 catalist cata = new catalist();
		 cata.initData(mid, name);
		 return cata;		
	}
	
}
