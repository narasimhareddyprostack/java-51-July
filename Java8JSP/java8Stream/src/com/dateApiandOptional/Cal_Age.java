package com.dateApiandOptional;

import java.time.LocalDate;
import java.time.Period;

public class Cal_Age {

	public static void main(String[] args) {
		//current Date
		LocalDate c_Date=LocalDate.now();
		
		System.out.println(c_Date);
		LocalDate dob_Date = LocalDate.of(1983, 7, 10);
		System.out.println(dob_Date);
		//Calucaulte Age
		Period p = Period.between(dob_Date, c_Date);
		System.out.println("No of Years:"+p.getYears() + "   "+ p.getMonths()+" Months" + p.getDays()+" Days");

	}

}
