package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wmg")
public class SeasonFinder {
	private LocalDate localDate;
	@Autowired
	public void setLocalDate(LocalDate loaDate) {
		this.localDate=loaDate;
	}
	public String showSeasonName() {
		int month=localDate.getMonthValue();
		if(month>=3 && month<=6) {
			return "Summer";
		}
		else if(month>=7 && month<=10) {
			return "Winter";
		}
		else {
			return "Monsoon";
		}
	}
}
