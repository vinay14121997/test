package com.jsp;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.Model.Address;
import com.jsp.Model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/employee.xml");
    	Employee employee=context.getBean("employee",Employee.class);
    	System.out.println(employee);
    	Employee employee2=context.getBean("employee1",Employee.class);
    	System.out.println(employee2);
    	
    }
}
