package com.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.dao.impl.DaoImpl;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	DaoImpl dao;	
	@Override
	public void run(String... args) throws Exception {
		//dao.insertRecords();
		List empList=dao.readEmployeeData();
		empList.forEach(emp->System.out.println(emp));

	}

}
