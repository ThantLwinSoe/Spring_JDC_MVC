package com.jdc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.root.controller.RootController;

@Controller
@RequestMapping("/yes")
public class AppController {
	
	@Autowired
	private RootController rootController;
	
	@GetMapping
	public void index(Model model) {
		model.addAttribute("message", rootController.doProcess());
	}
}
