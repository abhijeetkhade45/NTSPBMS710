package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
//Getting Bean through Generic getBean Method
public class DependencyMgmtTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		com.nt.sbeans.WishMessageGenerator wishMessageGenerator=ctx.getBean("wmg",com.nt.sbeans.WishMessageGenerator.class);
		System.out.println(wishMessageGenerator.showWishMessage("Abhijeet"));
		ctx.close();
	}

}
