package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bike")
@Scope("prototype")
public class Bike {
	@Value("${bike.color}")
	public
	 String color;
}
