package org.jsp.DAO;

import org.jsp.Model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class AdminDAOimpl implements AdminDAO {

	@Autowired
	@Qualifier("adminjdbctemplate")
	JdbcTemplate jdbcTemplate;
	public Admin adminLogin(String emailid, String password) {
		
		String select="select * from admin where emailid=? and password=?";
		RowMapper<Admin> map=(rs,rowNum)->{
			Admin admin=new Admin();
			return admin;
		};
		try {
			return jdbcTemplate.queryForObject(select,map,emailid,password);
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;

		}
		}
		
	}


