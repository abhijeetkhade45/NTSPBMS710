package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sBike")
public class SportBike implements Bike {

	@Override
	public void startBike() {
		
		System.out.print("Sport Started");
	}


}
