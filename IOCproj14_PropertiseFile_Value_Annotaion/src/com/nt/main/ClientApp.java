package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import com.nt.cfgs.AppConfigs;
import com.nt.sbeans.Bike;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfigs.class);
		Bike b1=ctx.getBean("bike",Bike.class);
		System.out.println(b1.color);

	}

}
