package com.test.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController 
{
	public WelcomeController()
	{
		System.out.println(" welcome controller created");
	}
	@RequestMapping("/welcome")
	public ModelAndView sayWelcome()
	{
		System.out.println("welcome method called");
		
		return new ModelAndView("index.jsp");
	}
	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		System.out.println("Hello method called");
		
		return  new ModelAndView("index.jsp");
	}
	
	/*@RequestMapping("/login")
	public ModelAndView login(@RequestParam String userName,@RequestParam String password)
	{
		System.out.println("welcome method called");
		System.out.println("user name: "+userName);
		System.out.println("password : "+password);
		
		return  new ModelAndView("index.jsp");
	}*/
	//redirecting the data on another page data.jsp
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String userName,@RequestParam String password)
	{
		ModelAndView mv= new ModelAndView("data.jsp");
		mv.addObject("un", userName);
		mv.addObject("pw", password);
		
		return mv;
	}
	
	

}
