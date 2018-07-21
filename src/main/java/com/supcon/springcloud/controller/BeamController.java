package com.supcon.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supcon.springcloud.service.FoundationClient;

@RestController
@RequestMapping("/beam")
public class BeamController {

	@Autowired
	private FoundationClient foundationClient;
	
	@RequestMapping("/getFoundation")
	public String getFoundationInfo(){
		String foundationInfo = null;
		try {
			foundationInfo = foundationClient.getFoundationInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundationInfo;
	}
	@RequestMapping("/helleBeam")
	public String helloBeam(){
		return "helloBeam";
	}
}
