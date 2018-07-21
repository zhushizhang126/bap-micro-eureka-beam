package com.supcon.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("bap-micro-eureka-foundation")
public interface FoundationClient {

	@RequestMapping("/foundation/helloFoundation")
	String getFoundationInfo() throws Exception;
}
