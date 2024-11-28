package com.jsp.FirstMavenProject;

import com.jsp.DAO.UserDAO;
import com.jsp.DAO.UserDAOimpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	UserDAO dao=new UserDAOimpl();
    	//dao.insertUserInformationObject();
    	//dao.selectUserInformationusingUserId(4);
    	//dao.UpdateuserPasswordByUsingid(2, "9999");
    	//dao.updatepasswordusingemailid("1111","sai@gmail.com");
    	//dao.deletetheuserdetailsbyusingmobilenumber(7536241234l);
    	//dao.selectUserInformationusingUserId(2);
    	dao.selecttheuserdetailsusinggender("male");
    	
    	
    	
    	}
}
