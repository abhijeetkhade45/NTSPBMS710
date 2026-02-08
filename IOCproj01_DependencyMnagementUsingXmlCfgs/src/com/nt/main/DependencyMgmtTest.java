package com.nt.main;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGnerator;
public class DependencyMgmtTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx =
				 new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		WishMessageGnerator wishMessageGenerator=(WishMessageGnerator)ctx.getBean("wmg");
		System.out.println(wishMessageGenerator.showWishMessage("Abhijeet"));
		ctx.close();
	}

}
