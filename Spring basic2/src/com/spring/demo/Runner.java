package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args)
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");
		
		//when only one object of particular class in container space
		/*Laptop l1=container.getBean(Laptop.class); 
		l1.laptopOn();
		l1.laptopOff();*/
		
		
		//it return Object type object So need down casting
	    /* Laptop	l2=(Laptop) container.getBean("l1");
	      l2.laptopOn();
	      l2.laptopOn();*/
		
	//benificial getBean()
		Laptop l3=container.getBean("l1",Laptop.class);
		l3.laptopOff();
		l3.laptopOn();
		
		
	}

}
