package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupPage extends ProjectSpecificMethods{
	
	
	@Given("User enter the Firstname as {string}")
	public  SignupPage user_enter_the_Firstname_as(String data) {
		
		clearAndType(locateElement(Locators.ID, "firstName"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	@Given("User enter the Lastname as {string}")
	public SignupPage user_enter_the_Lastname_as(String data) {
		clearAndType(locateElement(Locators.ID, "lastName"), data);
		reportStep(data+" entered successfully","pass");
		return this;
		
	}

	@Given("User enter the username as {string}")
	public SignupPage user_enter_the_username_as(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	@Given("User enter the password as {string}")
	public SignupPage user_enter_the_password_as(String data) {
		clearAndType(locateElement(Locators.NAME, "Passwd"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	@Given("User enter the confirm password as {string}")
	public SignupPage user_enter_the_confirm_password_as(String data) {
		clearAndType(locateElement(Locators.NAME, "ConfirmPasswd"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	@Given("User click on the checkbox")
	public SignupPage user_click_on_the_checkbox() {
	   click(locateElement(Locators.XPATH, "//input[@type='checkbox']"));
	   reportStep("Show password checkbox clicked successfully","pass");
	   return this;
	}

	@Given("User click on the Next button")
	public MobileverificationPage user_click_on_the_Next_button() {
		click(locateElement(Locators.XPATH, "//span[text()='Next']"));
		reportStep("Next Button clicked successfully","pass");
		return new MobileverificationPage();
	}



	
	
	

}
