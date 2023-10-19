package com.nt.niranjana.jenkins.service.impl;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.niranjana.jenkins.SpbootWithJenkinsApplication;
import com.nt.niranjana.jenkins.service.WishService;

@Service
public class WishServiceImpl implements WishService
{
	private static Logger logger = LoggerFactory.getLogger(SpbootWithJenkinsApplication.class);
	@Autowired
	private Calendar calender;

	@Override
	public String sendWishMessage() 
	{
		logger.info("WishServiceImpl: sendingMessage() method...");
		int hour = calender.HOUR_OF_DAY;
		if(hour<12)
			 return "<h2>Good Morning::</h2>";
		 else if(hour<16)
			 return "<h2>Good Afternoon::</h2>";
		 else if(hour<20)
			 return "</h2>Good Evening ::</h2>";
		 else
			 return "<h2>Good Night ::</h2>";
	}

}
