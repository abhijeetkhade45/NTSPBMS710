package com.nt.sbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courior {
	public String deliver(int oid) {
		return oid+" kept for delevery by Dtdtc";
	}
}
