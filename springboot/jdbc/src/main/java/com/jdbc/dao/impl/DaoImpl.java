package com.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jdbc.dao.DaoI;

@Component
public class DaoImpl implements DaoI {

	@Autowired
	JdbcTemplate jt;
	@Override
	public void insertRecords() {
		jt.update("insert into employee values(101,'Rahul',45000)");
		jt.update("insert into employee values(102,'Sonia',55000)");
		jt.update("insert into employee values(103,'Priyanka',65000)");
		jt.update("insert into employee values(104,'Modi',95000)");

	}

	@Override
	public List readEmployeeData() {
		
		return jt.queryForList("select * from employee");
	}

}
