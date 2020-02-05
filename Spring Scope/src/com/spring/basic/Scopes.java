package com.spring.basic;
//dummy code 
public class Scopes 
{
	private static final Student s=new Student();
	Student singleton()
	{
	return s;
    }
	Student prototype()
	{
		Student s=new Student();
		return s;
	}

}
