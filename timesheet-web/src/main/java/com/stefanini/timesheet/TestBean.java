package com.stefanini.timesheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class TestBean {
	
	@Autowired
	TestService testService;
	private String hello;
	
	public String printMsgFromSpring() {
		return "Hello World - Spring + JSF 2!!!";
	}
	
	public void callNewMessage() {
		this.hello = this.testService.getMessage();
	}
	
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
