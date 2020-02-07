package com.test.integration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentDao 
{
	@Autowired
	private SessionFactory factory;
	public int saveStudent(Student student)
	{
		int id=0;
		try(Session session=factory.openSession())
		{
			Transaction transaction=session.beginTransaction();
			id=(int) session.save(student);
			transaction.commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return id;
	}
	
	

}
