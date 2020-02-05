package com.spring.basic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.metadata.GenericTableMetaDataProvider;

public class Runner 
{
	public static void main(String[] args) 
	{
		ApplicationContext  container=new  ClassPathXmlApplicationContext("Spring-core.xml");
		
		System.out.println("container created");
		
	    Husband husband=container.getBean(Husband.class);
	    husband.eatFood();
	   

		
		
	  
	
	}

}
