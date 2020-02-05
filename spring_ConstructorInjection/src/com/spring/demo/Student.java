package com.spring.demo;

public class Student
{
	private String name;
	private int age;
	public Student()
	{
		System.out.println("default constructor called....");
	}
	public Student(String name,int age)
	{
		System.out.println("parameterized constructor called....");
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	

}
