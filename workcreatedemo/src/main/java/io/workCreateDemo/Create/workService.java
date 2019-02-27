package io.workCreateDemo.Create;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class workService {
	
	@Autowired
	private workRepository repo;
	
	@Autowired
	private ampmrepository ampmrep;

	public void addWork(workitem work) {
		// TODO Auto-generated method stub
		repo.save(work);
	}

	public void updateWork(workitem work) {
		// TODO Auto-generated method stub
		repo.save(work);
	}
	
	
	public void deleteWork(String id) {
		repo.deleteById(id);
	}
	
	public List<ampmitem> findAll() {
		List<ampmitem> cat = new ArrayList<>();
		ampmrep.findAll().forEach(cat::add);
		return cat;
	}
	
	public void save(ampmitem amp) {
		ampmrep.save(amp);
	}
	
	

}
