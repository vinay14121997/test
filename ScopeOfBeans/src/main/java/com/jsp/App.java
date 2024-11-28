package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.Model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/studentinfo.xml");
       Student student=context.getBean(Student.class);
       student.setName("singer.Raghu");
       student.setGender("female");
       student.setId(143);
       System.out.println(student);
       Student student1=context.getBean(Student.class);
       student1.setName("sai.pilla");
       student1.setGender("female");
       student1.setId(142);
       System.out.println(student1);
       System.out.println(student.hashCode());
       System.out.println(student1.hashCode());
    }
}
