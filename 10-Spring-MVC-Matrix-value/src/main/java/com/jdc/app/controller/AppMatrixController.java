package com.jdc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/matrixpage")
public class AppMatrixController {
	
	
	@RequestMapping("{product}")
	public String matrixValue(
			@PathVariable String product,
			@MatrixVariable	String size,
			@MatrixVariable	Integer price,
				Model model
			) {
		model.addAttribute("product", product);
		model.addAttribute("size", size);
		model.addAttribute("price", price);
		return "productPage";
	}
}
