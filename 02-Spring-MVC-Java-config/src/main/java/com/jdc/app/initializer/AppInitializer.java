package com.jdc.app.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		
		// Register DispatcherServlet  
		DispatcherServlet dispatcher = new DispatcherServlet();
		dispatcher.setContextConfigLocation("/WEB-INF/mvc-config.xml");
		var servlet=ctx.addServlet("dispatcher", dispatcher);	
		servlet.setLoadOnStartup(1);
		
		// Add Mapping
		servlet.addMapping("/");
		
		ctx.setInitParameter("contextConfigLocation", "/WEB-INF/root-config.xml");
		
		// Context Loader
		var context = new ContextLoader();
	}

	

}
