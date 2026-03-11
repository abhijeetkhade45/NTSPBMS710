package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.cfgs.AppConfigs;
import com.nt.sbeans.WeekDayFinder;

public class DependencyMgmtTest {
public static void main(String args[]) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigs.class);
	WeekDayFinder wishMessageGenerator=ctx.getBean("wdf",WeekDayFinder.class);
	System.out.println(wishMessageGenerator.weekDayChake());
	ctx.close();
}
}
