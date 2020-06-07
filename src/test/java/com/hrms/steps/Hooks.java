package com.hrms.steps;

import com.hrms.testbase.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {

	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	@After
	public void end() {
		BaseClass.tearDown();
	}
}