package com.evergent.corejava.collections2.FINALPROJECT;

import java.sql.Connection;
import java.sql.DriverManager;

public class PGDb {
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
		return con;
		
	}

}
