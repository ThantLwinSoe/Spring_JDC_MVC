package com.jdc.app.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/home","/welcome"})
public class AppServletController {
	
	@GetMapping
	public String index() {
		return "home";
	}

}
