package org.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/registration")
	public void studentRegistration() {
		
		System.out.println("Student Registration Sucessfull......");
		
	}
	@RequestMapping("/updation")
	public void studentUpdation() {
		
		System.out.println("Student Details Updated......");
		
	}
	@RequestMapping("/deletion")
	public void studentDeletion() {
		
		System.out.println("Student Details Deleted......");
	}
	@RequestMapping("/selection")
	public void studentSelection() {
		
		System.out.println("Student Details Selected......");
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
