package com.nt.sbeans;
import java.time.*;
public class WishMessageGenerator {
	private LocalTime time;
	private int age;
	public WishMessageGenerator(LocalTime time, int age) {
		this.time = time;
		this.age = age;
	}
	public String showWishMessage(String user) {
		int hour=time.getHour();
		if(hour<12) {
			return "Good Morning ! "+user+" "+age+"Reached ";
		}
		else if(hour<15) {
			return "Good AfterNoon! "+user+" "+age+"Reached ";
		}
		else if(hour<20) {
			return "Good Evening ! "+user+" "+age+"Reached ";
		}
		else {
			return "Good Night ! "+user+" "+age+"Reached ";
		}
	}
}
