package org.jsp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jsp.DAO.UserDAO;
import org.jsp.Model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;
//	@RequestMapping("/userlogin")
//	public String userDetails1(UserInformation userinformation,HttpServletRequest request) {
//		
//	    	HttpSession session=request.getSession();
//	    	int result=userDAO.insertUserDetails(userinformation);
//	    	if(result!=0)
//	    	{
//	    		return"UserLogin";
//	    	}
//	    	else
//	    	{
//	    		return "redirect:/userregistrationpage";
//	    	}
//	    }
	
	@RequestMapping("/userregistrationpage")
	public String userRegistartion() {
		
		return "UserRegistration";
	}
	
	
	
//	@RequestMapping("/userdetails")
//	@ResponseBody
//	public String userDetails(@RequestParam("firstname") String userfirstname,
//			@RequestParam("lastname")String userlastname,@RequestParam("emailid") String useremailid,
//			@RequestParam("password")String userpassword,@RequestParam("mobilenumber")long usermobilenumber,
//			String gender,String address)
//	{	
//		System.out.println(userfirstname);
//		System.out.println(userlastname);
//		System.out.println(useremailid);
//		System.out.println(userpassword);
//		System.out.println(gender);
//		System.out.println(address);
//
//
//		
//	return "User Registraion Successfull.......";
//	}
//@RequestMapping("/userdetails")
//public String userDetails(UserInformation userinformation,HttpServletRequest request) {
//		
//    System.out.println(userinformation);
//    if(userinformation!=null)
//    {
//    	HttpSession session=request.getSession();
//   
//    	session.setAttribute("emailid",userinformation.getEmailid());
//    	session.setAttribute("password",userinformation.getPassword());
//    	return "UserLogin";
//    }
//    else
//    {
//    	return "UserRegistration";
//    }
//		
//}
//	@RequestMapping("/userlogin")
//	@ResponseBody
//	public String userLogin(String emailid,String password)
//	{
//		UserInformation userinformation=userDAO.selectUserDetailsByEmailidAndPassword(emailid,password);
//		if(userinformation!=null) {
//			return "<center><h1>Welcome:"+userinformation.getFirstname()+"</h1></center>";
//		}
//		else
//		{
//			return "UserLogin";
//			
//		}
//	}
//	@RequestMapping("/userlogin")
//	public String login() {
//		return "UserLogin";
//	}
//	

	
	
	
	
	
@RequestMapping("/userlogin")
@ResponseBody
public String userLogin(String emailid,String password,HttpServletRequest request) {
	
	HttpSession session=request.getSession();
	String useremailid=(String)session.getAttribute("emailid");
	String userpassword=(String)session.getAttribute("password");
	if(emailid.equals(useremailid)&&password.equals(userpassword))
	{
		return "Login Sucessfull....";
	}
	else
	{
		return "userlogin";
	}

}
	
	
	
}

