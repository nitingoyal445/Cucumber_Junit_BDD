package com.capgemini.test;

import org.openqa.selenium.WebDriver;

import com.capgemini.pages.ProjectDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectSteps{

	ProjectDetails project;
	WebDriver driver;
	
	@Given("^that I have gone to Project\\.jsp page$")
	public void that_I_have_gone_to_Project_jsp_page() throws Throwable {
		project = new ProjectDetails();
	}

	@When("^I entered the Project Name \"(.*?)\"$")
	public void i_entered_the_Project_Name(String arg1) throws Throwable {
		project.setProjectName(arg1);
		Thread.sleep(1000);
	}

	@When("^I selected the platform \"(.*?)\"$")
	public void i_selected_the_platform(String arg1) throws Throwable {
		project.setPlatform(arg1);
		Thread.sleep(1000);
	}

	@When("^I clicked on the registration button$")
	public void i_clicked_on_the_registration_button() throws Throwable {
		project.setRegister(project.getRegister());
		Thread.sleep(1000);
	}

	@Then("^It will registered the Employee$")
	public void it_will_registered_the_Employee() throws Throwable {
		System.out.println("Employee Registered Successfully");
	}

}
