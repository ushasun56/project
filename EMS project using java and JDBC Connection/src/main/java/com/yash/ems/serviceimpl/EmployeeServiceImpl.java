package com.yash.ems.serviceimpl;
/**
 * this class creating a employee list and method implementd here;
 * 
 */

import java.util.Comparator;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.naming.InvalidNameException;

import com.yash.dao.EmployeeDAO;
import com.yash.ems.main.Exception.EmployeeByDepartmentNotFoundException;
import com.yash.ems.main.Exception.EmployeeBySalaryNotFoundException;
import com.yash.ems.main.Exception.EmployeeIdNotFoundException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
import com.yash.ems.util.JDBCUtil;

public  class EmployeeServiceImpl   implements  EmployeeService
{
	/**
	 * list for the Employee which hold the all data about the Employee;
	 */
	ArrayList<Employee> emps =(ArrayList<Employee>) getList();
   
	

	@Override
	public List<Employee> getList() {
		ArrayList<Employee> emp=new ArrayList<Employee>();
	
    {
    	emp.add(new Employee (1 , "usha" ,    30000 , "develpment" ,  "IT",      "pune"));
    	emp.add(new Employee (2 , "nikita" ,  20000 , "develpment" ,  "IT",       "pune" ));
		emp.add(new Employee (3 , "swati" ,   12000 , "testing" ,     "IT",       "pune"   ));
		emp.add(new  Employee(4 , "swapnali" ,15000 , "Teacher" ,     "civil",     "mumbai"));
		emp.add(new Employee (5 , "soham" ,    25000 , "Hr" ,         "civil",     "Mumbai"));
		emp.add(new Employee (6 , "reshma" ,   20000 , "trainer" ,    "mechnical", "pune"));
		 //emp.stream().forEach(e->System.out.println(e));
		return emp;
	}
	}
		/**
		 * Add Employee using JDBC and MYSQL Database;
		 * @param id
		 * @param name
		 * @param designation
		 * @param salary
		 * @param department
		 * @param address
		 * @throws Exception
		 * @throws Exception
		 */
    public void addEmployee(int id,String name,String designation,double salary,String department,String address) throws Exception, Exception {
		EmployeeDAO ed = new EmployeeDAO();
		int n = ed.addEmployee(id, name, designation, salary, department,address);
		System.out.println(n+" Employee Added!");
	 }


	
	
    

//	@Override
//	public void getAllEmployee() {
//		 emp.stream().forEach(e->System.out.println(e));
//		//System.out.println(emp);
//	}
	
	/**
	 * Get Id By all Employee deatils
	 * using Lambda expressions,
	 */

    public Employee getEmployeeById(int id) throws EmployeeIdNotFoundException{ 
		
		try {
			return emps.stream().filter(e->e.getId()==id).findFirst().get();
		}catch(Exception e) {
			throw new EmployeeIdNotFoundException("Please Enter A Valid ID!");
		}
    }

    /**
	 * Get  all Employee deatils
	 * using Lambda expressions,
	 */
	@Override
	public void getAllEmployee() {
		emps.stream().forEach(e->System.out.println(e));
		System.out.println(emps);
		
	}
   
	/**
	 * Get name By all Employee deatils
	 * using Lambda expressions,
	 */
	@Override
	public List<Employee> getEmployeeByName(String name) throws InvalidNameException {
		
			try {
				return emps.stream().filter(e->e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
			}catch(Exception e) {
				throw new InvalidNameException("Please Enter A Valid Name!");
			}
		}
	
	/**
	 * Get department By all Employee deatils
	 * using Lambda expressions,
	 */
	@Override
	public List<Employee> getEmployeeByDept(String dept) throws EmployeeByDepartmentNotFoundException {
		try {
			return emps.stream().filter(e->e.getDepartment().equalsIgnoreCase(dept)).collect(Collectors.toList());
		}catch(Exception e) {
			throw new EmployeeByDepartmentNotFoundException("Please Enter A Valid Department!");
		}
	}

	/**
	 * Get high salary Employee deatils
	 * using Lambda expressions,
	 */
	@Override
	public Employee getHighSalary() {
		return emps.stream().max(Comparator.comparing(Employee::getSalary)).get();
		
	}
 
	/**
	 * Get salary By all Employee deatils
	 * using Lambda expressions,
	 */
	@Override
	public List<Employee> getEmployeeBysal(double salary) throws EmployeeBySalaryNotFoundException {
		try {
			return emps.stream().filter(e->e.getSalary()==salary).collect(Collectors.toList());
		}catch(Exception e) {
			throw new EmployeeBySalaryNotFoundException("Please Enter A Valid Name/Salary");
		}
	}

	/**
	 * Represented employee department list
	 * using Lambda expressions,
	 */

	@Override
	public void getDeptList() {
		emps.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList()).forEach(System.out::println);
		
	}

	

}

	
	
  
	
    
	
	


