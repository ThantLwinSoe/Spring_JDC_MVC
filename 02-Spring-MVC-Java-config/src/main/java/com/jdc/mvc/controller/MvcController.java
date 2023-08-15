package com.jdc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.context.controller.ContextController;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	
	@Autowired
	private ContextController context;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", context.doSomething());
		return "home";
	}
	
	
}
