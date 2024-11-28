package com.jsp.DAO;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entity.UserInformation;

public class UserDAOimpl  implements UserDAO{

	
	public void insertUserInformationObject() {
	
		EntityManagerFactory managerfactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerfactory .createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		// toBegin
		transaction.begin();
		UserInformation userinformation=new UserInformation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your firstname");
		userinformation.setFirstname(sc.next());
		System.out.println("Enter your lastname");
		userinformation.setLastname(sc.next());
		System.out.println("Enter your Gender");
		userinformation.setGender(sc.next());
		System.out.println("Enter your emalid");
		userinformation.setEmailid(sc.next());
		System.out.println("Enter your Mobilenumber");
		userinformation.setMobilenumber(sc.nextLong());
		System.out.println("Enter your password");
		userinformation.setpassword(sc.next());
		
		//operation
		//To perform insertion
		manager.persist(userinformation);
		System.out.println("Data Inserted......");
		// to Commit
		transaction.commit();
		// to Close the platform
		manager.close();
		//to Close the Connection
		managerfactory.close();
	}

	
	public void selectUserInformationusingUserId(int userid) {
	
		EntityManagerFactory managerfactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerfactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInformation userinformation=manager.find(UserInformation.class,userid);
		if(userinformation!=null)
		{
			System.out.println("UserFirstname:"+userinformation.getFirstname());
			System.out.println("UserLastname:"+userinformation.getLastname());
			System.out.println("Useremailid:"+userinformation.getEmailid());
			System.out.println("UserMobilenumber:"+userinformation.getMobilenumber());
			
		}
		else
		{
			System.out.println("No data found......!");
		}
		
	}


	
	public void UpdateuserPasswordByUsingid(int userid, String password) {
		EntityManagerFactory managerFactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInformation userinformation=manager.find(UserInformation.class, userid);
		if(userinformation!=null)
		{
			userinformation.setpassword(password);
			System.out.println("Password updated");		
	
		}
		else
		{
			System.out.println(" No Data Found ");
		}
		transaction.commit();
		
	}


	
	public void deleteuserdetailsbyusingid(int id) {
		
		EntityManagerFactory managerFactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInformation userInformation=manager.find(UserInformation.class, id);
		if(userInformation!=null)
		{
			manager.remove(userInformation);
			System.out.println("Details Deleted.....!");
		}
		else
		{
			System.out.println("Data not Found....!");
		}
		transaction.commit();	
	}


	@Override
	public void updatepasswordusingemailid(String password, String emailid) {
		String JPQLupdate=
				"update UserInformation userinfo set "
				+ " userinfo.password=?1 where userinfo.emailid=?2";
	
		EntityManagerFactory managerFactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		Query query=manager.createQuery(JPQLupdate);
		query.setParameter(1,password);
		query.setParameter(2, emailid);
		int result=query.executeUpdate();
		System.out.println(query);
		System.out.println(result);
		transaction.commit();
		
	}


	
	public void deletetheuserdetailsbyusingmobilenumber(long mobilenumber) {
		String JPQL="delete from UserInformation"
				+ " info where info.mobilenumber=?1";
		EntityManagerFactory managerFactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query=manager.createQuery(JPQL);
		query.setParameter(1,mobilenumber);
		int result=query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		
	}



	public void selecttheuserdetailsbyusinguserid(int id) {
		String select="select  user from UserInformation"
				+ " user where user.userid=:raghu";
		EntityManagerFactory managerFactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query=manager.createQuery(select);
		query.setParameter("raghu", id);
		try {
			//Acc to the query if we single result is not present in the data base
			UserInformation userinformation=(UserInformation) query.getSingleResult();//downcast to object calss
			System.out.println("user Firstname:"+userinformation.getFirstname());
			System.out.println("user lastname:"+userinformation.getLastname());
			System.out.println("user mobilenumber:"+userinformation.getMobilenumber());
		}
		catch (Exception e) {
			
			System.out.println("No Data Found....! ");
		}
		
	}



	public void selecttheuserdetailsusinggender(String gender) {
		
		String select="select  user from UserInformation"
				+ " user where user.gender=?1";
		EntityManagerFactory managerFactory=
				Persistence.createEntityManagerFactory("FirstMavenProject");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query=manager.createQuery(select);
		query.setParameter(1,gender);
	List<UserInformation> li=query.getResultList();
	for( UserInformation userinformation:li)
	{
		System.out.println("user Firstname:"+userinformation.getFirstname());
		System.out.println("user lastname:"+userinformation.getLastname());
		System.out.println("user mobilenumber:"+userinformation.getMobilenumber());
	}
		
		
	}

}
