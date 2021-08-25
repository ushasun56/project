package com.yash.ems.main;
/**
 * 
 * The main Class of Employee.
 */

import java.util.Scanner;
import com.yash.ems.util.JDBCUtil;

import com.yash.dao.EmployeeDAO;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

public class EmsApp
{
  

public static void main(String[] args) throws Exception
  {
	EmployeeServiceImpl e = new EmployeeServiceImpl();
	EmployeeDAO ed = new EmployeeDAO();
	int c = 0;
	while(c==0) {
	
		System.out.println("/* choose Following one option *\\"
				+ "\n1. Get Employee by Name"
				+ "\n2. Get Employees by Department"
				+ "\n3. Get the Employee by  Salary"
				+ "\n4. Get the List of Departments"
				+ "\n5. Get the Maximun Salary"
				+ "\n6.  Get Employe by ID"
				+ "\n7. Add Employee"
				+ "\n8. Get All Employee"
				+ "\n9. show employee from table"
				+ "\n10. Exit");
				
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		/**
		 * Represented the chooice which want user tack;
		 */
		switch(choice) {
		
		case 1:
			System.out.println("Enter the name of the Employee:");
			String name = sc.next();
			System.out.println("Details of the Employee(s)");
			System.out.println(e.getEmployeeByName(name));
			break;
			
		case 2:
			System.out.println("Enter the Department Name :");
			String dept = sc.next();
			System.out.println("Details of the Employee(s)");
			System.out.println(e.getEmployeeByDept(dept));
			break;
			
		case 3:
			System.out.println("Enter the  Salary:");
			double salary = sc.nextDouble();
			System.out.println("Details of the Employee(s) : ");
			System.out.println(e.getEmployeeBysal(salary));
			break;
			
		case 4:
			System.out.println("Departments in the Organization are: ");
			e.getDeptList();
			break;
			
		case 5:
			System.out.println("Highest Paid Employee is : ");
			System.out.println(e.getHighSalary());
			break;
			
		case 6:
			System.out.println("Enter the ID of the Employee:");
			int id = sc.nextInt();
			System.out.println("Details of the Employee(s)");
			System.out.println(e.getEmployeeById(id));
			break;
		
		case 7:
		 	System.out.println("Enter Employee ID:");
			int id1 = sc.nextInt();
			System.out.println("Enter Employee Name:");
			String name11 = sc.next();
			System.out.println("Enter Employee Designation:");
			String des = sc.next();
			System.out.println("Enter Employee Salary:");
			double sal = sc.nextDouble();
			System.out.println("Enter Employee Department:");
			String dep = sc.next();
			System.out.println("Enter Employee Address:");
			String add = sc.next();
			e.addEmployee(id1, name11, des, sal, dep,add);
			break;
		
		  case 8:
    		  System.out.println("All Employee List in Comapny");
    		  EmployeeServiceImpl ser=new EmployeeServiceImpl();
    		  ser.getAllEmployee();
    		 
    		  break;
		  case 9:
			  System.out.println("table data through jdbc");
			  ed.showEmployeeList();
			  
			  break;
			  
		  case 10:
			  break;
			  
	 }
   }
  }
}

      
  
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  

