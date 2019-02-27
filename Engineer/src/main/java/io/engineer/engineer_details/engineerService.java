package io.engineer.engineer_details;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.engineer.engineer_details.engineerdetail;
import io.engineer.engineer_details.engineerRepository;

@Service
public class engineerService {

	@Autowired
	private engineerRepository engrep;
	
	public List<engineerdetail> getalldetail(){
		List<engineerdetail> eng = new ArrayList<engineerdetail>();
		engrep.findAll().forEach(eng::add);
		return eng;
	}
}
