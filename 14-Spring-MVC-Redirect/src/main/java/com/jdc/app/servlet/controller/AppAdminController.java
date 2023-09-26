package com.jdc.app.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jdc.app.model.dto.Course;
import com.jdc.app.model.service.CourseService;

@Controller
@RequestMapping("admin")
public class AppAdminController {
	
	@Autowired
	private CourseService service; 
	
	@GetMapping
	public String index(Model model,
			@RequestParam(value = "userName") String user_name
			) {
		model.addAttribute("name", user_name);
		model.addAttribute("courseList", service.get_all_courses());
		return "course-list";
	}
	
	
	@PostMapping
	public String adminPage(Model model,
			@RequestParam(value = "userName") String user_name
			) {
		model.addAttribute("name", user_name);
		model.addAttribute("courseList", service.get_all_courses());
		return "course-list";
	}
	
	@GetMapping("add")
	public String addCourse(
			@RequestParam(value = "cname") String name,
			@RequestParam(value = "level")	String lvl,
			@RequestParam(value = "duration")	int dura,
			@RequestParam(value = "fees")	int price,
			RedirectAttributes redirect
			) {
	var id = service.create(new Course(name, lvl, dura, price));
		redirect.addFlashAttribute("warning", "Save the Course!!!");
		return "redirect:%d".formatted(id);
	}
	
	@GetMapping(value = "{id:\\d+}")
	public String redirectView(
			@PathVariable int id,
			Model model
			) {
		model.addAttribute("added_course", service.findById(id));
		return "add-list-course";
	}
}
