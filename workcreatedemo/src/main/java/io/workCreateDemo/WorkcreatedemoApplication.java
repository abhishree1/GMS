package io.workCreateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.workCreateDemo.Create.workService;

@SpringBootApplication
public class WorkcreatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkcreatedemoApplication.class, args);
	}
	

	@Bean
	public RestTemplate getresttemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public workService getworkservice() {
		return new workService();
	}

}
