package com.spring.basic;

public class Runner2 
{
	public static void main(String[] args) 
	{
		Scopes scope=new Scopes();
		
		Student s1=scope.prototype();
		Student s2=scope.prototype();
		System.out.println(s1==s2);
		
	
	}
	

}
