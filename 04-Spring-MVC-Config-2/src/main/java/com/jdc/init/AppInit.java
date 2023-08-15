package com.jdc.init;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class AppInit implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		var dispatch = new DispatcherServlet();
		dispatch.setContextConfigLocation("/WEB-INF/mvc-config.xml");
		var servlet = servletContext.addServlet("dispatch", dispatch);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		servletContext.setInitParameter("contextConfigLocation", "/WEB-INF/root-config.xml");
		var context = new ContextLoaderListener();
		servletContext.addListener(context);
		
	}

}
