package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionTest {
	
	@Test
	public void testExpression() {
		
		var operation = "10 + 5";
		var parser = new SpelExpressionParser();
		var expression = parser.parseExpression(operation);
		var result = expression.getValue(Integer.class);
		System.out.println(result);
	}

}
