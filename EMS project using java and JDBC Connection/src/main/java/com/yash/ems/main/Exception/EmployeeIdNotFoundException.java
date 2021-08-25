package com.yash.ems.main.Exception;

/**
 * handle Exception by user define;
 * if Employee ID not found then this exception accured;
 * @author usha.more
 *
 */
public class EmployeeIdNotFoundException  extends Exception
{

	public EmployeeIdNotFoundException(String msg) 
	{
		super(msg);
	}

}
