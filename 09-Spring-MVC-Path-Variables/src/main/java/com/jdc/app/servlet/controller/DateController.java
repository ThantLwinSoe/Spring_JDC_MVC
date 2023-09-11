package com.jdc.app.servlet.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datepage")
public class DateController {
	
	@RequestMapping("{date:\\d{4}\\-\\d{2}\\-\\d{2}}")
	public String showDate(
			@PathVariable LocalDate date,
			Model model) {
		model.addAttribute("dd", date);
		return "appDate";
	}
}
