package com.microservice.limits_service.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.limits_service.bean.Limit;
import com.microservice.limits_service.config.Configuration;


@RestController
public class LimitServiceController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping(path = "/limits")
	public Limit getAllLimits() {
		return new Limit(configuration.getMinimum(), configuration.getMaximum());
	}
	
}
