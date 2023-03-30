package com.examples.S04InterfaceInjection;

import org.springframework.stereotype.Component;

import com.examples.S04InterfaceInjection.dao.OrderDAO;

@Component("orderdaooracle")
public class OrderDaoOracleimpl implements OrderDAO {
	   @Override	
		public void createOrder(){
			System.out.println("Open connection to Oracle DB");
			System.out.println("Run insert statement on Oracle DB");
			System.out.println("Order created in Oracle DB");
		}
}
