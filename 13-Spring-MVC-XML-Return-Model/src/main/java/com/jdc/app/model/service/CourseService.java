package com.jdc.app.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jdc.app.model.dto.Course;
import com.jdc.app.model.generator.CouseCodeGenerator;

import jakarta.annotation.PostConstruct;

@Service
public class CourseService {
	
	private List<Course> repo;
	
	@Autowired
	private CouseCodeGenerator generator;
	
	public CourseService() {
		repo = new ArrayList<>();
	}
	
	@PostConstruct
	public void init() {
		create(new Course("Java Fundamental","Basic",6,300000));
		create(new Course("Linux System Adminstrator","Advance",12,700000));
		create(new Course("Spring","Advance",8,700000));
		create(new Course("Angular","Advance",6,800000));
		create(new Course("AWS architect","Advance",12,900000));
	}
	
	public void create(Course course) {
		int id = generator.next();
		course.setId(id);
		repo.add(course);
	}
		
	
	public List<Course> getCourseAll() {
		
		return new ArrayList<Course>(repo);
	}

}
