package org.jsp.DAO;


import java.util.List;

import org.jsp.Model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public  class UserDAOimpl implements UserDAO {
     
	@Autowired
	@Qualifier("userjdbctemplate")
	JdbcTemplate jdbctemplate;
	public int insertUserDetails(UserInformation userinformation) {

		{
 String insert="insert into user_information(first_name, last_name, email_id,"
					+ " mobile_number, gender, address, password)values(?,?,?,?,?,?,?)";
 int  result=jdbctemplate.update(insert, userinformation.getFirstname(),
		userinformation.getLastname(),userinformation.getEmailid(),userinformation.getMobilenumber(),
		userinformation.getGender(),userinformation.getAddress(),userinformation.getPassword());
 
 return result;
	}
		}
	
	
	public UserInformation selectUserDetailsByEmailidAndPassword(String emailid,String password) {
		String select="select from user_information where email_id=? and password=?";
	RowMapper<UserInformation>map=(mapRow,rowNum)->{
			
		
			UserInformation information=new UserInformation();
			information.setFirstname(mapRow.getString("first_name"));
			information.setEmailid("email_id");
			information.setPassword("password");
			return information;
		
		
		
	};

try {
	UserInformation userinformation=
			jdbctemplate.queryForObject(select,map,emailid,password);
	return userinformation;
	
} catch (Exception e) {

	return null;
}
	}


	@Override
	public List<UserInformation> getAllUserInformation() {
		String select="select * from user_information";
		RowMapper<UserInformation> map=(mapRow,rowNum)->{
			UserInformation information=new UserInformation();
			information.setFirstname(mapRow.getString("first_name"));
			information.setLastname(mapRow.getNString("last_name"));
			information.setEmailid(mapRow.getNString("email_id"));
			information.setMobilenumber(mapRow.getLong("mobile_number"));
			information.setGender(mapRow.getString("gender"));
			information.setAddress(mapRow.getString("address"));
			return information;

		};
		List<UserInformation> listofUserInformation=jdbctemplate.query(select, map);
		return listofUserInformation;
		
		
		
		
		}
		
	}

