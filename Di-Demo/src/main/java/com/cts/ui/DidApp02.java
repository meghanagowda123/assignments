package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetService;
import com.cts.service.GreetServiceAdvancedImpl;
import com.cts.service.GreetServiceEnhancedImpl;

public class DidApp02 {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		GreetServiceEnhancedImpl gs2= (GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs2.greet(" megha"));
		GreetServiceEnhancedImpl gs3= (GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs2.greet("Vonakam"));
		GreetServiceEnhancedImpl gs4= (GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs4.greet("Vonakam"));
		GreetServiceAdvancedImpl gs= (GreetServiceAdvancedImpl) context.getBean("g3");
		System.out.println(gs4.greet("Mysore"));
	}
}
