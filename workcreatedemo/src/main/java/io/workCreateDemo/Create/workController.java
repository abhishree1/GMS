package io.workCreateDemo.Create;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class workController {

	@Autowired 
	private workService service;
	
	@Autowired
	private RestTemplate resttemplate;

	@RequestMapping(method=RequestMethod.POST,value="/workorder")
	public void addWork(@RequestBody workitem work) {
		service.addWork(work);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/workorder")
	public void updateWork(@RequestBody workitem work) {
		service.updateWork(work);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/workorder/{id}")
	public void deleteWork(@PathVariable String id) {
		service.deleteWork(id);
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
}
