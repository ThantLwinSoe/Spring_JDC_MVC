package com.jdc.dto;

import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private List<String> interest;
	
	
	public Student(String name, int age, List<String> interest) {
		super();
		this.name = name;
		this.age = age;
		this.interest = interest;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public List<String> getInterest() {
		return interest;
	}
	
	
	
	

}
