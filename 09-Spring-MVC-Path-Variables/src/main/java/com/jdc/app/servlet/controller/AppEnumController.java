package com.jdc.app.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.app.levels.Level;

@Controller
@RequestMapping("/levels")
public class AppEnumController {
	
	@RequestMapping("{level:Basic|Intermediate|Advance}")
	public String index(
			@PathVariable Level level,
			Model model
			) {
		model.addAttribute("lvl", level);
		return "AppEnum";
	}
}
