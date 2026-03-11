package com.nt.sbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class DTDC implements Courior {
	public String deliver(int oid) {
		return oid+" kept for delevery by Dtdtc";
	}
}
