package com.lti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Student;
import com.lti.service.StudentBO;

public class App 
{
	private static StudentBO studBO;
	private static ApplicationContext context; 
	
	
    public static void main( String[] args )
    {
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        studBO=context.getBean(StudentBO.class);
        
        Student s1=new Student(102, "Kate", "F", "Mumbai");
        
        studBO.saveStudent(s1);
        
        System.out.println("Application Worked");
    }
}
