package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDao  implements Dao
{

	@Override
	public void save()
	{
		System.out.println("MongoDb DataBase used to save");
		
	}
	

}
