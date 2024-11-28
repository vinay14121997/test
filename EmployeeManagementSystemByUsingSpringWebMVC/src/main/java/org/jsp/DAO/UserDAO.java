package org.jsp.DAO;

import java.util.List;

import org.jsp.Model.UserInformation;

public interface UserDAO {
	
    int insertUserDetails(UserInformation userInformation);
    UserInformation selectUserDetailsByEmailidAndPassword(String emailid,String password);
    List<UserInformation> getAllUserInformation(); 
	
}
