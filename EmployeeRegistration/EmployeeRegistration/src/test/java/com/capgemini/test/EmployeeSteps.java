package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.capgemini.base.TestBase;
import com.capgemini.pages.PersonalDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeSteps extends TestBase{

	PersonalDetails employee;
	WebDriver driver;
	
	public EmployeeSteps() {
	
		// TODO Auto-generated constructor stub
		initialization();
	}
	
	@Given("^that I have gone to Employee_Registration_form\\.jsp page$")
	public void that_I_have_gone_to_Employee_Registration_form_jsp_page() throws Throwable {
	    employee = new PersonalDetails();
	}

	@When("^I entered employee Num \"(.*?)\"$")
	public void i_entered_employee_Num(String arg1) throws Throwable {
	    employee.setEmployeeNumber(arg1);
	    Thread.sleep(1000);
	}

	@When("^I entered employee Name \"(.*?)\"$")
	public void i_entered_employee_Name(String arg1) throws Throwable {
	   employee.setEmployeeName(arg1);
	   Thread.sleep(1000);
	}

	@When("^I selected the state \"(.*?)\"$")
	public void i_selected_the_state(String arg1) throws Throwable {
	    employee.setState(arg1);
	    Thread.sleep(1000);
	}

	@When("^I selected the City \"(.*?)\"$")
	public void i_selected_the_City(String arg1) throws Throwable {
	   employee.setCity(arg1);
	   Thread.sleep(1000);
	}

	@When("^I click on the next link$")
	public void i_click_on_the_next_link() throws Throwable {
	   employee.setNext(employee.getNext());
	   Thread.sleep(1000);
	}

	@Then("^It will redirect to the Project\\.jsp file and title is \"(.*?)\"$")
	public void it_will_redirect_to_the_Project_jsp_file_and_title_is(String title) throws Throwable {
		assertEquals(title, employee.getTitles());
	}
	
	
}
