package com.nt.niranjana.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.niranjana.jenkins.service.WishService;

@RestController
@RequestMapping("/wish")
public class WishController 
{
	@Autowired
	private WishService wishService;
	
	@GetMapping("/msg")
	public String wishGenerator()
	{
		System.out.println("WiahController: inside wishGenerator() method");
		return wishService.sendWishMessage();
	}

}
