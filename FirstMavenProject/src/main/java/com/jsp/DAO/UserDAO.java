package com.jsp.DAO;

public interface UserDAO {
	
	 void insertUserInformationObject();
	 void selectUserInformationusingUserId(int userid);
	 void UpdateuserPasswordByUsingid(int userid,String password);
	 void deleteuserdetailsbyusingid(int id);
	 void updatepasswordusingemailid(String password,String emailid);
	 void deletetheuserdetailsbyusingmobilenumber(long mobilenumber);
	 void selecttheuserdetailsbyusinguserid(int id);
	 void selecttheuserdetailsusinggender(String gender);

}
