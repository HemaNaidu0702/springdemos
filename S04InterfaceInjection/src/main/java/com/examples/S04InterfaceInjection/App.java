package com.examples.S04InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S04InterfaceInjection.service.OrderService;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S04InterfaceInjection/springconfig.xml");
         
         // ask container for employee bean
         
        OrderService orderservice =   (OrderService) ctx.getBean("orderservice");
         System.out.println(orderservice);
    }
}
