package com.nt.niranjana.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpbootWithJenkinsApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(SpbootWithJenkinsApplicationTests.class); 
	@Test
	void contextLoads() {
		
		logger.info("This is SpringbootjenkinsApplicationTests{}, contextLoad() method:: ");
		Assertions.assertEquals(true, true);
	}

}
