package com.jdc.app.servlet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.jdc.app.servlet.controller","com.jdc.app.other.controller"})
public class AppServletConfig implements WebMvcConfigurer{
	
		@Override
		public void configureViewResolvers(ViewResolverRegistry registry) {
			
			registry.jsp("/views/", ".jsp");
		}
	
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addRedirectViewController("/", "/homepage");
		}
		
}
