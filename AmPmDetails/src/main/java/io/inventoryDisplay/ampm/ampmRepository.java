package io.inventoryDisplay.ampm;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

public interface ampmRepository extends CrudRepository<ampmitems, String>{

	public List<String> findByNotifydate();
}
