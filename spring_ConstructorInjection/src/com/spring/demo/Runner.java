package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args)
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");
		
		Student std=container.getBean("ram",Student.class);
		System.out.println(std);
		Mobile mobile=container.getBean("m1",Mobile.class);
		System.out.println(mobile);
		
		
		
	
		
	}

}
