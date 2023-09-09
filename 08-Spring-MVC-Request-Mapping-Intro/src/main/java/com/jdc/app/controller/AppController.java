package com.jdc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/hello","/welcome"})
public class AppController {
	
	@RequestMapping
	public String index() {
		return "home";
	}

}
