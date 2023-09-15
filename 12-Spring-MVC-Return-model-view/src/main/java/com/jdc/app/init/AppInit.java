package com.jdc.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jdc.app.root.config.AppRootConfig;
import com.jdc.app.servlet.config.AppServletConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {AppRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class<?>[] {AppServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
