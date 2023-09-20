package com.jdc.app.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.app.model.dto.Course;
import com.jdc.app.model.generator.CourseGenerator;

import jakarta.annotation.PostConstruct;

@Service
public class CourseService {
	
	private List<Course> repo;
	
	@Autowired
	private CourseGenerator generator;
	
	public CourseService() {
		repo = new ArrayList<>();
	}
	
	@PostConstruct
	public void init() {
		create(new Course("Japanese Grammar and Kanji N5","Basic ",4,200000));
		create(new Course("Japanese Grammar and Kanji N4","Basic",4,250000));
		create(new Course("Japanese Grammar and Kanji N3","Intermediate",6,300000));
		create(new Course("Japanese Grammar and Kanji N2","Intermediate",6,350000));
		create(new Course("Japanese Speaking","Intermediate",4,230000));
		create(new Course("Japanese Reading","Intermediate",5,500000));
		
		
	}
	
	
	public void create(Course course) {
		var id = generator.course_id_generate();
		course.setId(id);
		repo.add(course);
	}
	
	public List<Course> get_all_courses(){
		
		return new ArrayList<Course>(repo);
	}
	
	
}
