package io.workOrder.display;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class workOrderService {

	@Autowired
	private workOrderRepository rep;
	
	public List<workItem> getAllWorkOrder(){
		List<workItem> work = new ArrayList<>();
		rep.findAll().forEach(work::add);
		return work;
	}

	public workItem getWorkById(String id) {
		return rep.findById(id).orElse(null);
	}
	
}
