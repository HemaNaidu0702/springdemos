package com.examples.S04InterfaceInjection;

import org.springframework.stereotype.Component;

import com.examples.S04InterfaceInjection.dao.OrderDAO;

@Component("orderdaomysql")
public class OrderDaoMySQLimpl implements OrderDAO{
  
    @Override	
	public void createOrder(){
		System.out.println("Open connection to MYSQL DB");
		System.out.println("Run insert statement on MYSQL DB");
		System.out.println("Order created in MYSQL DB");
	}
}
