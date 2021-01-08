package com.vip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vip.service.HiServiceInter;
@EnableEurekaClient
@RestController
public class ClientController {
	
	@Autowired
	HiServiceInter hiServiceInter;
	/**
	 * This method is used to return the client details 
	 * @return
	 */
	@GetMapping("/getclientdetails")
	public String clientDetails(){
		return "Welcome to Hii Service App....";
	}
	@GetMapping("get")
	public String getDataHiService() {
		String details = hiServiceInter.clientDetails();
		return details;
	}
	
}
