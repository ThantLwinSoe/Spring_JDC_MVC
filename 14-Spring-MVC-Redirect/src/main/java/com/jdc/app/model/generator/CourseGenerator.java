package com.jdc.app.model.generator;

import org.springframework.stereotype.Component;

@Component
public class CourseGenerator {
	
	private int id;
	
	public int course_id_generate() {
		return ++id;
	}

}
