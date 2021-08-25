package com.yash.ems.service;
/**
 * list of Empolyee method which want to implemented
 * 
 */

import java.util.List;

import javax.naming.InvalidNameException;

import com.yash.ems.main.Exception.EmployeeByDepartmentNotFoundException;
import com.yash.ems.main.Exception.EmployeeBySalaryNotFoundException;
import com.yash.ems.main.Exception.EmployeeIdNotFoundException;
import com.yash.ems.model.Employee;

public interface EmployeeService
{
	public void getAllEmployee(); 
	public Employee getEmployeeById(int id) throws EmployeeIdNotFoundException;
	public List<Employee> getEmployeeByName(String name) throws InvalidNameException;
    public List<Employee> getEmployeeByDept(String name) throws EmployeeByDepartmentNotFoundException;
    public Employee getHighSalary();
	public List<Employee> getEmployeeBysal(double salary) throws EmployeeBySalaryNotFoundException;
	public void getDeptList();
	public List<Employee> getList();
    
	
}