package io.managementSystem.workOrder;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.managementSystem.models.InventoryItem;
import io.managementSystem.workOrder.workCreation;

@RestController
public class mainCatalogController {
	
	@Autowired
	private mainCatalogService MainCat;
	
	/*for testing
	@RequestMapping("/work")
	public List<workCreation> getallWorkOrder() {
		return MainCat.getallWorkOrder();
	}
	testing ends*/
	
	@RequestMapping(method=RequestMethod.POST,value="/workorder")
	public void addwork(@RequestBody workCreation workk) {
		/*workCreation work = new workCreation();
		work.setEid(workk.eid);
		work.setE_name(workk.e_name);
		work.setModel_no(workk.model_no);
		work.setModel_name(workk.model_name);
		work.setModel_desc(workk.model_desc);
		work.setLocation(workk.location);
		work.setTypeOfMaintenance(workk.typeOfMaintenance);
		work.setWork_desc(workk.work_desc);*/ 
		MainCat.addwork(workk);
	}
}
