package com.pubhub.util;
 
import java.sql.Connection;


public class TestConnectionUtil {
	public static void main(String[] args) throws Exception {
		
		
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

	    
}
}