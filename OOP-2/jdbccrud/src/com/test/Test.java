package com.test;

class Emp{
	
}
public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Class obj1=Class.forName("java.lang.String");
		Class obj2=Class.forName("java.util.ArrayList");
		Class obj3=Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
