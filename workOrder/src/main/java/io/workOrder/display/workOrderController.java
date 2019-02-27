package io.workOrder.display;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class workOrderController {

	@Autowired
	private workOrderService service;
		
	@RequestMapping("/workorder")
	public List<workItem> getAllWorkOrder(){
		return service.getAllWorkOrder();
	}
	
	@RequestMapping("/workorder/{id}")
	public workItem getWorkById(@PathVariable String id)
	{
		return service.getWorkById(id);
	}
	
	@RequestMapping("engineer/{id}/work")
	public work getengdetails() {
		List<workItem> workk = new ArrayList<>();
		workk = service.getAllWorkOrder();
		work worka = new work();
		worka.setWork(workk);
		return worka;	
	}
}
