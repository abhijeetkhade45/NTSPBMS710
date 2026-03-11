package com.nt.sbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bike")
@Scope("prototype")
public class Bike {
	private String color="Red";
}
