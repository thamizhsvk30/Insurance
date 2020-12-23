package com.insurence.stepdefination;

import com.insurence.commonaction.Comaction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Comaction{

	Comaction ca = new Comaction();
	
	
	@Before
	public void before() throws Throwable {
		ca.launch("https://www.travelers.com/");
		System.out.println("User launches application");
	}
	
	@After()
	public void after(Scenario scenario)  
	{
		ca.closeBrowser();
	}
}
