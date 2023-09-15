package com.jdc.app.root.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.jdc.app.model.service","com.jdc.app.model.generator"})
public class AppRootConfig {

}
