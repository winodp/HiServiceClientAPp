package com.vip.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CLIENT-TWO")
public interface HiServiceInter {
	
	@GetMapping("getclientdetails")
	public String clientDetails();

}

