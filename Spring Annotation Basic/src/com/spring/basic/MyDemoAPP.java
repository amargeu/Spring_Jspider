package com.spring.basic;

import org.springframework.stereotype.Component;
//meta information for the container that pls create an object
//for this particular object of this class with you
@Component
//MyDemoApp myDemoApp=new MyDemoApp()
public class MyDemoAPP 
{
	public MyDemoAPP()
	{
		System.out.println("class is-->"+this.getClass().getName());
	}

}
