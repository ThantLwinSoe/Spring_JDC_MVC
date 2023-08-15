package com.jdc.init;

import org.springframework.web.WebApplicationInitializer;

public class AppInit implements WebApplicationInitializer {

	@Override
	public void onStartup(jakarta.servlet.ServletContext servletContext) throws jakarta.servlet.ServletException {
		// Register Servlet
		
				var dispatcher = new DispatcherServlet();
				dispatcher.setContextConfigLocation("/WEB-INF/mvc-config.xml");
				var servlet = servletContext.addServlet("dispatcher",dispatcher );
				servlet.setLoadOnStartup(1);
				
				servlet.addMapping("/");
				
				servletContext.setInitParameter("contextConfigLocation", "/WEB-INF/root-config.xml");
				
				var context = new ContextLoaderListener();
				servletContext.addListener(context);
				
		
	}

}
