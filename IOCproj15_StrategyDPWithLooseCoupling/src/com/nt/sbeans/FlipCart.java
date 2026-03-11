package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class FlipCart {
	@Autowired
	@Qualifier("cid")
	private Courior courior;
	public String shopping(double price[],String items[]) {
		double bill=0.0;
		for(double p:price) {
			bill+=p;
		}
		int oid=new Random().nextInt(10000);
		return Arrays.toString(items)+" bill = "+bill+" "+courior.deliver(oid);
	}
}
