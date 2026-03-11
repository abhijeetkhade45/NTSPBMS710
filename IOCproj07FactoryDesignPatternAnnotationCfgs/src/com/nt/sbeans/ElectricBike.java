package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("electricBike")
public class ElectricBike implements Bike {
	public void startBike() {
		System.out.print("Electric Bike Started");
	}
}
