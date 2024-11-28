package com.jsp.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Entity.Bankcustomerdetail;
@Component
public class BankCustomerDAOimpl implements BankCustomerDAO {
	@Autowired
  EntityManager manager;
	@Autowired
  EntityTransaction transaction;
	
	public void insertBankCoustomerDetails() {
		
		Bankcustomerdetail bankdetails=new Bankcustomerdetail();
		bankdetails.setFirstname("vinay");
		bankdetails.setLastname("gopalapuram");
		bankdetails.setEmailid("vinay@1412gmail.com");
		bankdetails.setAccountnumber("62349374559");
		bankdetails.setGender("male");
		bankdetails.setDob(1997);
		bankdetails.setAmount(25000.00);
		transaction.begin();
		 manager.persist(bankdetails);
		 System.out.println("data inserted");
		 transaction.commit();
		 manager.close();
		
		
		
		
		
	
		
	}

	@Override
	public void insertBankCustomerDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectBankCustomerDetailsByUsingId() {
		// TODO Auto-generated method stub
		
	}

}
