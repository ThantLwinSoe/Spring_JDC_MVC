package com.jdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.model.AppModel;

@Controller
@RequestMapping("/ok")
public class AppController {
	
	@Autowired
	private AppModel appModel;
	
	@GetMapping
	public String doSomething(Model model) {
		model.addAttribute("message", appModel.doWork());
		return "home";
	}
}
