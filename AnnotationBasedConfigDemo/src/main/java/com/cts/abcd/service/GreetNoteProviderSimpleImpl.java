package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cts.service.GreetNoteProvider;
@Component("g3")
//@Primary

public class GreetNoteProviderSimpleImpl implements GreetNoteProvider {

	public String getGreet(String userName) {
		return "hello"+userName;

	}

	public String getGreetNote() {
		// TODO Auto-generated method stub
		return null;
	}

}
