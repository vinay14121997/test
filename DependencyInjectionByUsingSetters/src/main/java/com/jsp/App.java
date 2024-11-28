package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.Model.Engine;
import com.jsp.Model.Vechile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/File/vechile.xml");
      Vechile vechile=context.getBean(Vechile.class);
      System.out.println(vechile);
      Engine engine = context.getBean(Engine.class);
       System.out.println(engine);
      
    	
    	
    }
}
