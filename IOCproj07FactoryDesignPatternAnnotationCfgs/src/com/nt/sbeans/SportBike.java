package com.nt.sbeans;
import org.springframework.stereotype.Component;

@Component("SportBike")
public class SportBike implements Bike {
	public void startBike() {
		System.out.print("Sport Bike Started");
	}
}
