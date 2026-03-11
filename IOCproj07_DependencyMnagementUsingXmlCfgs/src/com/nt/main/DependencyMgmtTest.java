package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;
//Getting Bean through Generic getBean Method
public class DependencyMgmtTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		SeasonFinder wishMessageGenerator=ctx.getBean("wmg",SeasonFinder.class);
		System.out.println(wishMessageGenerator.showSeasonName());
		ctx.close();
	}

}