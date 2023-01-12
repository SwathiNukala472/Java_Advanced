package com.test.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPI {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println("Current Date  without time:"+currentDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println("Current Time :"+currentTime);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("LOcal Date Time:"+dateTime);

	}

}
