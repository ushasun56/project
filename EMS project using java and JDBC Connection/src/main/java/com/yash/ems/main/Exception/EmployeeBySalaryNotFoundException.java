package com.yash.ems.main.Exception;
/**
 * handle Exception by user define;
 * if Employee salary not found then this exception accured;
 * @author usha.more
 *
 */
public class EmployeeBySalaryNotFoundException extends Exception

{
 public EmployeeBySalaryNotFoundException(String msg)
		  {
			  super(msg);
		  }
	}


