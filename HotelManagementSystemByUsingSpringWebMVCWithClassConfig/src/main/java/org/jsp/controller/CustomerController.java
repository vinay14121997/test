package org.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@RequestMapping("/customerregistration")
	public String CustomerRegistration() {
//		System.out.println("Method is called for registration.....");

        return "CoustomerRegistration";
	}

}
