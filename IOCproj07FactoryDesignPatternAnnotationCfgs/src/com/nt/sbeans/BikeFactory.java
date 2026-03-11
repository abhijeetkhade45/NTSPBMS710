package com.nt.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BikeFactory {
	@Autowired
	Map<String,Bike> bikeList;
	public Bike getBike(String type) {
		if(type.equals("SportBike")){
			return bikeList.get(type);
		}
		else if(type.equals("electricBike")) {
			return bikeList.get(type);
		}
		return null;
	}
}
