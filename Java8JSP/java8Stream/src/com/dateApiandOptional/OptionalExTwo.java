package com.dateApiandOptional;

import java.util.Optional;

public class OptionalExTwo {

	public static void main(String[] args) {
		//re-create null pointer excetion
		String[] enames=new String[10];
		enames[0]="Rahul";
		enames[1]="Sonia";
		
		
		Optional<String> value=Optional.ofNullable(enames[1]);
		System.out.println(value.get());
		if(value.isPresent()) {
			System.out.println(value.get().toUpperCase());
		}
		else {
			System.out.println("Error");
		}
	}

}
