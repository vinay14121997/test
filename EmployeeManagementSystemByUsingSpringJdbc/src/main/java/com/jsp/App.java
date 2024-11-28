package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Config.EmployeeConfig;
import com.jsp.DAO.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new 
        		AnnotationConfigApplicationContext(EmployeeConfig.class);
        EmployeeDAO employeedao=context.getBean(EmployeeDAO.class);
        employeedao.insertEmployeedetials();
        
        
    }
}
