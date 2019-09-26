package com.tech.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBService {
	
	Connection con;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","bHaRaT@12@12");
		return con;
	}

}
