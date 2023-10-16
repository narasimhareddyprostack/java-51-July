package com.dateApiandOptional;

import java.time.Year;
import java.util.Date;

public class LeaporNotTwo {

	public static void main(String[] args) {
		Year c_Y=Year.of(2000);
		
		if(c_Y.isLeap()) {
			System.out.println("Yes - Given Year is Leap Year");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
