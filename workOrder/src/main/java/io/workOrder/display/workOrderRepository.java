package io.workOrder.display;

import org.springframework.data.repository.CrudRepository;

public interface workOrderRepository extends CrudRepository<workItem, String>{
	
	
}
