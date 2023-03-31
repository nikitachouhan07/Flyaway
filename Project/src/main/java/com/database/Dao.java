package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class Dao {
	public Connection con=null;
	public Statement st=null;

	public Dao() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Simplilearn");
		System.out.println("connection established with database");
		st=con.createStatement();
	}
}