package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args)
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");
		
	Water bisleri=container.getBean("bisleri",Water.class);
	System.out.println(bisleri);
	
	Fish fish=container.getBean("shark",Fish.class);
	System.out.println(fish);
		
		
	
		
	}

}
