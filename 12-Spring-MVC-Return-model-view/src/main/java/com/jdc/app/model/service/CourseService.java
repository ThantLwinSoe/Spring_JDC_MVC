package com.jdc.app.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.app.model.dto.Course;
import com.jdc.app.model.generator.CourseCodeGenerator;

import jakarta.annotation.PostConstruct;

@Service
public class CourseService {
	
	private List<Course> repo;
	@Autowired
	private CourseCodeGenerator generator;
	
	public CourseService() {
		this.repo = new ArrayList<>();
	}
	
	@PostConstruct
	public void init() {
		create(new Course("Java Basic","Basic",7,200000));
		create(new Course("Spring","Advance",12,700000));
		create(new Course("Linux Fandamental","Basic",5,300000));
		create(new Course("Full Stack","Advance",12,800000));	
	}
	
	
	public void create(Course course) {
		
		int id = generator.next();
		course.setId(id);
		repo.add(course);
	}
	
	public List<Course> getAllCourse() {
		return new ArrayList<Course>(repo);
	}
	
	public Course findById(int id) {
		
		return repo.stream().filter( c -> c.getId() == id)
				.findAny().orElse(null);
	}

}
