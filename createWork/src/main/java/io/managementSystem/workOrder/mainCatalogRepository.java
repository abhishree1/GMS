package io.managementSystem.workOrder;


import org.springframework.data.repository.CrudRepository;
import io.managementSystem.workOrder.workCreation;

public interface mainCatalogRepository extends CrudRepository<workCreation, String>{
	
	
}