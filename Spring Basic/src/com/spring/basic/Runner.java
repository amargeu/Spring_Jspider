package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner 
{
	public static void main(String[] args) 
	{
		//create Spring container
		//step1
		ApplicationContext  container=new  ClassPathXmlApplicationContext("Spring-core.xml");
		//add Spring-core.xml in src folder
		//as class path starts from the src folder
		//we config the class path if we want
		System.out.println("container created");
		
		Student student=container.getBean("std",Student.class);
		
		//getBean() overridden helper method
		student.study();
	
	}

}
