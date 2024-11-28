package org.jsp.Entity;

import java.time.LocalDate;

public class CustomerInformation {
	
	private String name;
	private String emailid;
	private long mobilenumber;
	private String password;
	private int age;
	private LocalDate dob;
	private String address;
	private long uidno;
	
	public CustomerInformation()
	{
		
	}
	public CustomerInformation(String name, String emailid, long mobilenumber, String password, int age, LocalDate dob,
			String address, long uidno) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.age = age;
		this.dob = dob;
		this.address = address;
		this.uidno = uidno;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getUidno() {
		return uidno;
	}

	public void setUidno(long uidno) {
		this.uidno = uidno;
	}


	@Override
	public String toString() {
		return "CustomerInformation [name=" + name + ", emailid=" + emailid + ", mobilenumber=" + mobilenumber
				+ ", password=" + password + ", age=" + age + ", dob=" + dob + ", address=" + address + ", uidno="
				+ uidno + "]";
	}
	

}
