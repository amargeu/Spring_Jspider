package com.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyDemoAPP 
{
	
    @Autowired @Qualifier("mongoDbDao")// @Qualifier("mySqlDbDao")
	Dao dao;
	
	public void save()
	 {
		 dao.save();//method chaining
	 }
	


}
