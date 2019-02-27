package io.managementSystem.workOrder;

import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import io.managementSystem.workOrder.workCreation;
import io.managementSystem.workOrder.mainCatalogRepository;;

@Service
public class mainCatalogService {
	
	/*JdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		template = new JdbcTemplate(datasource);
	}*/

	@Autowired
	mainCatalogRepository mainrp;
	
	
	public List<workCreation> getallWorkOrder() {
		//For Database
		List<workCreation> workk = new ArrayList<workCreation>();
		mainrp.findAll().forEach(workk::add);
		return workk; //for static data which is written above
	}
	
	public void addwork(workCreation workk) {
		//String query="insert into work_creation values('"+workk.getId()+"','"+workk.getEid()+"','"+workk.getE_name()+"','"+workk.getModel_no()+"','"+workk.getModel_name()+"','"+workk.getModel_desc()+"');";
		mainrp.save(workk);
				}
	
	public workCreation getwork(String id) {
		return mainrp.findById(id).orElse(null);
	}

	
	
	


}
