package com.yash.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBCUtil class will be use for the Connection of java and jdbc Mysql connection with db name;
 * @author usha.more
 *
 */



public class JDBCUtil 
{
   public static Connection connect() throws Exception{
	   
	 
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false", "root", "root");
	      return con;      
		
	 }
}
