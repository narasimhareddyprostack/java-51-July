package com.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOne2 {

	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro15", "root", "root");
			
			String sql = "create table emp(eid int, ename varchar(32), esal int)";
			Statement st=con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Table Created");
			
			con.close();
					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
