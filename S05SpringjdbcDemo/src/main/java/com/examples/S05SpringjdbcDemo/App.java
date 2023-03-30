package com.examples.S05SpringjdbcDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.examples.S05SpringjdbcDemo.dao.EmployeeDAO;
import com.examples.S05SpringjdbcDemo.entity.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        create();
        //update();
        // delete();
       // readOneEmployee();
        readAllEmployees();
    }
    
    
    

	private static void readAllEmployees() {
	       
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
        
        EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
        
       List<Employee> employees = employeeDao.read();
   	System.out.println(employees);
		
	}




	private static void readOneEmployee() {
	System.out.println( "JDBC Template Demo" );
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
        
        EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
        
       Employee employee = employeeDao.read(1);
   	System.out.println(employee);
		
	}




	private static void create() {
		System.out.println( "JDBC Template Demo" );
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
        
        EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
        
        Employee emp = new Employee();
        
        emp.setId(2);
        emp.setFirstName("Raj");
        emp.setLastName("Koothrapalli");
        
        employeeDao.create(emp);
	}
	
	private static void update() {
		System.out.println( "JDBC Template Demo" );
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
        
        EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
        
        Employee emp = new Employee();
        
        emp.setId(2);
        emp.setFirstName("Raj");
        emp.setLastName("Ramayan");
        
        employeeDao.update(emp);
	}
	
	private static void delete() {
		System.out.println( "JDBC Template Demo" );
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringjdbcDemo/springconfig.xml");
        
        EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
        
       
        
        employeeDao.delete(2);
	}
}
