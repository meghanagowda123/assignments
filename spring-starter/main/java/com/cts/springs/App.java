package com.cts.springs;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main( String[] args ){
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("a.xml");
		Student stu = context.getBean("theStudent",Student.class);
		stu.person();
    	    }
}
