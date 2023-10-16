package com.employee;

import java.util.stream.Stream;

public class StreamExSix {

	public static void main(String[] args) {
		Stream s=Stream.of(10,20,30,40);
		
		s.forEach(ele->System.out.println(ele));
		
		s.sorted();
		
	}

}
