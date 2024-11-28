package com.jsp;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.Model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/sample.xml");
    	int count=context.getBeanDefinitionCount();
       // System.out.println(count);
        //String[] names=context.getBeanDefinitionNames();
        //for(String string:names)
      Employee employee=(Employee) context.getBean("emp");
      employee.setId(101);
      employee.setDeptno(10);
      employee.setSalary(35000);
      employee.setName("Vinay");
      System.out.println(employee);
      //without downcasting objectclass to EmployeeClass
      Employee employee2=context.getBean("emp",Employee.class);
      employee2.setDeptno(20);
      employee2.setId(102);
      employee2.setSalary(65000);
      employee2.setName("saipilla");
      System.out.println(employee2);
      Employee employee3=context.getBean(Employee.class);
      employee3.setId(103);
      employee3.setDeptno(30);
      employee3.setSalary(45000);
      employee3.setName("raghupilla");
      System.out.println(employee3);
      
        
    }
}
