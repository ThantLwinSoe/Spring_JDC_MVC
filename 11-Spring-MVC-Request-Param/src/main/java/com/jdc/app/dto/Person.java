package com.jdc.app.dto;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name;
	private String course;
	private int phonenumber;
	
	public Person(String name, String course, int phonenumber) {
		super();
		this.name = name;
		this.course = course;
		this.phonenumber = phonenumber;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	

}
