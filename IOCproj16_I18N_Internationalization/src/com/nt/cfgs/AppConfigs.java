package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfigs {
	@Bean("messageSource")
public ResourceBundleMessageSource getRBMS() {
	ResourceBundleMessageSource RBMS=new ResourceBundleMessageSource();
	RBMS.setBasename("App");
	
	return RBMS;
}
}
