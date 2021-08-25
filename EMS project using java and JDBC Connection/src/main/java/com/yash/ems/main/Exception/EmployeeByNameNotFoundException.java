package com.yash.ems.main.Exception;
/**
 * handle Exception by user define;
 * if Employee Name not found then this exception accured;
 * @author usha.more
 *
 */

public class EmployeeByNameNotFoundException extends Exception
{

	public  EmployeeByNameNotFoundException(String msg)
	  {
		  super(msg);
	  }
}
