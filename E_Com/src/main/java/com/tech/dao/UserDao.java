package com.tech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tech.service.DBService;

public class UserDao {
	
	DBService db;
	Connection con;
	PreparedStatement pst;
	int i=0;
	public UserDao() {
		db=new DBService();
	}
	
	public int addUser() throws ClassNotFoundException, SQLException {
		con=db.getConnection();
		pst=con.prepareStatement("insert into users(username,password) values(?,?)");
		pst.setString(1, "bharta");
		pst.setString(2,"kathore");
		i=pst.executeUpdate();
		return i;
	}
	
}
