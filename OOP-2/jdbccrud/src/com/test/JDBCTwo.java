package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTwo {

	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro15", "root", "root");
			
			PreparedStatement st=con.prepareStatement("insert into emp values(101,'Rahul',45000)");
			
			int rows=st.executeUpdate();
			if(rows>0) {
				System.out.println("Data Inserted successfully");
			}
			else {
				System.out.println("Failed");
			}
		}
		
		catch(Exception e) {
			throw new RuntimeException("Unable to connect!");
		}

	}

}
