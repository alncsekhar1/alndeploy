package com.awseks.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploymentConroller {
	
	
	
	@GetMapping("/deploy")
	public String getDeployment() {
		
		return new String("Deployment to AWS completed");
	}
	

}
