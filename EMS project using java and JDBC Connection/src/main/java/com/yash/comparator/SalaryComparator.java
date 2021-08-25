package com.yash.comparator;
/**
 * 
 * This Class is for the use comparator of employee salary 
 */

import java.util.Comparator;

import com.yash.ems.model.Employee;

public class SalaryComparator implements Comparator<Employee> {
      
	/**
	 * camapre the salary
	 */
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()<o2.getSalary())
			return -1;
		if(o1.getSalary()>o2.getSalary())
			return 1;
		return 0;
	}
	
}