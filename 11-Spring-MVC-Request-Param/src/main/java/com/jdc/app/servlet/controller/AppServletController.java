package com.jdc.app.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/","/home","/welcome"})
public class AppServletController {
	
	@RequestMapping
	public String index() {
		return "home";
	}
	
	@RequestMapping("personPage")
	public String personPage(
			Model model,
			@RequestParam(value = "uname") String name,
			@RequestParam(value = "course") String cou,
			@RequestParam(value = "pnum") int ph
			) {
		
		model.addAttribute("name", name);
		model.addAttribute("course", cou);
		model.addAttribute("phone", ph);
		
		return "person";
	}
}
