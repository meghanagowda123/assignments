package com.cts.service;

public class GreetServiceEnhancedImpl implements GreetService{
	
	public String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String greet(String userName) {
		return greeting+userName;
	}
	
	public GreetServiceEnhancedImpl() {
		super();
	}

	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}
}
