package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class MySqlDao implements Dao
{

	@Override
	public void save() {
         System.out.println("Mysql Database used to save");		
	}
	
	

}
