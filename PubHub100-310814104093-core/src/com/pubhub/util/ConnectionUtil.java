package com.pubhub.util;
 
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection() throws Exception
	{
    Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/bookapp_db",
			"root",
			"root");
	return connection;
	}
}
