package com.examples.S07SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVCDemo.model.Employee;

@Controller
public class HelloController {
     
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("id", 123);
		modelView.addObject("name", "Ken");
		modelView.addObject("salary", 1000);
		
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/readobject")
	public ModelAndView read2() {
		ModelAndView modelView = new ModelAndView();
		
	    Employee emp = new Employee();
	    emp.setId(1);
	    emp.setName("Max");
	    emp.setSalary(67887);
	    
	    modelView.addObject("employee", emp);
	    modelView.setViewName("hello");
		
		return modelView;
	}
	
	
	@RequestMapping("/employees")
	public ModelAndView read3() {
		ModelAndView modelView = new ModelAndView();
		
	    List<Employee> employees = new ArrayList<>();
	    Employee emp1 = new Employee();
	    
	    emp1.setId(1);
	    emp1.setName("Max");
	    emp1.setSalary(67887);
	    employees.add(emp1);
	    
	    emp1 = new Employee();
	    emp1.setId(2);
	    emp1.setName("Maxwell");
	    emp1.setSalary(33287);
	    employees.add(emp1);
	    
	    emp1 = new Employee();
	    emp1.setId(3);
	    emp1.setName("Jo");
	    emp1.setSalary(9898);
	    employees.add(emp1);
	    
	    
	    modelView.addObject("employees", employees);
	    modelView.setViewName("employees");
		
		return modelView;
	}
	
	
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {
		
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("id", id);
		modelView.addObject("name", name);
	
		
		modelView.setViewName("showdata");
		return modelView;
	}
}
