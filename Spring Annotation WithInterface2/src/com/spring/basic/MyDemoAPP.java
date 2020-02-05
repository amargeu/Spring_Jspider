package com.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDemoAPP 
{
	
	@Autowired
	Dao  mongoDbDao ;  
	// Dao mySqlDao;
	public void save()
	 {
		 mongoDbDao.save();//method chaining
		// mySqlDao.save();
	 }
	


}
