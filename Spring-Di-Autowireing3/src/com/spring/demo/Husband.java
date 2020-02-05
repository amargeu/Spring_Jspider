package com.spring.demo;

public class Husband 
{
		private String name;
		private Wife wife;

		public Husband() {
			System.out.println("Husband create");
		}
	
		public Husband(String name, Wife wife) 
		{
			System.out.println("-----parameterized constructor of Husband");
			this.name = name;
			this.wife = wife;
		}

		@Override
		public String toString() {
			return "Husband [name=" + name + ", wife=" + wife + "]";
		}

	

	

}
