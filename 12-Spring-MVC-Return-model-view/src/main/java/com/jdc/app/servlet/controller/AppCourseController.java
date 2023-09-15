package com.jdc.app.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdc.app.model.service.CourseService;

@Controller
@RequestMapping("/course")
public class AppCourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping
	public ModelAndView index() {
		var modelAndView = new ModelAndView();
		// set model
		modelAndView.getModel().put("list", service.getAllCourse());
		// set view
		modelAndView.setViewName("course-page");
		
		return modelAndView;
	}
}
