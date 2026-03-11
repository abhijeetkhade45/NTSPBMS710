package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
public class VoterChaker {
	@Value("${voter.id}")
	private int id;
	@Value("${voter.id}")
	private String name;
	@Value("${voter.id}")
	private int age;
	private Date verifiedOn;
	@PostConstruct
	public void myinit() {
		System.out.println("myInit() Executed");
		verifiedOn=new Date();
	}
	@PreDestroy
	public void myDestroy() {
		System.out.println("myDestroy() Executed");
		id=0;
		name=null;
		age=0;
		verifiedOn=null;
		
	}
}
