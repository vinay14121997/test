package com.jsp.Model;

public class Employee 
{
	
	private int id;
	private int deptno;
	private double salary;
	private String name;
	//private and public both are accepted in creation of bean
	private Employee()
	{
		System.out.println("Bean is created");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptno=" + deptno + ", salary=" + salary + ", name=" + name + "]";
	}
	
	

}
