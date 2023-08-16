package com.jdc.model;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Service
public class AppModel {
	
	public String doWork() {
		return "Version 2 from model Service of Root Application!!!";
	}

}
