package com.nt.main;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;
//Getting Bean through Generic getBean Method
public class DependencyMgmtTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx =
				 new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		WishMessageGenerator wishMessageGenerator=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wishMessageGenerator.showWishMessage("Abhijeet"));
		ctx.close();
	}

}
