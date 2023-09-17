package com.jdc.app.model.generator;

import org.springframework.stereotype.Component;

@Component
public class CouseCodeGenerator {
	
	private int id;
	
	public int next() {
		return ++id;
	}
	
}
