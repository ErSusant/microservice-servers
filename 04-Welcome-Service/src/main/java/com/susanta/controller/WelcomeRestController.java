package com.susanta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getMsg() {
		String port=env.getProperty("server.port");
		String msg="Welcome To Susanta..!("+port+")";
		return msg;
	}

}
