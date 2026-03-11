package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfigs;
import com.nt.sbeans.BikeFactory;

public class ClientApp {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfigs.class);
		BikeFactory bikeFactory=ctx.getBean("bf",BikeFactory.class);
		bikeFactory.getBike("ebike").startBike();
	}
}
