package com.gmail.yeatz0408.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsingDateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
		System.out.println(date);
		date = date.plusDays(5).plusMonths(2);
		System.out.println(date);
		
		LocalTime time = LocalTime.of(10, 30);
		System.out.println(time);
		time = time.minusHours(3).plusMinutes(20);
		System.out.println(time);
		
		LocalDateTime localDateTime = LocalDateTime.of(date, time);
		System.out.println(localDateTime);
		localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(3);
		System.out.println(localDateTime);
		
		// exam tricks
		LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
		ld.plusDays(10); // LocalDate is immutable and plus/minus methods return a new LocalDate
		System.out.println(ld); 
		
		LocalTime lt = LocalTime.of(12, 45);
//		lt.addDays(3); // LocalTime doesn't have any date-related methods
		
		
		
		
	}

}
