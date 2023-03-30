package com.examples.S03stereotypes.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
 
@Value("Chennai")
private String city;

@Value("TN")
private String state;

@Value("876798")
private String pincode;

@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}


}


