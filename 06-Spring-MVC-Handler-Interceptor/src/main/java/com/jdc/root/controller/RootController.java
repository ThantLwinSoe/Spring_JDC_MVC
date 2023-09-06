package com.jdc.root.controller;

import org.springframework.stereotype.Service;

@Service
public class RootController {
	
	public String doProcess() {
		return "This message from Root";
	}
}
