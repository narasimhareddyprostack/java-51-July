package com.employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamApiFive {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(24,67,89,433,2,0,10);
			
		//first second highest values
		int high=numbers.stream().sorted(Collections.reverseOrder())
						.distinct()
						.findFirst().get();
		System.out.println(high);
	}

}
