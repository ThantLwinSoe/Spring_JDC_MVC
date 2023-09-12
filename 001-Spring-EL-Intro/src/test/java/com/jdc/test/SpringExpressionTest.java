package com.jdc.test;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionTest {
	
	private ExpressionParser parser;
	
	@BeforeEach
	public void init() {
		parser = new SpelExpressionParser();
	}
	
	@Test
	public void testExpression() {
	
		var expression = parser.parseExpression("20 + 20");
	
		var result = expression.getValue(Integer.class);
		System.out.println(result);
	}
	
	@Test
	public void testTwo() {
		var expression = parser.parseExpression("{1, 2, 3, 4}");
		var result = expression.getValue(List.class);
		var show = result.size();
		System.out.println(show);
	}
	

}
