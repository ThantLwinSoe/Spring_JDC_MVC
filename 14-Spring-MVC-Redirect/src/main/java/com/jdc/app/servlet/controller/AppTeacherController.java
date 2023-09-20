package com.jdc.app.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teacher")
public class AppTeacherController {
	
	@GetMapping
	public String teacherPage() {
		return "teacher-list";
	}
}
