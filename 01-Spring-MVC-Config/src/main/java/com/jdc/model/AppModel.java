package com.jdc.model;

import org.springframework.stereotype.Service;

@Service
public class AppModel {
	
	public String doWork() {
		return "Hello from model Service of Root Application!!!";
	}

}
