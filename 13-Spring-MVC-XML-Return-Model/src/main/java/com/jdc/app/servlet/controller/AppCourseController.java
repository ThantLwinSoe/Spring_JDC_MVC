package com.jdc.app.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.app.model.service.CourseService;

@Controller
@RequestMapping("/course")
public class AppCourseController {
	
	@Autowired
	private CourseService service;
	
	@RequestMapping("list")
	public String showCourse(Model model) {
		model.addAttribute("list", service.getCourseAll());
		return "course-list";
	}
}
