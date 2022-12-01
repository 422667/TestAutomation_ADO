package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupPage extends ProjectSpecificMethods{
	
	
	

	@When("User enters the FirstName as {string}")
	public SignupPage user_enters_the_FirstName_as(String data) {

		clearAndType(locateElement(Locators.ID, "firstName"), data);
		reportStep(data+" entered successfully","pass");
		return this;
		
	}

	@When("User enters the LastName as {string}")
	public SignupPage user_enters_the_LastName_as(String data) {
		clearAndType(locateElement(Locators.ID, "lastName"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	@When("User enters the password as {string}")
	public SignupPage user_enters_the_password_as(String string) {
		
		clearAndType(locateElement(Locators.NAME, "Passwd"), string);
		reportStep(string+" entered successfully","pass");
		return this;
	   
	}

	@When("User click on the Checkbox")
	public SignupPage user_click_on_the_Checkbox() {
		
		click(locateElement(Locators.XPATH, "//input[@type='checkbox']"));
		reportStep("checkbox Button clicked successfully","pass");
		return this;
	  
	}
	
	

}
