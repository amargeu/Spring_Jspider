package com.spring.demo;

public class Tree 
{
	private String name;
	private int age;
	private String type;
	
	public Tree() 
	{
System.out.println("object is created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Tree [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	

}
