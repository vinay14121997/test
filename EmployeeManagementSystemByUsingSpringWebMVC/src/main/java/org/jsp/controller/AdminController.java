package org.jsp.controller;

import java.util.List;

import org.jsp.DAO.AdminDAO;
import org.jsp.DAO.UserDAO;
import org.jsp.Model.Admin;
import org.jsp.Model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
	@Autowired
	AdminDAO admindao;
	@Autowired
	UserDAO userDAO;
	



    @RequestMapping("/adminlogin")
    //@ResponseBody
	public String adminLogin( String emailid, String password,Model model) {
    	Admin adminLogin=admindao.adminLogin(emailid, password);
    	if(adminLogin!=null)
    	{
    		
    	List<UserInformation> allUserInformation=userDAO.getAllUserInformation();
    	model.addAttribute("alluserdetails", allUserInformation);
    	return "AllUserDetails";
    	}
    	else
    	{
    		return  "redirect:/adminloginpage";
    	}
		

	}
    @RequestMapping("/adminloginpage")
	public String adminLoginPage()
	{
		return "AdminLogin";
	}
}


	


    
