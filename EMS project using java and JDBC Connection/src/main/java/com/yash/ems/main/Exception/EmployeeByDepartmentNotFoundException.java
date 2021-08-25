package com.yash.ems.main.Exception;
/**
 * handle Exception by user define;
 * if department not found then this exception accured;
 * @author usha.more
 *
 */

public class EmployeeByDepartmentNotFoundException extends Exception
{
	
	    public EmployeeByDepartmentNotFoundException(String msg)
	    {
	    	super(msg);
	    }
}
