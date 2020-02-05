package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args)
	{
		//ApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
		
		AbstractApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");
		
	     Human ram=container.getBean(Human.class);
	     
	     System.out.println("container being destroy");
	     container.close();
	     System.out.println("container destroyed");
		
		
	}

}
