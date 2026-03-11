package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component("wdf")
public class WeekDayFinder {
	private LocalDate localDate;
	@Autowired
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public String weekDayChake() {
		int day = localDate.getDayOfWeek().getValue();
		if(day>=1 && day<=5) {
			return "weekDay";
		}
		else {
			return "HoliDay";
		}
	}
}
