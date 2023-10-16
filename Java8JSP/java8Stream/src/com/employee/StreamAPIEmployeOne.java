package com.employee;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIEmployeOne {

	public static void main(String[] args) {
	List<Employee>	emp_List=new ArrayList<Employee>();
	emp_List.add(new Employee(101,"rahul",45000.00));
	emp_List.add(new Employee(102,"priya",65000.00));
	emp_List.add(new Employee(103,"rajni",95000.00));
	emp_List.add(new Employee(104,"sonia",75000.00));
	emp_List.add(new Employee(105,"nayana",25000.00));
	emp_List.add(new Employee(106,"raj",15000.00));
	
	
	//print all employees , their name starts with 'r'
	//print all employees , thier sal more than 20000
	
	for(Employee emp:emp_List) {
	if(check(emp)) {
	System.out.println("Emp Id:"+emp.getEid()+"-Emp Name:"+emp.getEname());	
	}	
	}
	
	}
	static boolean check(Employee e) {
		if(e.getEname().startsWith("r")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
