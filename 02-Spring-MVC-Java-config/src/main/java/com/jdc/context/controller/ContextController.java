package com.jdc.context.controller;

import org.springframework.stereotype.Service;

@Service
public class ContextController {
	
	public String doSomething() {
		return "This message from root application context.";
	}

}
