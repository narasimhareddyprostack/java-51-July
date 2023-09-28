package streamAPIExOne;

import java.util.ArrayList;

public class StreamAPIEmployee {
public static void main(String[] args) {
	ArrayList<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(101,"Rahul",45000.00));
	employees.add(new Employee(102,"Sonia",55000.00));
	employees.add(new Employee(103,"Priyanka",65000.00));
	employees.add(new Employee(104,"Modi",500.00));
	/*
	for(Employee emp:employees) {
		if(emp.getEsal() > 1000) {
			System.out.println(emp.getEid()+":"+emp.getEname()+":"+emp.getEsal());
		}
	}
	*/
	employees.stream().filter(emp->emp.getEsal() >1000)
				      .forEach(emp->System.out.println(emp.getEid()));
	
}	
}
