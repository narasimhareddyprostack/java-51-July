package com.jdbc.crud;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		String ename ="Rahul";
		System.out.println(ename);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Salary");
		double sal =Double.parseDouble(sc.nextLine());
				System.out.println(ename);
				System.out.println(sal);
				System.out.println(num);
	}

}
