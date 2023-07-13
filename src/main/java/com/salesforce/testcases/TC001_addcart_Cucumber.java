package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/addcart.feature", glue= {"com.salesforce.pages"}, monochrome=true)
public class TC001_addcart_Cucumber extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifySignup";
		testDescription ="Verify Signup functionality";
		authors="RK";
		category ="Regression";
		
	}
	
	

}
