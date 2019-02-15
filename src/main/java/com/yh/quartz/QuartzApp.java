package com.yh.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuartzApp {
	
	public static void main(String[] args) {
		SpringApplication.run(QuartzApp.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "hello quartz";
	}

}
