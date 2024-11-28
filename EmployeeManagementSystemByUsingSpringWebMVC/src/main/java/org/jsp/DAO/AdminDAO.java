package org.jsp.DAO;

import org.jsp.Model.Admin;

public interface AdminDAO {
	
	Admin adminLogin(String emailid,String password);

}
