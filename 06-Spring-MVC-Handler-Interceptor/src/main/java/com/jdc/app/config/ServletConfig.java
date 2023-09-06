package com.jdc.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jdc.app.interceptor.AppHandlerInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.jdc.app.controller","com.jdc.app.interceptor"})
public class ServletConfig implements WebMvcConfigurer{
	
	@Autowired
	private AppHandlerInterceptor appInterceptor;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/yes");
	}
	
	@Bean
	public ViewResolver jspViewResolver() {
		
		return new InternalResourceViewResolver("/views/",".jsp");
	}
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(appInterceptor);
	}
		
}
