package com.jsp.Model;

public class Employee {
	private String employeename;
	private int employeeid;
	private double employeesalary;
	private int employeedeptno;
	private Address address;
	
	public Employee()
	{
		
	}
	public Employee(int id,String name,double salary,int deptno,Address address)
	{
		employeename=name;
		employeeid=id;
		employeesalary=salary;
		employeedeptno=deptno;
		this.address=address;
		
	}
	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", employeeid=" + employeeid + ", employeesalary="
				+ employeesalary + ", employeedeptno=" + employeedeptno + ", address=" + address + "]";
	}

	

}
