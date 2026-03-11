package com.nt.clients;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.configs.AppConfig;
import com.nt.sbeans.BikeFactory;
import com.nt.sbeans.ElectricBike;

public class FactoryDpTest {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		BikeFactory bikeFactory=ctx.getBean("bikeFactory",BikeFactory.class);
		bikeFactory.getBike("SportBike").startBike();
	}
}
