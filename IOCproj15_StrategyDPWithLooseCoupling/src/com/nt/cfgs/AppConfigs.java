package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.nt")
@PropertySource("classpath:info.properties")
@ImportResource("classpath:alias.xml")
public class AppConfigs {

}
