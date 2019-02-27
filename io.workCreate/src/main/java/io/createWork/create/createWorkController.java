package io.createWork.create;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.createWork.models.*;

@RestController
public class createWorkController {

	@Autowired
	private createWorkService service;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@RequestMapping(method=RequestMethod.POST,value="/workorder")
	public void addWord(@RequestBody workItem work) {
		service.addWork(work);
	}
	
    @RequestMapping("/assignee")
    public List<engineerdetail> getCatalog() {
       engdetails eng = resttemplate.getForObject("http://localhost:9001/assignee", engdetails.class); 
       return eng.getEngdetail().stream().collect(Collectors.toList());
       
       /*return userRating.getRatings().stream()
                .map(rating -> {
                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
                })
                .collect(Collectors.toList());
        */
}
    @RequestMapping("/mainmachine")
    public List<catalog> getMainMachineCatalog() {
       catlist cat = resttemplate.getForObject("http://localhost:9001/mainmachine", catlist.class); 
       return cat.getCatli().stream().collect(Collectors.toList());
       }
    
    @RequestMapping("/mainmachine/{mid}/compmachine")
    public List<compcatalog> getCompMachineCatalog() {
        compcat cat = resttemplate.getForObject("http://localhost:9001//mainmachine/{mid}/compmachine", compcat.class); 
        return cat.getCompcat().stream().collect(Collectors.toList());
        }
    
    @RequestMapping("/mainmachine/{mid}/compmachine/{id}/subcompmachine")
    public List<subcompcatalog> getSubCompMachineCatalog() {
        subcomp cat = resttemplate.getForObject("http://localhost:9001//mainmachine/{mid}/compmachine/{id}/subcompmachine", subcomp.class); 
        return cat.getSub().stream().collect(Collectors.toList());
        }
   /* @RequestMapping("/createworkforampm")
    public void createworkforampm() {
    	notifylist noti = resttemplate.getForObject("http://localhost:9001/ampm/notifylist", notifylist.class);
    	catalist cataList = resttemplate.getForObject("http://localhost:9001/atow/"+noti.getAssetid(), catalist.class);
    	for(int i=0;i<noti.getNotify().size();i++) {
    		workItem wrk = new workItem();
    		wrk.setTitle("Work on "+noti.getAssetid());
    		wrk.setDescription(noti.getWorkdetails());	
    		wrk.setDueDate(noti.getNotify().get(i));
    		wrk.setMachinename(cataList.getMname());
    		service.addWork(wrk);
    	}
    }*/
    
   /* @RequestMapping("/inventory/get")
    	public List<InventoryItem> getInventoryItem(){
    	inventorywrapper invent = resttemplate.getForObject("http://localhost:9002/inventory/get", inventorywrapper.class);
    	return invent.getIitem().stream().collect(Collectors.toList());
    }*/
    
    
    
}
