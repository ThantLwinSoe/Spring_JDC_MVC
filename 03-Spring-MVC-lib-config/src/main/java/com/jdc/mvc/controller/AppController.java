package com.jdc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.root.model.AppModel;

@Controller
@RequestMapping("/jj")
public class AppController {
	
	@Autowired
	private AppModel root;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", root.doSomething());
		return "home";
	}
}
