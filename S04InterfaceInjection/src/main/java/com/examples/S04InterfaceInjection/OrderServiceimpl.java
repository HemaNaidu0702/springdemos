package com.examples.S04InterfaceInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.examples.S04InterfaceInjection.dao.OrderDAO;
import com.examples.S04InterfaceInjection.service.OrderService;

public class OrderServiceimpl implements OrderService{
	
	
	@Autowired
	@Qualifier("orderdaooracle")
	private OrderDAO orderdao;
	
	@Override
	public void placeOrder(){
		System.out.println("Open connection to Oracle DB");
		System.out.println("Run insert statement on Oracle DB");
		orderdao.createOrder();
	}
}
