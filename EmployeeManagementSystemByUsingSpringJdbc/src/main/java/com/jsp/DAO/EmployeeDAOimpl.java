package com.jsp.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component

public class EmployeeDAOimpl implements EmployeeDAO {
	@Autowired
		JdbcTemplate jdbcTemplate;
		
		
		private static String insert_employee_details=
				"insert into employee_details(Employee_name,Employee_salary,"
				+ "Employee_depart_no,Employee_mobile_number)"
				+ "values(?,?,?,?)";
		
public void insertEmployeedetials()
	{
	int result=jdbcTemplate.update(insert_employee_details, "kapil",30000,20,733056212);
	System.out.println(result);

	}

}
