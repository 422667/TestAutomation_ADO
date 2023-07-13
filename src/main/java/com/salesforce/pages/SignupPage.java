package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupPage extends ProjectSpecificMethods{
	

	
	

@Given("user is on the gmail signup page")
public void user_is_on_the_gmail_signup_page() {
   
}

@When("user enters the Firstname as {string}")
public SignupPage user_enters_the_Firstname_as(String arg1) {
	clearAndType(locateElement(Locators.ID,"firstName"), arg1);
	reportStep(arg1+" entered successfully","pass");
	return this;
	
}

@When("user enters the Lastname as {string}")
public SignupPage user_enters_the_Lastname_as(String arg1) {
	clearAndType(locateElement(Locators.ID,"lastName"), arg1);
	reportStep(arg1+" entered successfully","pass");
	return this;
}

@When("user click on the next button")
public SignupPage user_click_on_the_next_button() {
    click(Locators.XPATH, "//span[text()='Next']");
    reportStep("Login button clicked successfully", "pass");
	return this;
}

@When("user selects the bday month as {string}")
public void user_selects_the_bday_month_as(String string) {

}

@When("user enters the date as {string}and year as {string}")
public void user_enters_the_date_as_and_year_as(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("user click on the preferred email in the list")
public void user_click_on_the_preferred_email_in_the_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
	
	
	
	
	
	
	
	

}
