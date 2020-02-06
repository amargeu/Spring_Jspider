package com.demo.serch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SearchController 
{
	@RequestMapping("/search/{rollno}")
	ModelAndView searchStudent(@PathVariable String rollno)
	{
	  String student="";
	  
	  Map<String,String>tempdata=new HashMap<String,String>();
	  tempdata.put("1", "Ram");
	  tempdata.put("2", "shyam");
	  tempdata.put("3", "soumen");
	  tempdata.put("4", "kaushik");

		ModelAndView mv=new ModelAndView("data");
		if(tempdata.containsKey(rollno)) {
			student=tempdata.get(rollno);
			mv.addObject("std",student);
		}
		
		
		return mv;
		
	}

}
