package com.spring.demo;

public class Wife 
{
	private String name;

	
	public Wife(String name) {
		System.out.println("----parameterized constructor of husband---");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + "]";
	}

	public Wife() {
		System.out.println("Wife created");
	}

}
