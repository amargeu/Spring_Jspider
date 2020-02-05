package com.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Husband 
{
	
	@Autowired @Qualifier("wife")
	Ifemail femail ;  
	public void eatFood()
	 {
		 femail.cookFood();
	 }
	


}
