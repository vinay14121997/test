package com.jsp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class EmployeeConfig {
	@Bean
	public DriverManagerDataSource  driverManagerDataSourceBean()
	{
      DriverManagerDataSource dmd=new DriverManagerDataSource();
      dmd.setUrl("jdbc:mysql://localhost:3306/teca6061?");
      dmd.setUsername("root");
      dmd.setPassword("12345");
      dmd.setDriverClassName("com.mysql.cj.jdbc.Driver");
      return dmd;
	}
	@Bean
	public  JdbcTemplate jdbcTempletBean()
	{
		JdbcTemplate jdbc=new JdbcTemplate(driverManagerDataSourceBean());
		return jdbc;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
