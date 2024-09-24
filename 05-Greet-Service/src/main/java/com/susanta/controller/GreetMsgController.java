package com.susanta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susanta.client.WelcomeFeignClient;

@RestController
public class GreetMsgController {
	
	@Autowired
	private WelcomeFeignClient welcomeFeign;
	
	@GetMapping("/greet")
	public String greetMsg() { 
		String welcomeMsg=welcomeFeign.getMsg();
		String greetMsg=", Good Morning Susanta....!!!";
	return welcomeMsg + greetMsg;

    }
}

