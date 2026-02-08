package com.nt.sbeans;
import java.time.*;
public class WishMessageGnerator {
	
	private LocalTime time;
	
	
	public void setTime(LocalTime time) {
		this.time = time;
	}


	public String  showWishMessage(String user) {
		int hour=time.getHour();
		if(hour<12) {
			return "Good Morning !! "+user+"...";
		}
		else if(hour<16) {
			return "Good AfterNoon !! "+user+"...";
		}
		else if(hour<12) {
			return "Good Evining !! "+user+"...";
		}
		else {
			return "Good Night !! "+user+"...";
		}
	}
	
}
