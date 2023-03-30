package com.examples.S05SpringjdbcDemo.dao;

import java.util.List;

import com.examples.S05SpringjdbcDemo.entity.Employee;

public interface EmployeeDAO {
   int create(Employee employee);
   
   int update(Employee employee);
   
   int delete(int id);
   
   Employee read(int id);
   
   List<Employee> read();
}
