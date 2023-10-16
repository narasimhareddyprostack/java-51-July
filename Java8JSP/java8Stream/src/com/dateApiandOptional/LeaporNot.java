package com.dateApiandOptional;

import java.util.Date;

public class LeaporNot {

	public static void main(String[] args) {
		Date dt=new Date();
		dt.setYear(1987);
		System.out.println(dt.getYear());
		if(dt.getYear() % 4 == 0) {
			System.out.println("Year is Leap Year");
		}
		else {
			System.out.println("No");
		}
	}

}
