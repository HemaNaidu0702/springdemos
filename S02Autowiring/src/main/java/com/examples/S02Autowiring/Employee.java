package com.examples.S02Autowiring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
 int id;
 String name;
 

 private Address address;
 
 @Autowired
public Employee(Address address) {
	super();
	this.address = address;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}


}
