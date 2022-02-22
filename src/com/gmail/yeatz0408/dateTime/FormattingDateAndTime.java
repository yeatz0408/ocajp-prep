package com.gmail.yeatz0408.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateAndTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2010,  Month.APRIL, 15);
		LocalTime time = LocalTime.of(11, 22, 33);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		System.out.println();
		
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		System.out.println();
		
		DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println(shortFormatter.format(dateTime));
		System.out.println(mediumFormatter.format(date));
//		System.out.println(shortFormatter.format(time));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(formatter));

	}

}
