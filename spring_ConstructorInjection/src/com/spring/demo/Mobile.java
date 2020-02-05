package com.spring.demo;

public class Mobile
{
	private String name;
	private String brand;
	
	public Mobile( String name,String brand) 
	{
		this.name=name;
		this.brand=brand;
		
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + "]";
	}
	

}
