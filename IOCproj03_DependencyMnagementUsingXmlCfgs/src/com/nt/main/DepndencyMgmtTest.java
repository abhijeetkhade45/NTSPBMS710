package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.A;
import com.nt.beans.B;
//Cyclic or Cylindrical Injection using Setter injection
public class DepndencyMgmtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		A a1=(A)ctx.getBean("a1");
		B b1=(B)ctx.getBean("b1");
		System.out.println(a1);
		System.out.println(b1);
	}
}
