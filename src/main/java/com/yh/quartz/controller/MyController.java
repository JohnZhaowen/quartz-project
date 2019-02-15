package com.yh.quartz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yh.quartz.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService service;
	
	@RequestMapping("/user")
	public String getUser(String id) {
		return service.findUserById(id).toString();
	}
	
}
