package io.engineer.engineer_details;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.engineer.engineer_details.engineerdetail;

@RestController
public class engineerController {
	
	@Autowired
	private engineerService engser;
	
	@Autowired
	private RestTemplate resttemplate;
	@RequestMapping("/engineer")
	public List<engineerdetail> getalldetail(){
		return engser.getalldetail();
	}
	
	  /*@RequestMapping("/user/{userId}")
	    public UserRating getUserRatings(@PathVariable("userId") String userId) {
	        UserRating userRating = new UserRating();
	        userRating.initData(userId);
	        return userRating;

	    }*/
	/*@RequestMapping("/engineer/{id}/work")
	public List<workItem> getAllWork(@PathVariable int id){
		work works = resttemplate.getForObject("http://localhost:8083/engineer/{id}/work", work.class); 
		List<workItem> workk = new ArrayList<workItem>(); 
		works.getWork().stream().forEach(
					if(id==)
				)
		return null;	
		}*/
	
	/*map(rating -> {
                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
                })*/
	@RequestMapping("/assignee")
	public engdetails getengdetails() {
		List<engineerdetail> engdet = new ArrayList<>();
		engdet=engser.getalldetail();
		engdetails eng = new engdetails();
		eng.setEngdetail(engdet);
		return eng;
	}
}
