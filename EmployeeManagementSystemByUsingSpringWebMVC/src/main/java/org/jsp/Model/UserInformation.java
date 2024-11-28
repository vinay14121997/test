package org.jsp.Model;

public class UserInformation {
	
 private String firstname;
 private String lastname;
 private String emailid;
 private String gender;
 private long mobilenumber;
 private String address;
 private String password;
 
 public UserInformation() {
	// TODO Auto-generated constructor stub
}

public UserInformation(String firstname, String lastname, String emailid, String gender, long mibilenumber,
		String address,String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailid = emailid;
	this.gender = gender;
	this.mobilenumber = mobilenumber;
	this.address = address;
	this.password=password;
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public long getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
	

}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "UserInformation [firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid + ", gender="
			+ gender + ", mobilenumber=" + mobilenumber + ", address=" + address + ",password="+password+"]";
}
 

}
