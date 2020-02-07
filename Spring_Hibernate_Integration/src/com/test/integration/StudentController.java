package com.test.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController 
{
	
	public StudentController() {
     System.out.println("student container created");
}
	@Autowired
	StudentDao dao;
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	String saveStudent(Student student)
	{
		System.out.println(student);
		dao.saveStudent(student);
		
		return "index";
	}

}
