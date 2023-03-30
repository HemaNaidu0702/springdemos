package com.examples.S06SpringOrmDemo1;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringOrmDemo1.dao.ProductDao;
import com.examples.S06SpringOrmDemo1.entity.Product;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  // create();
    	 // update();
    	 // delete();
    	// find();
    	 findAll();
    }

	private static void findAll() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringOrmDemo1/springconfig.xml");
         
         ProductDao productDao =(ProductDao) ctx.getBean("productdao");
       
         
         List<Product> products =  productDao.findAll();
         System.out.println("Product found " + products);
	}
	
	private static void find() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringOrmDemo1/springconfig.xml");
         
         ProductDao productDao =(ProductDao) ctx.getBean("productdao");
       
         
         Product product =  productDao.find(5);
         System.out.println("Product found " + product);
	}
    
    
    
    
	private static void update() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringOrmDemo1/springconfig.xml");
         
         ProductDao productDao =(ProductDao) ctx.getBean("productdao");
         
         Product product = new Product();
         product.setId(1);
         product.setName("Computer");
         product.setDescription("Desktop computer");
         product.setPrice(1000.324);
         
          productDao.update(product);
         System.out.println("Product updated ");
	}
	
	private static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringOrmDemo1/springconfig.xml");
         
         ProductDao productDao =(ProductDao) ctx.getBean("productdao");
         
         Product product = new Product();
         product.setId(4);
         //product.setName("Speakers");
        // product.setDescription("samsung");
         // product.setPrice(90787);
         
         productDao.delete(product);
         System.out.println("Product deleted ");
	}
	
	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S06SpringOrmDemo1/springconfig.xml");
         
         ProductDao productDao =(ProductDao) ctx.getBean("productdao");
         
         Product product = new Product();
         product.setId(5);
         product.setName("printers");
         product.setDescription("samsung");
         product.setPrice(90787);
         
         int result = productDao.create(product);
         System.out.println("Product created " + result);
	}
}
