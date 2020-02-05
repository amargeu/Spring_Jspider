package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataBaseDao 
{
	public MySqlDataBaseDao() 
	{
		System.out.println("class is-->"+this.getClass().getName());
	}

}
