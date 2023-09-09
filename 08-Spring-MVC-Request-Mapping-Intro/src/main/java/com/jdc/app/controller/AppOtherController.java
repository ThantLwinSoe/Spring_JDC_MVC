package com.jdc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/multi")
public class AppOtherController {
	
	@RequestMapping
	public void index() {
		
	}
	
	@GetMapping("/action1")
	public String indexAction1(ModelMap map) {
		map.put("message", "Action 1");
		return "multi";
	}

	@RequestMapping(value = "/action1", method = RequestMethod.GET, params = "id")
	public String indexAction1WithParams(ModelMap map) {
		map.put("message", "Action 1 with parameter!!!");
		return "multi";
	}

	@RequestMapping("{:\\d+}")
	public String indexDigit(ModelMap map) {
		map.put("message", "Digit");
		return "multi";
	}	
	
	
	@RequestMapping("/action2")
	public String indexAction2 (Model map) {
		
		map.addAttribute("message", "Action 2");
		return "multi";
	}
	
	@RequestMapping("**")
	public String indexOther (ModelMap map) {
		map.addAttribute("message", "Wild Card");
		return "multi";
	}

}
