package com.gmail.yeatz0408.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriods {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2020, Month.APRIL, 30);
		
		Period period = Period.of(1, 1, 1);
		System.out.println(period);
		
		cleanAnimalCage(start, end, period);

	}
	
	public static void cleanAnimalCage(LocalDate start, LocalDate end) {
		while (start.isBefore(end)) {
			System.out.println("Clean the cage on " + start);
			start = start.plusMonths(1);
		}
	}
	
	public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
		while (start.isBefore(end)) {
			System.out.println("Clean the cage on " + start);
			start = start.plus(period);
		}
	}

}
