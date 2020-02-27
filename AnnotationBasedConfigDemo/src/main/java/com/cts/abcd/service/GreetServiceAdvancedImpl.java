package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cts.service.GreetNoteProvider;

public class GreetServiceAdvancedImpl implements GreetNoteProvider{
	public String greet(String userName) {
		return gmp.getGreetNote()+userName;
	}
	
	@Autowired
	@Qualifier("g4")
	private  GreetNoteProvider gmp;

	public void GreetNote() {
		
	}

	public GreetNoteProvider getGmp() {
		return gmp;
	}

	public void setGmp(GreetNoteProvider gmp) {
		this.gmp = gmp;
	}

	public String getGreetNote() {
		// TODO Auto-generated method stub
		return null;
	}

	public GreetServiceAdvancedImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}