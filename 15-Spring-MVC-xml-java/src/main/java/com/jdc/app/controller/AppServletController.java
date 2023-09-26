package com.jdc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppServletController {
		
	@GetMapping
	public String index() {
		return "home";
	}
	
}
