package com.nt.sbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class BlueDart implements Courior  {
	public String deliver(int oid) {
		return oid+" kept for delevery by BlueDart";
	}
}
