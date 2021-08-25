package com.yash.ems.model;
/**
 * Employee project created differnt properties data member
 * @author usha.more
 *
 */

public class Employee 
{
   private int id;
   private String name;
   private double salary;
   private String designation;
   private String department;
   private String address;

   
   /**
    * employee attributes with constructor;
    * @param id
    * @param name
    * @param salary
    * @param designation
    * @param department
    * @param address
    */
   public Employee(int id, String name, double salary, String designation, String department, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.address = address;
	}
   
   
   /**
    * Getter Setter apply here for employee;
    * @return
    */
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee() {
	super();
}

/**
 * toString Method;
 */
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
			+ ", department=" + department + ", address=" + address + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((department == null) ? 0 : department.hashCode());
	result = prime * result + ((designation == null) ? 0 : designation.hashCode());
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (department == null) {
		if (other.department != null)
			return false;
	} else if (!department.equals(other.department))
		return false;
	if (designation == null) {
		if (other.designation != null)
			return false;
	} else if (!designation.equals(other.designation))
		return false;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}

   
   
}
