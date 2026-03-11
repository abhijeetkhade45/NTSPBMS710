package com.nt.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfigs {
@Bean
public LocalDate getLocalDate() {
	return LocalDate.now();
}
}
