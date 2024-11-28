package com.jsp.Model;

public class Student {
	
	private int id;
	private String name;
	private String emailid;
	private String password;
	private double percentage;
	private long mobilenumber;
	private String gender;
	
	public Student()
	{
		
	}

	public Student(int id, String name, String emailid, String password, double percentage, long mobilenumber,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.percentage = percentage;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
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
		return "Student [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password
				+ ", percentage=" + percentage + ", mobilenumber=" + mobilenumber + ", gender=" + gender + "]";
	}

	
	
	

}
