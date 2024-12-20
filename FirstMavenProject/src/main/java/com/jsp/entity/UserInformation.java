package com.jsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class UserInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int userid;
	@Column(name="First_name",length=45)
	private String firstname;
	@Column(name="Last_name",length=45)
	private String lastname;
	@Column(name="Email_Id",unique=true,nullable=false,length=45)
	private String emailid;
	@Column(unique = true,nullable=false,length=4)
	private String password;
	@Column(unique = true,nullable = false,length =10)
	private long mobilenumber;
	private String gender;
	 
	public UserInformation() {
		
	}

	public UserInformation(int userid, String firstname, String lastname, String emailid, long mobilenumber,
			String gender) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password=password;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public String getpassword() {
		return password;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserInformation [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailid=" + emailid + ", mobilenumber=" + mobilenumber + ", gender=" + gender + "]";
	}
	
	

}
