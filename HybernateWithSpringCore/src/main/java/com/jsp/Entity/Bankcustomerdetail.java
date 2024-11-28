package com.jsp.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bankcustomerdetails database table.
 * 
 */
@Entity
@Table(name="bankcustomerdetails")
@NamedQuery(name="Bankcustomerdetail.findAll", query="SELECT b FROM Bankcustomerdetail b")
public class Bankcustomerdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int userId;

	private String accountnumber;

	private double amount;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String emailid;

	private String firstname;

	private String gender;

	private String lastname;

	public Bankcustomerdetail() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAccountnumber() {
		return this.accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}