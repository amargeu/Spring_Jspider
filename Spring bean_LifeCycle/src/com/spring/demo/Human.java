package com.spring.demo;

public class Human 
{
	public Human() 
	{
		System.out.println("Object instantion Phase ");
	}
	//init-method
	public void giveName()
	{
		System.out.println("giving name/init phase");
	}
	//destroy method
	public void death()
	{
		System.out.println("death/destroy phase");
	}

}
