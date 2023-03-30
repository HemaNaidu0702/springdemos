package com.examples.S02Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S02Autowiring/springconfig.xml");
         
         // ask container for employee bean
         
        Employee emp=  (Employee) ctx.getBean("emp");
         System.out.println(emp);
         
    }
}
