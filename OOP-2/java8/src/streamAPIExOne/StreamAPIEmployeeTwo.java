package streamAPIExOne;

import java.util.ArrayList;

public class StreamAPIEmployeeTwo {
public static void main(String[] args) {
	ArrayList<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(101,"Rahul",45000.00));
	employees.add(new Employee(102,"Sonia",55000.00));
	employees.add(new Employee(103,"Priyanka",65000.00));
	employees.add(new Employee(104,"Modi",500.00));
	//Print - All employyes- Total Sal
	
	double total=0;
	for(Employee emp:employees) {
		total = total + emp.getEsal();
	}
	System.out.println(total);
	//double total_Sal = employees.stream().red	
}	
}
