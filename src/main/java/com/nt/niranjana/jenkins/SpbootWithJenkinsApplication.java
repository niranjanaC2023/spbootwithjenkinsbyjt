package com.nt.niranjana.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpbootWithJenkinsApplication {

private static Logger logger = LoggerFactory.getLogger(SpbootWithJenkinsApplication.class); 
	
	@PostConstruct
	public void init()
	{
		logger.info("SpringbootjenkinsApplication{},This init method starts before main class...");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpbootWithJenkinsApplication.class, args);
		logger.info("SpringbootjenkinsApplication main class started............");
	}

}
