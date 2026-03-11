package com.nt.sbeans;
import java.time.LocalDate;
import java.time.LocalTime;
//Setter Injection
public class WishMessageGenerator {
	
	private LocalTime time;
	private LocalDate date;
	private int age;
	
	

	public WishMessageGenerator(LocalTime time, LocalDate date, int age) {
		super();
		this.time = time;
		this.date = date;
		this.age = age;
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
