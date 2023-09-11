package com.jdc.app.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/input")
public class InputController {
	
	@RequestMapping("{type}/show/{id:\\d+}")
	public String index(
			@PathVariable(value = "type") String name,
			@PathVariable Integer id,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		return "input";
	}

}
