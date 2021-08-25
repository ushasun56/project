package com.yash.dao;
/**
 * 
 * Dao layer implimented the jdbc and add and display value through jdbd using mysql databses;
 * also inclued prepared statement for insertion and statement use for thedisplay the value
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

import com.mysql.jdbc.Statement;
import com.yash.ems.util.JDBCUtil;

import jdk.internal.org.jline.utils.Log;



public class EmployeeDAO   implements EmployeeInterface
{
	 
	Logger logger=Logger.getAnonymousLogger();
	Scanner sc =new Scanner(System.in);
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param designation
	 * @param salary
	 * @param department
	 * @param address
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 * 
	 * addEmployee() implimented;
	 */
	
	public int addEmployee(int id,String name,String designation,double salary,String department, String address) throws SQLException, Exception {
		try(Connection con = JDBCUtil.connect();){
			String sql = "insert into employee values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, designation);
			ps.setDouble(4, salary);
			ps.setString(5, department);
			ps.setString(6, address);
			return ps.executeUpdate();
		}
	}
      
	/**
	 * 
	 * showEmployeeList() implimented through jdbc connection
	 */
	
	@Override
	public void showEmployeeList() throws Exception 
	{
		try(Connection con = JDBCUtil.connect();
			Statement st=(Statement) con.createStatement();)
		
		{
			 	
		 logger.info("\n employee details:\n");
		 String sql="Select * from employee";
		 
		 ResultSet rs = st.executeQuery(sql);
		 
		 while(rs.next())
		 {
			 logger.info("\nEmployee id: "+rs.getInt(1)
			  +"\nName: "+rs.getString(2)
			  +"\ndesignation: "+rs.getString(3)
			 +"\nsalary: "+rs.getDouble(4)
			  +"\ndepartment: "+rs.getString(5)
			  +"\naddress: "+rs.getString(2)  );
		    
		 }
		
       }
	}

	
	
}
	



