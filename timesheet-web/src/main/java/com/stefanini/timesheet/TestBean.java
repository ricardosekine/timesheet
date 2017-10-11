package com.stefanini.timesheet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class TestBean {
	
	@Autowired
	TestService testService;
	
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
	public String printMsgFromSpring() {
		return testService.getMessage();
	}

}
