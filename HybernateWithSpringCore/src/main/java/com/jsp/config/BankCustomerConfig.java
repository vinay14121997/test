package com.jsp.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankCustomerConfig {
	 @Bean
	 public EntityManagerFactory entitymanagerFactoryBean()
	 {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("HybernateWithSpringCore");
		return factory;
	 }
	 @Bean
	 public EntityManager entityManagerBean()
	 {
		 EntityManager manager=entitymanagerFactoryBean().createEntityManager();
		 return manager;
	 }
	 @Bean
	 public EntityTransaction transactionBean()
	 {
		 EntityTransaction transaction=entityManagerBean().getTransaction();
		 return transaction;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
