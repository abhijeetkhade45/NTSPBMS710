package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eBike")
public class ElecricBike implements Bike {

	public void startBike() {
		
		System.out.print("ElectricBike Started");
	}

}
