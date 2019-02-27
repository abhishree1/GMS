package io.createWork.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class createWorkService {

	@Autowired
	private createWorkRepository rep;
	
	public void addWork(workItem work) {
		rep.save(work);
	}

}
