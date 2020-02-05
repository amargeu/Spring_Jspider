package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class Wife implements Ifemail
{

	@Override
	public void cookFood() {
System.out.println("food cook by wife");		
	}


	

}
