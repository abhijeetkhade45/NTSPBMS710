package com.nt.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("bf")
public class BikeFactory {
	@Autowired
	private Map<String, Bike> bikes;
	public Bike getBike(String type) {
		if(type.equalsIgnoreCase("ebike")) {
			return bikes.get("eBike");
		}
		else if(type.equalsIgnoreCase("sbike")) {
			return bikes.get("sBike");
		}
		else {
			return null;
		}
	}
}
