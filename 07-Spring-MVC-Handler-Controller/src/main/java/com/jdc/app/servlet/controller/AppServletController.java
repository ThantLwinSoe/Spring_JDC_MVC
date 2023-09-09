package com.jdc.app.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.app.root.controller.AppRootController;

@Controller
@RequestMapping("/homepage")
public class AppServletController {
	
	@Autowired
	private AppRootController controller;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", controller.doProcess());
		return "Home";
	}
}
