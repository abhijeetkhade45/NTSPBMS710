package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.*;

public class DependencyMgmtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx =
				 new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		WishMessageGenerator wishMessageGenerator=(WishMessageGenerator)ctx.getBean("wmg");
		System.out.println(wishMessageGenerator.showWishMessage("Abhijeet"));
		ctx.close();
	}

}
