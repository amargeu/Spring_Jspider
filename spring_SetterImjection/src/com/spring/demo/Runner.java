package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args)
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");
		Tree tree=container.getBean("mango",Tree.class);
		System.out.println(tree);
		
	}

}
