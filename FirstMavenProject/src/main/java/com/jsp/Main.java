package com.jsp;

import com.jsp.DAO.UserDAO;
import com.jsp.DAO.UserDAOimpl;

public class Main {
	public static void main(String[] args) {
		
		UserDAO dao=new UserDAOimpl();
		dao.insertUserInformationObject();
		System.out.println("Data Inserted");
	}

}
