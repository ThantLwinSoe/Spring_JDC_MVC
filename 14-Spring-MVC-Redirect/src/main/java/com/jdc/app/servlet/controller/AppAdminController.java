package com.jdc.app.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdc.app.model.service.CourseService;

@Controller
@RequestMapping("admin")
public class AppAdminController {
	
	@Autowired
	private CourseService service; 
	
	
	@PostMapping
	public String adminPage(Model model,
			@RequestParam(value = "userName") String user_name
			) {
		model.addAttribute("name", user_name);
		model.addAttribute("courseList", service.get_all_courses());
		return "course-list";
	}
}
