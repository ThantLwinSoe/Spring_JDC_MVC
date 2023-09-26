package com.jdc.app.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.app.model.service.CourseService;

@Controller
@RequestMapping("search")
public class AppCourseEditController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping
	public String courseEdit(Model model) {
		model.addAttribute("courseList", service.get_all_courses());
		return "course-search";
	}
	
	@GetMapping("add")
	public String addCourse() {
		return "add-course";
	}
}
