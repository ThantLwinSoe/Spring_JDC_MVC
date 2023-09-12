package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.jdc.dto.Student;

public class TestRootObject {
	
	
	@Test
	public void test_root_object() {
		
		var student = new Student("Aung Myin", 29, List.of("Linux","Java","Rust"));
		
		var parser = new SpelExpressionParser();
		
		var expression = parser.parseExpression("age");
		var age = expression.getValue(student,Integer.class);
		System.out.println(age);
		
		assertEquals(age, 29);
	}

}
