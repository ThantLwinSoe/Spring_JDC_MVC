package com.jdc.app.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/multi")
public class AppMultiController {
	
	@RequestMapping
	public String index() {
		return "multi";
	}
	
	@RequestMapping(value = "/actionOne")
	public String actionOne(Model model) {
		model.addAttribute("message", "Action One Running");
		return "multi";
	}
	

}
