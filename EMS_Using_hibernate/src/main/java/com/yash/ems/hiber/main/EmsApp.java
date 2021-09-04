package com.yash.ems.hiber.main;
/**
 * Implimented main method in EmsApp class
 * Main Motive for This Implimentation Is Cover All CRUD Operation on hibernate 
 * @author usha.more
 *
 */

import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.yash.ems.hiber.model.Employee;
import com.yash.ems.hiber.util.HibernateUtil;






public class EmsApp {
	public static void main(String[] args) 
	{
		 try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		    	
			 /**
			  * Create Employee is use for the setdata into databases; 
			  * this method is implimented using getEmployee()
			  */
		    	//createEmployee(session);
			 /**
			  * getEmployee id use for getting data by ID
			  */
		    	//getEmployeebyId(session);
			 
			 /**
			  * Update data using Id 
			  */
		    	//updateEmployeeById(session);
			 /**
			  * delete Particular  data  using id 
			  */
		    	//deleteEmployeeById(session);
			 /**
			  * fetch all data using HQl query
			  */
			    feachData(session);
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		  }
     /**
      * This Method use For the getting Employee Deatails By Id
      * @param session
      */
	 /*  private static void getEmployeebyId(Session session) {
		Employee employee = session.get(Employee.class, 4);
		if(employee != null){
			System.out.println("\n");
			System.out.println(employee);
		}else{
			System.out.println("Employee doesn't exist with provideded Id..");
		}
		
	}*/
       /**
        * Modify the data using id using existing data in table simple it replace the data for only one 
        * column or more column
        * @param session
        */
	   /*private static void updateEmployeeById(Session session) {
		Employee employee = session.get(Employee.class, 3);
		if(employee != null){
			employee.setName("Smita");
			employee.setSalary(40000.00);
			session.beginTransaction();
			
			session.update(employee);
			session.getTransaction().commit();
			System.out.println("\n");
			System.out.println("Employee modify Sucessfully..");
		}else{
			System.out.println("Employee doesn't exist with provideded Id..");
		}
		
	
	     }*/
      /**
       * Display All Avliable data in table on console
       * @param session
       */
	private static void feachData(Session session) {
		 String HQL = "from Employee";
		 Query query = session.createQuery(HQL);
		 List result = query.getResultList();
		 
		 System.out.println("\n");
		 System.out.println(result);
		
	}
    
	/**
	 * delete the data from Table using id
	 * @param session
	 */
	/*private static void deleteEmployeeById(Session session) {
		
		Employee employee = session.get(Employee.class, 5);
		if(employee != null){
			session.beginTransaction();
			
			session.delete(employee);
			session.getTransaction().commit();
			System.out.println("\n");
			System.out.println("Employee data deleted");
		}else{
			System.out.println("Employee doesn't exist with provideded Id..");
		}
	
	}*/
		
	
		
		
          /**
           * This session use for the create employee and save the session
           * and call method is getEmployee();
           * @param session
           */
		/*private static void createEmployee(Session session) {
		     session.beginTransaction();
		     Integer id =(Integer)session.save(getEmployee());
		     System.out.println("Employee is created  with Id::"+id);
				session.getTransaction().commit();
		
	           }*/
             /**
             * getMethod use for the CreateEmployee;
             * @return employee
             */
		 /*  private static Object getEmployee() {
			Employee employee= new Employee();
			employee.setName("swapnali");
			employee.setSalary(55000);
			employee.setDepartment("IT");
			employee.setDesignation("devloper");
			employee.setAddress("delhi");
			return employee;
		}*/
		
		
		  
		
	}
	

