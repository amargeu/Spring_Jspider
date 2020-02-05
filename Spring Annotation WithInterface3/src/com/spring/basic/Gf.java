package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class Gf  implements Ifemail
{
	@Override
	public void cookFood() {
		System.out.println("food cooked by gf");
	}
	

}
