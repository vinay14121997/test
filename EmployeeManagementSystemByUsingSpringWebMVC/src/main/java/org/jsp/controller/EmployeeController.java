package org.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	@RequestMapping("/registrationpage")
	public String employeeRegistraionPage() {
		return "EmployeeRegistration";
	}
	
	
	@RequestMapping("/registration")
	@ResponseBody
	public String employeeRegistration() {
//		System.out.println("Employee Registration Sucessfull.....");
		return "Employee Registration";
		
	}
	@RequestMapping("/deletion")
	@ResponseBody
	public String employeeDeletion() {
//		System.out.println("Employee Details Deleted.....");
		return "Employee Deleted";
	}
	@RequestMapping("/updation")
	@ResponseBody
	public String employeeUpdation() {
//		System.out.println("Employee Details Updated.....");
		return "Employee Updated";
		
	}
	@RequestMapping("/selection")
	@ResponseBody
	public String employeeSelection() {
//		System.out.println("Employee Details Selected.....");
		return "Employee Selected";
	}
        	
		@RequestMapping("/employeedetails")
		@ResponseBody
		public String employeeDetails(String name,double salary,int deptno) {
			
			return "<center><b>Employee Registration Successfull.....</b></center>";
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

