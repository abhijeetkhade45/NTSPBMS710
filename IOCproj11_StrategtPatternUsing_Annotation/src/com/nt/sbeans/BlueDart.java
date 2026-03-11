package com.nt.sbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements Courior  {
	public String deliver(int oid) {
		return oid+" kept for delevery by BlueDart";
	}
}
